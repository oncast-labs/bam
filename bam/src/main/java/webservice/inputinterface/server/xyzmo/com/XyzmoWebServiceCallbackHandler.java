
/**
 * XyzmoWebServiceCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package webservice.inputinterface.server.xyzmo.com;

/**
 *  XyzmoWebServiceCallbackHandler Callback class, Users can extend this class and implement
 *  their own receiveResult and receiveError methods.
 */
public abstract class XyzmoWebServiceCallbackHandler{



	protected Object clientData;

	/**
	 * User can pass in any object that needs to be accessed once the NonBlocking
	 * Web service call is finished and appropriate method of this CallBack is called.
	 * @param clientData Object mechanism by which the user can pass in user data
	 * that will be avilable at the time this callback is called.
	 */
	public XyzmoWebServiceCallbackHandler(Object clientData){
		this.clientData = clientData;
	}

	/**
	 * Please use this constructor if you don't want to set any clientData
	 */
	public XyzmoWebServiceCallbackHandler(){
		this.clientData = null;
	}

	/**
	 * Get the client data
	 */

	public Object getClientData() {
		return clientData;
	}


	/**
	 * auto generated Axis2 call back method for getWorkflowList method
	 * override this method for handling normal response from getWorkflowList operation
	 */
	public void receiveResultgetWorkflowList(
			webservice.inputinterface.server.xyzmo.com.XyzmoWebServiceStub.GetWorkflowListResponse result
			) {
	}

	/**
	 * auto generated Axis2 Error handler
	 * override this method for handling error response from getWorkflowList operation
	 */
	public void receiveErrorgetWorkflowList(java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 call back method for processMail method
	 * override this method for handling normal response from processMail operation
	 */
	public void receiveResultprocessMail(
			webservice.inputinterface.server.xyzmo.com.XyzmoWebServiceStub.ProcessMailResponse result
			) {
	}

	/**
	 * auto generated Axis2 Error handler
	 * override this method for handling error response from processMail operation
	 */
	public void receiveErrorprocessMail(java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 call back method for process method
	 * override this method for handling normal response from process operation
	 */
	public void receiveResultprocess(
			webservice.inputinterface.server.xyzmo.com.XyzmoWebServiceStub.ProcessResponse result
			) {
	}

	/**
	 * auto generated Axis2 Error handler
	 * override this method for handling error response from process operation
	 */
	public void receiveErrorprocess(java.lang.Exception e) {
	}



}
