
/**
 * SignServiceNativeCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

    package sign.webservicenativeprototype.inputinterface.server.xyzmo.com;

    /**
     *  SignServiceNativeCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class SignServiceNativeCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public SignServiceNativeCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public SignServiceNativeCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for includeSignedHashForExternalSignatureWithAttachments method
            * override this method for handling normal response from includeSignedHashForExternalSignatureWithAttachments operation
            */
           public void receiveResultincludeSignedHashForExternalSignatureWithAttachments(
                    sign.webservicenativeprototype.inputinterface.server.xyzmo.com.SignServiceNativeStub.IncludeSignedHashForExternalSignatureWithAttachmentsResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from includeSignedHashForExternalSignatureWithAttachments operation
           */
            public void receiveErrorincludeSignedHashForExternalSignatureWithAttachments(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for process method
            * override this method for handling normal response from process operation
            */
           public void receiveResultprocess(
                    sign.webservicenativeprototype.inputinterface.server.xyzmo.com.SignServiceNativeStub.ProcessResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from process operation
           */
            public void receiveErrorprocess(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for finishDocumentWithExternalSignatureWithAttachments method
            * override this method for handling normal response from finishDocumentWithExternalSignatureWithAttachments operation
            */
           public void receiveResultfinishDocumentWithExternalSignatureWithAttachments(
                    sign.webservicenativeprototype.inputinterface.server.xyzmo.com.SignServiceNativeStub.FinishDocumentWithExternalSignatureWithAttachmentsResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from finishDocumentWithExternalSignatureWithAttachments operation
           */
            public void receiveErrorfinishDocumentWithExternalSignatureWithAttachments(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for requestFurtherHashesForExternalSignatureWithAttachments method
            * override this method for handling normal response from requestFurtherHashesForExternalSignatureWithAttachments operation
            */
           public void receiveResultrequestFurtherHashesForExternalSignatureWithAttachments(
                    sign.webservicenativeprototype.inputinterface.server.xyzmo.com.SignServiceNativeStub.RequestFurtherHashesForExternalSignatureWithAttachmentsResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from requestFurtherHashesForExternalSignatureWithAttachments operation
           */
            public void receiveErrorrequestFurtherHashesForExternalSignatureWithAttachments(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for prepareDocumentForExternalSignature method
            * override this method for handling normal response from prepareDocumentForExternalSignature operation
            */
           public void receiveResultprepareDocumentForExternalSignature(
                    sign.webservicenativeprototype.inputinterface.server.xyzmo.com.SignServiceNativeStub.PrepareDocumentForExternalSignatureResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from prepareDocumentForExternalSignature operation
           */
            public void receiveErrorprepareDocumentForExternalSignature(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for prepareDocumentForExternalSignatureWithAttachments method
            * override this method for handling normal response from prepareDocumentForExternalSignatureWithAttachments operation
            */
           public void receiveResultprepareDocumentForExternalSignatureWithAttachments(
                    sign.webservicenativeprototype.inputinterface.server.xyzmo.com.SignServiceNativeStub.PrepareDocumentForExternalSignatureWithAttachmentsResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from prepareDocumentForExternalSignatureWithAttachments operation
           */
            public void receiveErrorprepareDocumentForExternalSignatureWithAttachments(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for finishDocumentWithExternalSignature method
            * override this method for handling normal response from finishDocumentWithExternalSignature operation
            */
           public void receiveResultfinishDocumentWithExternalSignature(
                    sign.webservicenativeprototype.inputinterface.server.xyzmo.com.SignServiceNativeStub.FinishDocumentWithExternalSignatureResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from finishDocumentWithExternalSignature operation
           */
            public void receiveErrorfinishDocumentWithExternalSignature(java.lang.Exception e) {
            }
                


    }
    