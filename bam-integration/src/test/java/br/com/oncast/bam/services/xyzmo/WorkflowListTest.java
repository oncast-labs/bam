package br.com.oncast.bam.services.xyzmo;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.rmi.RemoteException;

import org.junit.Before;
import org.junit.Test;

import webservice.inputinterface.server.xyzmo.com.XyzmoWebServiceStub;
import br.com.oncast.bam.integration.xyzmo.XyzmoWebService;
import br.com.oncast.bam.integration.xyzmo.XyzmoWebServiceException;

public class WorkflowListTest {
	
	private XyzmoWebService webService;
	
	@Before
	public void initObjects() {
		webService = new XyzmoWebService("http://testlab.xyzmo.com:50006");
		System.setProperty("javax.net.ssl.trustStore", this.getClass().getResource("/cacerts").getPath());
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
		
		webService.process(this.getClass().getResource("/teste.pdf").getPath());
	}
	
}