package br.com.oncast.bam.xyzmo;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.StringWriter;
import java.rmi.RemoteException;

import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import management.webservicenative.inputinterface.server.xyzmo.com.ManagementServiceNativeStub;
import management.webservicenative.inputinterface.server.xyzmo.com.ManagementServiceNativeStub.DisposeDocument;
import management.webservicenative.inputinterface.server.xyzmo.com.ManagementServiceNativeStub.DisposeDocumentResponse;
import management.webservicenative.inputinterface.server.xyzmo.com.ManagementServiceNativeStub.DisposeDocumentResult;
import management.webservicenative.inputinterface.server.xyzmo.com.ManagementServiceNativeStub.GetActivities;
import management.webservicenative.inputinterface.server.xyzmo.com.ManagementServiceNativeStub.GetActivitiesResponse;
import management.webservicenative.inputinterface.server.xyzmo.com.ManagementServiceNativeStub.GetActivityConfigurationTemplate;
import management.webservicenative.inputinterface.server.xyzmo.com.ManagementServiceNativeStub.GetActivityConfigurationTemplateResponse;
import management.webservicenative.inputinterface.server.xyzmo.com.ManagementServiceNativeStub.UploadDocument;
import management.webservicenative.inputinterface.server.xyzmo.com.ManagementServiceNativeStub.UploadDocumentResponse;
import management.webservicenative.inputinterface.server.xyzmo.com.ManagementServiceNativeStub.UploadDocumentResult;

import org.apache.axis2.AxisFault;
import org.apache.axis2.databinding.types.UnsignedInt;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import sign.webservicenativeprototype.inputinterface.server.xyzmo.com.SignServiceNativeStub;
import sign.webservicenativeprototype.inputinterface.server.xyzmo.com.SignServiceNativeStub.ArrayOfFileContainer;
import sign.webservicenativeprototype.inputinterface.server.xyzmo.com.SignServiceNativeStub.ArrayOfProcessResult;
import sign.webservicenativeprototype.inputinterface.server.xyzmo.com.SignServiceNativeStub.FileContainer;
import sign.webservicenativeprototype.inputinterface.server.xyzmo.com.SignServiceNativeStub.ProcessResponse;
import sign.webservicenativeprototype.inputinterface.server.xyzmo.com.SignServiceNativeStub.ProcessResult;

public class XyzmoWebServiceNative {

	ManagementServiceNativeStub managementStub;
	SignServiceNativeStub signStub;

	public XyzmoWebServiceNative() {
		try {
			managementStub = new ManagementServiceNativeStub();
			signStub = new SignServiceNativeStub();
		} catch (AxisFault e) {
			e.printStackTrace();
		}
	}

	public String[] getAvailableActivities() throws RemoteException {
		GetActivities gA = new GetActivities();
		GetActivitiesResponse resGetAct = managementStub.getActivities(gA);
		ManagementServiceNativeStub.ArrayOfString activities = resGetAct.getGetActivitiesResult();
		return activities.getString();
	}

	public String getActivityConfigurationTemplate(String activityOfInterest) throws RemoteException {
		GetActivityConfigurationTemplate template = new GetActivityConfigurationTemplate();
		template.setActivity(activityOfInterest);
		GetActivityConfigurationTemplateResponse resGetConfig =	managementStub.getActivityConfigurationTemplate(template);
		return resGetConfig.getGetActivityConfigurationTemplateResult();
	}

	public String modifyConfiguration(String activityConfiguration) throws Exception {
		// modify the given XML configuration template by adding individual values
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder document = factory.newDocumentBuilder();
		Document doc = document.parse(new ByteArrayInputStream(activityConfiguration.getBytes()));
		
		// edit the horizontal margin of the xyzmo seal
		NodeList nodes = doc.getElementsByTagName("positionHorizontalMargin");
		Node toChange = nodes.item(0);
		Element toAdd = doc.createElement("positionHorizontalMargin");
		toAdd.appendChild(doc.createTextNode("100"));
		Node parent = toChange.getParentNode();
		parent.replaceChild(toAdd, toChange);
		
		// edit the vertical margin of the xyzmo seal
		nodes = doc.getElementsByTagName("positionVerticalMargin");
		toChange = nodes.item(0);
		toAdd = doc.createElement("positionVerticalMargin");
		toAdd.appendChild(doc.createTextNode("100"));
		parent = toChange.getParentNode();
		parent.replaceChild(toAdd, toChange);
		
		// rewrite xml-documtent as string
		Transformer transform = TransformerFactory.newInstance().newTransformer();
		StreamResult result = new StreamResult(new StringWriter());
		DOMSource source = new DOMSource(doc);
		transform.transform(source, result);
		return result.getWriter().toString();
	}

