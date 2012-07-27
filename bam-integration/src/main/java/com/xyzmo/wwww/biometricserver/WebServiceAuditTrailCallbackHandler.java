
/**
 * WebServiceAuditTrailCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.4  Built on : Dec 19, 2010 (08:18:42 CET)
 */

    package com.xyzmo.wwww.biometricserver;

    /**
     *  WebServiceAuditTrailCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class WebServiceAuditTrailCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public WebServiceAuditTrailCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public WebServiceAuditTrailCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for auditTrail_ProfileAndAllSignatures method
            * override this method for handling normal response from auditTrail_ProfileAndAllSignatures operation
            */
           public void receiveResultauditTrail_ProfileAndAllSignatures(
                    com.xyzmo.wwww.biometricserver.WebServiceAuditTrailStub.AuditTrail_ProfileAndAllSignaturesResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from auditTrail_ProfileAndAllSignatures operation
           */
            public void receiveErrorauditTrail_ProfileAndAllSignatures(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for auditTrail_AllProfiles method
            * override this method for handling normal response from auditTrail_AllProfiles operation
            */
           public void receiveResultauditTrail_AllProfiles(
                    com.xyzmo.wwww.biometricserver.WebServiceAuditTrailStub.AuditTrail_AllProfilesResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from auditTrail_AllProfiles operation
           */
            public void receiveErrorauditTrail_AllProfiles(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for auditTrail_BiometricServiceRequest method
            * override this method for handling normal response from auditTrail_BiometricServiceRequest operation
            */
           public void receiveResultauditTrail_BiometricServiceRequest(
                    com.xyzmo.wwww.biometricserver.WebServiceAuditTrailStub.AuditTrail_BiometricServiceRequestResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from auditTrail_BiometricServiceRequest operation
           */
            public void receiveErrorauditTrail_BiometricServiceRequest(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for auditTrail_AllUsersAndAllProfilesUserFiltered method
            * override this method for handling normal response from auditTrail_AllUsersAndAllProfilesUserFiltered operation
            */
           public void receiveResultauditTrail_AllUsersAndAllProfilesUserFiltered(
                    com.xyzmo.wwww.biometricserver.WebServiceAuditTrailStub.AuditTrail_AllUsersAndAllProfilesUserFilteredResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from auditTrail_AllUsersAndAllProfilesUserFiltered operation
           */
            public void receiveErrorauditTrail_AllUsersAndAllProfilesUserFiltered(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for auditTrail_AllUsersAndAllProfiles method
            * override this method for handling normal response from auditTrail_AllUsersAndAllProfiles operation
            */
           public void receiveResultauditTrail_AllUsersAndAllProfiles(
                    com.xyzmo.wwww.biometricserver.WebServiceAuditTrailStub.AuditTrail_AllUsersAndAllProfilesResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from auditTrail_AllUsersAndAllProfiles operation
           */
            public void receiveErrorauditTrail_AllUsersAndAllProfiles(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for auditTrail_BiometricServiceRequestSignatures method
            * override this method for handling normal response from auditTrail_BiometricServiceRequestSignatures operation
            */
           public void receiveResultauditTrail_BiometricServiceRequestSignatures(
                    com.xyzmo.wwww.biometricserver.WebServiceAuditTrailStub.AuditTrail_BiometricServiceRequestSignaturesResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from auditTrail_BiometricServiceRequestSignatures operation
           */
            public void receiveErrorauditTrail_BiometricServiceRequestSignatures(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for auditTrail_Overall method
            * override this method for handling normal response from auditTrail_Overall operation
            */
           public void receiveResultauditTrail_Overall(
                    com.xyzmo.wwww.biometricserver.WebServiceAuditTrailStub.AuditTrail_OverallResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from auditTrail_Overall operation
           */
            public void receiveErrorauditTrail_Overall(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for auditTrail_UserAndAllProfiles method
            * override this method for handling normal response from auditTrail_UserAndAllProfiles operation
            */
           public void receiveResultauditTrail_UserAndAllProfiles(
                    com.xyzmo.wwww.biometricserver.WebServiceAuditTrailStub.AuditTrail_UserAndAllProfilesResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from auditTrail_UserAndAllProfiles operation
           */
            public void receiveErrorauditTrail_UserAndAllProfiles(java.lang.Exception e) {
            }
                


    }
    