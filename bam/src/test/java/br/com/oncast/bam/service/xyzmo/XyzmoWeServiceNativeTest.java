package br.com.oncast.bam.service.xyzmo;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.rmi.RemoteException;

import org.junit.Before;
import org.junit.Test;

public class XyzmoWeServiceNativeTest {
	
	private XyzmoWebServiceNative webService;
	
	@Before
	public void initObjects() {
		webService = new XyzmoWebServiceNative("http://testserver:56000");
	}
	
	private String getFileContent(String fileName) throws FileNotFoundException, IOException {
		FileInputStream inputStream = new FileInputStream(this.getClass().getResource("/" + fileName).getPath());
		String expectedConfiguration;
		byte[] readBytes = new byte[inputStream.available()];
		inputStream.read(readBytes);
		expectedConfiguration = new String(readBytes);
		inputStream.close();
		return expectedConfiguration;
	}
	
	@Test
	public void testGetAvailableActivities() throws RemoteException {
		String[] expectedActivities = new String[] {"com.xyzmo.server.xyzmoactivitylibrary.xyzmoadobepdfactivity",
													"com.xyzmo.server.xyzmoactivitylibrary.xyzmoadobepdfsecurityactivity",
													"com.xyzmo.server.xyzmoactivitylibrary.xyzmopkcs7activity",
													"com.xyzmo.server.xyzmoactivitylibrary.xyzmoxmldsigactivity",
													"com.xyzmo.server.xyzmoactivitylibrary.xyzmoaddattachmentactivity",
													"com.xyzmo.server.xyzmoactivitylibrary.xyzmoflattenpdfactivity",
													"com.xyzmo.server.xyzmoactivitylibrary.xyzmoadobepdfexternalfinishactivity",
													"com.xyzmo.server.xyzmoactivitylibrary.xyzmoadobepdfexternalprepareactivity",
													"com.xyzmo.server.xyzmoactivitylibrary.xyzmoanalyzeidentitycardactivity",
													"com.xyzmo.server.xyzmoactivitylibrary.xyzmoanalyzedocumentactivity",
													"com.xyzmo.server.xyzmoactivitylibrary.xyzmoconvertexcel2pdfactivity",
													"com.xyzmo.server.xyzmoactivitylibrary.xyzmoconverthtml2pdfabcactivity",
													"com.xyzmo.server.xyzmoactivitylibrary.xyzmoconverthtml2pdfhdactivity",
													"com.xyzmo.server.xyzmoactivitylibrary.xyzmoconverthtml2pdfwactivity",
													"com.xyzmo.server.xyzmoactivitylibrary.xyzmoconvertimage2pdfactivity",
													"com.xyzmo.server.xyzmoactivitylibrary.xyzmoconvertpdf2jpgactivity",
													"com.xyzmo.server.xyzmoactivitylibrary.xyzmoconvertpdf2pngactivity",
													"com.xyzmo.server.xyzmoactivitylibrary.xyzmoconvertpdf2tiffactivity",
													"com.xyzmo.server.xyzmoactivitylibrary.xyzmoconvertpowerpoint2pdfactivity",
													"com.xyzmo.server.xyzmoactivitylibrary.xyzmoconverttext2pdfactivity",
													"com.xyzmo.server.xyzmoactivitylibrary.xyzmoconvertword2pdfactivity",
													"com.xyzmo.server.xyzmoactivitylibrary.xyzmoconvertxml2pdfactivity",
													"com.xyzmo.server.xyzmoactivitylibrary.xyzmoword2pdfactivity",
													"com.xyzmo.server.xyzmoactivitylibrary.xyzmogetsealpreviewactivity",
													"com.xyzmo.server.xyzmoactivitylibrary.xyzmomail2htmlactivity",
													"com.xyzmo.server.xyzmoactivitylibrary.xyzmomergepdfwithformdataactivity",
													"com.xyzmo.server.xyzmoactivitylibrary.xyzmomimemergeractivity",
													"com.xyzmo.server.xyzmoactivitylibrary.xyzmomimeparseractivity",
													"com.xyzmo.server.xyzmoactivitylibrary.xyzmoconvertpdf2pdfaactivity",
													"com.xyzmo.server.xyzmoactivitylibrary.xyzmovalidatepdf2pdfaactivity",
													"com.xyzmo.server.xyzmoactivitylibrary.xyzmopkcs7externalfinishactivity",
													"com.xyzmo.server.xyzmoactivitylibrary.xyzmopkcs7externalprepareactivity",
													"com.xyzmo.server.xyzmoactivitylibrary.xyzmosealsimpleactivity",
													"com.xyzmo.server.xyzmoactivitylibrary.xyzmosealexternalfinishactivity",
													"com.xyzmo.server.xyzmoactivitylibrary.xyzmosealexternalprepareactivity",
													"com.xyzmo.server.xyzmoactivitylibrary.xyzmosendmailactivity",
													"com.xyzmo.server.xyzmoactivitylibrary.xyzmosigstringparsingactivity",
													"com.xyzmo.server.xyzmoactivitylibrary.xyzmosmimeactivity",
													"com.xyzmo.server.xyzmoactivitylibrary.xyzmosmtpsendactivity",
													"com.xyzmo.server.xyzmoactivitylibrary.xyzmoxmldsigexternalfinishactivity",
													"com.xyzmo.server.xyzmoactivitylibrary.xyzmoxmldsigexternalprepareactivity"};
		
		String[] availableActivities = webService.getAvailableActivities();
		assertArrayEquals(expectedActivities, availableActivities);
	}
	
	
	@Test
	public void testGetActivityConfigurationTemplate() throws IOException {
		
		String expectedConfiguration = getFileContent("ActivityConfiguration.xml");
		
		String activityOfInterest = "com.xyzmo.server.xyzmoActivityLibrary.xyzmoSealSimpleActivity";
		String activityConfiguration = webService.getActivityConfigurationTemplate(activityOfInterest);
		assertEquals(expectedConfiguration, activityConfiguration);
	}
	
	@Test
	public void testModifyConfiguration() throws Exception {
		String expectedConfiguration = getFileContent("ModifiedActivityConfiguration.xml");
		
		String activeConfiguration = webService.getActivityConfigurationTemplate("com.xyzmo.server.xyzmoActivityLibrary.xyzmoSealSimpleActivity");
		String modifiedConfiguration = webService.modifyConfiguration(activeConfiguration);
		assertEquals(expectedConfiguration, modifiedConfiguration);
	}
	
	@Test
	//TODO verificar criterio de quebra do método.
	public void testUploadDocument() throws RemoteException {
		String documentoToUpload = this.getClass().getResource("/teste.pdf").getPath();
		
		String documentID = webService.uploadDocument(documentoToUpload);
		assertNotNull(documentID);
		
		System.out.println("documentID: " + documentID);
		
//		Boolean disposed = webService.disposeDocument(documentID);
//		assertTrue(disposed);
	}
	
	@Test
	public void testProcess() throws IOException {
		String documentID = webService.uploadDocument(this.getClass().getResource("/teste.pdf").getPath());
		assertNotNull(documentID);
		
		webService.process(this.getClass().getResource("/teste.pdf").getPath());
	}
	
	@Test
	public void testGetServerInformation() throws RemoteException {
		String serverInformation = webService.getServerInformation();
		assertNotNull(serverInformation);
	}
}
