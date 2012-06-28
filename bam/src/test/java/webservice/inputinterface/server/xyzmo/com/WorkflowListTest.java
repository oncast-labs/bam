package webservice.inputinterface.server.xyzmo.com;

import java.io.IOException;
import java.rmi.RemoteException;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertArrayEquals;


import br.com.oncast.bam.service.xyzmo.XyzmoWebService;
import br.com.oncast.bam.service.xyzmo.XyzmoWebServiceException;

public class WorkflowListTest {
	
	private XyzmoWebService webService;
	
	@Before
	public void initObjects() {
		webService = new XyzmoWebService("http://192.168.1.193:50006");
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
		webService.process();
	}
	
}
