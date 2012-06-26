package br.com.oncast.bam.service.xyzmo;

import java.rmi.RemoteException;

import org.apache.axis2.AxisFault;

import webservice.inputinterface.server.xyzmo.com.XyzmoWebServiceStub;

public class XyzmoWebService {
	
	private String webSserviceAddress;
	
	public XyzmoWebService() {
		this("http://localhost:5000");
	}
	
	public XyzmoWebService(String serverAddress) {
		webSserviceAddress = serverAddress + "/com.xyzmo.server.inputinterface.webservice.asmx";
	}

	public String[] getWorkflowList() throws XyzmoWebServiceException, RemoteException {
		XyzmoWebServiceStub advancedSignServer = getWebServiceStub();
		XyzmoWebServiceStub.GetWorkflowList request = new XyzmoWebServiceStub.GetWorkflowList();
		XyzmoWebServiceStub.GetWorkflowListResponse workflowListResponse = advancedSignServer.getWorkflowList(request);
		XyzmoWebServiceStub.ArrayOfString workflowList = workflowListResponse.getGetWorkflowListResult();
		String[] availableWorkflows = workflowList.getString();
		return availableWorkflows;
	}

	public XyzmoWebServiceStub getWebServiceStub() throws XyzmoWebServiceException {
		XyzmoWebServiceStub advancedSignServer = null;
		
		try {
			advancedSignServer = new XyzmoWebServiceStub(webSserviceAddress);
		} catch (AxisFault e) {
			throw new XyzmoWebServiceException(e.getCause());
		}
		
		return advancedSignServer;
	}
}
