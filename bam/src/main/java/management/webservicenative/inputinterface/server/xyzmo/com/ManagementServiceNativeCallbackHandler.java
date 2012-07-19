
/**
 * ManagementServiceNativeCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

    package management.webservicenative.inputinterface.server.xyzmo.com;

    /**
     *  ManagementServiceNativeCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class ManagementServiceNativeCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public ManagementServiceNativeCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public ManagementServiceNativeCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for getServerInformation method
            * override this method for handling normal response from getServerInformation operation
            */
           public void receiveResultgetServerInformation(
                    management.webservicenative.inputinterface.server.xyzmo.com.ManagementServiceNativeStub.GetServerInformationResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getServerInformation operation
           */
            public void receiveErrorgetServerInformation(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for copyDocument method
            * override this method for handling normal response from copyDocument operation
            */
           public void receiveResultcopyDocument(
                    management.webservicenative.inputinterface.server.xyzmo.com.ManagementServiceNativeStub.CopyDocumentResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from copyDocument operation
           */
            public void receiveErrorcopyDocument(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getSignatureAccounts method
            * override this method for handling normal response from getSignatureAccounts operation
            */
           public void receiveResultgetSignatureAccounts(
                    management.webservicenative.inputinterface.server.xyzmo.com.ManagementServiceNativeStub.GetSignatureAccountsResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getSignatureAccounts operation
           */
            public void receiveErrorgetSignatureAccounts(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for updateDocumentName method
            * override this method for handling normal response from updateDocumentName operation
            */
           public void receiveResultupdateDocumentName(
                    management.webservicenative.inputinterface.server.xyzmo.com.ManagementServiceNativeStub.UpdateDocumentNameResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from updateDocumentName operation
           */
            public void receiveErrorupdateDocumentName(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for documentExists method
            * override this method for handling normal response from documentExists operation
            */
           public void receiveResultdocumentExists(
                    management.webservicenative.inputinterface.server.xyzmo.com.ManagementServiceNativeStub.DocumentExistsResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from documentExists operation
           */
            public void receiveErrordocumentExists(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getActivities method
            * override this method for handling normal response from getActivities operation
            */
           public void receiveResultgetActivities(
                    management.webservicenative.inputinterface.server.xyzmo.com.ManagementServiceNativeStub.GetActivitiesResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getActivities operation
           */
            public void receiveErrorgetActivities(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for updateDocumentContent method
            * override this method for handling normal response from updateDocumentContent operation
            */
           public void receiveResultupdateDocumentContent(
                    management.webservicenative.inputinterface.server.xyzmo.com.ManagementServiceNativeStub.UpdateDocumentContentResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from updateDocumentContent operation
           */
            public void receiveErrorupdateDocumentContent(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for copyDocumentContent method
            * override this method for handling normal response from copyDocumentContent operation
            */
           public void receiveResultcopyDocumentContent(
                    management.webservicenative.inputinterface.server.xyzmo.com.ManagementServiceNativeStub.CopyDocumentContentResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from copyDocumentContent operation
           */
            public void receiveErrorcopyDocumentContent(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for uploadDocument method
            * override this method for handling normal response from uploadDocument operation
            */
           public void receiveResultuploadDocument(
                    management.webservicenative.inputinterface.server.xyzmo.com.ManagementServiceNativeStub.UploadDocumentResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from uploadDocument operation
           */
            public void receiveErroruploadDocument(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getRegInfoAccountInfo method
            * override this method for handling normal response from getRegInfoAccountInfo operation
            */
           public void receiveResultgetRegInfoAccountInfo(
                    management.webservicenative.inputinterface.server.xyzmo.com.ManagementServiceNativeStub.GetRegInfoAccountInfoResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getRegInfoAccountInfo operation
           */
            public void receiveErrorgetRegInfoAccountInfo(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getActivityConfigurationTemplate method
            * override this method for handling normal response from getActivityConfigurationTemplate operation
            */
           public void receiveResultgetActivityConfigurationTemplate(
                    management.webservicenative.inputinterface.server.xyzmo.com.ManagementServiceNativeStub.GetActivityConfigurationTemplateResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getActivityConfigurationTemplate operation
           */
            public void receiveErrorgetActivityConfigurationTemplate(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for retrieveDocument method
            * override this method for handling normal response from retrieveDocument operation
            */
           public void receiveResultretrieveDocument(
                    management.webservicenative.inputinterface.server.xyzmo.com.ManagementServiceNativeStub.RetrieveDocumentResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from retrieveDocument operation
           */
            public void receiveErrorretrieveDocument(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for disposeDocument method
            * override this method for handling normal response from disposeDocument operation
            */
           public void receiveResultdisposeDocument(
                    management.webservicenative.inputinterface.server.xyzmo.com.ManagementServiceNativeStub.DisposeDocumentResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from disposeDocument operation
           */
            public void receiveErrordisposeDocument(java.lang.Exception e) {
            }
                


    }
    