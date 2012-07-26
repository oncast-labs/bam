package br.com.oncast.bam.xyzmo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.rmi.RemoteException;

import javax.activation.DataHandler;
import javax.activation.FileDataSource;

import org.apache.axis2.AxisFault;

import webservice.inputinterface.server.xyzmo.com.XyzmoWebServiceStub;
import webservice.inputinterface.server.xyzmo.com.XyzmoWebServiceStub.FileContainer;

public class XyzmoWebService {

	private String webSserviceAddress;

	public XyzmoWebService() {
		this("http://localhost:50006");
	}

	public XyzmoWebService(String serverAddress) {
		webSserviceAddress = serverAddress
				+ "/com.xyzmo.server.inputinterface.webservice.asmx";
	}

	public String[] getWorkflowList() throws XyzmoWebServiceException,
			RemoteException {
		XyzmoWebServiceStub advancedSignServer = getWebServiceStub();
		XyzmoWebServiceStub.GetWorkflowList request = new XyzmoWebServiceStub.GetWorkflowList();

		XyzmoWebServiceStub.GetWorkflowListResponse workflowListResponse = advancedSignServer
				.getWorkflowList(request);
		XyzmoWebServiceStub.ArrayOfString workflowList = workflowListResponse
				.getGetWorkflowListResult();
		String[] availableWorkflows = workflowList.getString();
		return availableWorkflows;
	}

	public XyzmoWebServiceStub getWebServiceStub()
			throws XyzmoWebServiceException {
		XyzmoWebServiceStub advancedSignServer = null;
		try {
			advancedSignServer = new XyzmoWebServiceStub(webSserviceAddress);
		} catch (AxisFault e) {
			throw new XyzmoWebServiceException(e.getCause());
		}

		return advancedSignServer;
	}

	public void process(String filePath) throws XyzmoWebServiceException,
			IOException {
		XyzmoWebServiceStub advancedSignServer = this.getWebServiceStub();

		XyzmoWebServiceStub.Process process = new XyzmoWebServiceStub.Process();

		String workflowOfInterest = "com.xyzmo.server.DocumentWorkflow._06_signAdobePDF";
		File file = new File(filePath);
		XyzmoWebServiceStub.ArrayOfFileContainer files = new XyzmoWebServiceStub.ArrayOfFileContainer();
		XyzmoWebServiceStub.FileContainer[] array = new XyzmoWebServiceStub.FileContainer[1];
		XyzmoWebServiceStub.FileContainer container = new XyzmoWebServiceStub.FileContainer();
		DataHandler handle = new DataHandler(new FileDataSource(file));
		container.setSourceFileContent(handle);
		container.setSourceFileName(file.getName());

		for (int i = 0; i < array.length; i++) {
			array[i] = container;
		}
		files.setFileContainer(array);

		process.setFiles(files);
		process.setSelectedWorkflowName(workflowOfInterest);

		XyzmoWebServiceStub.ProcessResponse processResponse = advancedSignServer
				.process(process);
		FileContainer[] fileConteiners = processResponse.getProcessResult()
				.getProcessedFiles().getFileContainer();

		for (FileContainer fileConteiner : fileConteiners) {
			FileOutputStream outputStream = new FileOutputStream(
					file.getParent() + "\\signed_"
							+ fileConteiner.getSourceFileName());
			fileConteiner.getSourceFileContent().writeTo(outputStream);
		}

	}
}
