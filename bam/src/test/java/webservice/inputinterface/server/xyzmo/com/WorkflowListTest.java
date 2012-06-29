package webservice.inputinterface.server.xyzmo.com;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.rmi.RemoteException;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import br.com.oncast.bam.service.xyzmo.XyzmoWebService;
import br.com.oncast.bam.service.xyzmo.XyzmoWebServiceException;

public class WorkflowListTest {
	
	private XyzmoWebService webService;
	
	@Before
	public void initObjects() {
		webService = new XyzmoWebService("https://testserver:40006");
		
		System.setProperty("sun.security.ssl.allowUnsafeRenegotiation", "true");
		System.setProperty("java.protocol.handler.pkgs", "com.sun.net.ssl.internal.www.protocol");
		
		Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());
		
		System.setProperty("javax.net.ssl.trustStoreType", "JKS");
		System.setProperty("javax.net.ssl.trustStore", "C:\\Program Files (x86)\\Java\\jdk1.6.0_33\\jre\\lib\\security\\cacerts");
	}
	
	@Test
	public void testAccessWebService() throws XyzmoWebServiceException {
		XyzmoWebServiceStub webServiceStub = webService.getWebServiceStub();
		assertNotNull(webServiceStub);
	}
	
	@Test
	public void testAvailableWorkflows() throws RemoteException, XyzmoWebServiceException {
		String[] expected = new String[] {"com.xyzmo.server.documentworkflow._06_signSealPDF", 
				                          "com.xyzmo.server.documentworkflow._06_signAdobePDF", 
				                          "com.xyzmo.server.documentworkflow._06_signXMLdSIG", 
				                          "com.xyzmo.server.documentworkflow._06_signPKCS7", 
				                          "com.xyzmo.server.DocumentWorkflow._06_MimeParser"};
		String[] workflowList = webService.getWorkflowList();
		assertArrayEquals(workflowList, expected);
	}

	@Test
	public void testProccess() throws XyzmoWebServiceException, IOException  {
		
		webService.process("C:\\Users\\avila\\Dropbox\\MMC\\How to sign a PDF using iText.pdf");
	}
	
}