	public String uploadDocument(String documentoToUpload) throws RemoteException {
		// read the document to sign from a location
		File file = new File(documentoToUpload);
		
		// create a file container for uploading to the SIGNificant Server
		ManagementServiceNativeStub.FileContainer container = new
		ManagementServiceNativeStub.FileContainer();
		FileDataSource filedata = new FileDataSource(file);
		DataHandler handler = new DataHandler(filedata);
		container.setSourceFileName(file.getName());
		
		container.setSourceFileContent(handler);
		
		// upload the document to sign, add a timespan how long the server should make available the document
		UploadDocument uploadDoc = new UploadDocument();
		uploadDoc.setDocument(container);
		uploadDoc.setTimeSpan(new UnsignedInt(10));
		UploadDocumentResponse resUploadDoc = managementStub.uploadDocument(uploadDoc);
		UploadDocumentResult uploadDocResult = resUploadDoc.getUploadDocumentResult();
		return uploadDocResult.getDocId();
	}

	public Boolean disposeDocument(String documentID) throws RemoteException {
		// dispose the document from the server
		DisposeDocument disposeDoc = new DisposeDocument();
		disposeDoc.setId(documentID);
		DisposeDocumentResponse resDisponse = managementStub.disposeDocument(disposeDoc);
		DisposeDocumentResult disponseResult = resDisponse.getDisposeDocumentResult();
		return disponseResult.getDisposed();
	}

	public String getServerInformation() throws RemoteException {
		ManagementServiceNativeStub.GetServerInformation request = new ManagementServiceNativeStub.GetServerInformation();
		ManagementServiceNativeStub.GetServerInformationResponse response = managementStub.getServerInformation(request);
		return response.getGetServerInformationResult();
	}

	public Boolean process(String documentToProcess) throws IOException {
		
		String documentID = this.uploadDocument(documentToProcess);
		
		File fileDocument = new File(documentToProcess);
		
		// let the server sign the document directly by calling the process method
		SignServiceNativeStub.Process process = new SignServiceNativeStub.Process();
		SignServiceNativeStub.ArrayOfString ids = new SignServiceNativeStub.ArrayOfString();
		ids.addString(documentID);
		process.setDocumentIds(ids);
		process.setPluginType("com.xyzmo.server.xyzmoActivityLibrary.xyzmoSealSimpleActivity");
		process.setXmlConfiguration(getActivityConfigurationTemplate("com.xyzmo.server.xyzmoActivityLibrary.xyzmoSealSimpleActivity"));
		ProcessResponse resProcess = signStub.process(process);
		ArrayOfProcessResult processResult = resProcess.getProcessResult();
		ProcessResult[] documents = processResult.getProcessResult();

		// get the signed document
		ArrayOfFileContainer fileContainer = documents[0].getProcessedFiles();
		SignServiceNativeStub.FileContainer[] signedFiles = fileContainer.getFileContainer();
		
		for (FileContainer signedFile : signedFiles) {
			if (signedFile.getSourceFileContent() != null) {
				FileOutputStream outputStream = new FileOutputStream(fileDocument.getParent() + "\\external_signed_" + signedFile.getStatus() + "_" + signedFile.getSourceFileName());
				signedFile.getSourceFileContent().writeTo(outputStream);
				outputStream.close();
			}
		}
		
		// dispose the document from the server
		DisposeDocument disposeDoc = new DisposeDocument();
		disposeDoc.setId(documentID);
		DisposeDocumentResponse resDisponse = managementStub.disposeDocument(disposeDoc);
		DisposeDocumentResult disponseResult = resDisponse.getDisposeDocumentResult();
		return disponseResult.getDisposed();
	}

}
