
/**
 * WebServiceBiometricPartCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.4  Built on : Dec 19, 2010 (08:18:42 CET)
 */

    package com.xyzmo.wwww.biometricserver;

    /**
     *  WebServiceBiometricPartCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class WebServiceBiometricPartCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public WebServiceBiometricPartCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public WebServiceBiometricPartCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for verifyUserBySignatureStaticToDynamic_v1 method
            * override this method for handling normal response from verifyUserBySignatureStaticToDynamic_v1 operation
            */
           public void receiveResultverifyUserBySignatureStaticToDynamic_v1(
                    com.xyzmo.wwww.biometricserver.WebServiceBiometricPartStub.VerifyUserBySignatureStaticToDynamic_v1Response result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from verifyUserBySignatureStaticToDynamic_v1 operation
           */
            public void receiveErrorverifyUserBySignatureStaticToDynamic_v1(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for enrollDynamicProfile_v1 method
            * override this method for handling normal response from enrollDynamicProfile_v1 operation
            */
           public void receiveResultenrollDynamicProfile_v1(
                    com.xyzmo.wwww.biometricserver.WebServiceBiometricPartStub.EnrollDynamicProfile_v1Response result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from enrollDynamicProfile_v1 operation
           */
            public void receiveErrorenrollDynamicProfile_v1(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for enrollStaticProfile_v2 method
            * override this method for handling normal response from enrollStaticProfile_v2 operation
            */
           public void receiveResultenrollStaticProfile_v2(
                    com.xyzmo.wwww.biometricserver.WebServiceBiometricPartStub.EnrollStaticProfile_v2Response result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from enrollStaticProfile_v2 operation
           */
            public void receiveErrorenrollStaticProfile_v2(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for verifyUserProfileBySignatureDynamicToDynamicSignedResponse_v1 method
            * override this method for handling normal response from verifyUserProfileBySignatureDynamicToDynamicSignedResponse_v1 operation
            */
           public void receiveResultverifyUserProfileBySignatureDynamicToDynamicSignedResponse_v1(
                    com.xyzmo.wwww.biometricserver.WebServiceBiometricPartStub.VerifyUserProfileBySignatureDynamicToDynamicSignedResponse_v1Response result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from verifyUserProfileBySignatureDynamicToDynamicSignedResponse_v1 operation
           */
            public void receiveErrorverifyUserProfileBySignatureDynamicToDynamicSignedResponse_v1(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for identifyUserBySignatureDynamicToDynamic_v1 method
            * override this method for handling normal response from identifyUserBySignatureDynamicToDynamic_v1 operation
            */
           public void receiveResultidentifyUserBySignatureDynamicToDynamic_v1(
                    com.xyzmo.wwww.biometricserver.WebServiceBiometricPartStub.IdentifyUserBySignatureDynamicToDynamic_v1Response result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from identifyUserBySignatureDynamicToDynamic_v1 operation
           */
            public void receiveErroridentifyUserBySignatureDynamicToDynamic_v1(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for verifyUserProfileBySignatureDynamicToDynamic_v1 method
            * override this method for handling normal response from verifyUserProfileBySignatureDynamicToDynamic_v1 operation
            */
           public void receiveResultverifyUserProfileBySignatureDynamicToDynamic_v1(
                    com.xyzmo.wwww.biometricserver.WebServiceBiometricPartStub.VerifyUserProfileBySignatureDynamicToDynamic_v1Response result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from verifyUserProfileBySignatureDynamicToDynamic_v1 operation
           */
            public void receiveErrorverifyUserProfileBySignatureDynamicToDynamic_v1(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for enrollStaticProfile_v1 method
            * override this method for handling normal response from enrollStaticProfile_v1 operation
            */
           public void receiveResultenrollStaticProfile_v1(
                    com.xyzmo.wwww.biometricserver.WebServiceBiometricPartStub.EnrollStaticProfile_v1Response result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from enrollStaticProfile_v1 operation
           */
            public void receiveErrorenrollStaticProfile_v1(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for verifyUserBySignatureDynamicToDynamic_v1 method
            * override this method for handling normal response from verifyUserBySignatureDynamicToDynamic_v1 operation
            */
           public void receiveResultverifyUserBySignatureDynamicToDynamic_v1(
                    com.xyzmo.wwww.biometricserver.WebServiceBiometricPartStub.VerifyUserBySignatureDynamicToDynamic_v1Response result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from verifyUserBySignatureDynamicToDynamic_v1 operation
           */
            public void receiveErrorverifyUserBySignatureDynamicToDynamic_v1(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for verifyUserProfileBySignatureStaticToStatic_v1 method
            * override this method for handling normal response from verifyUserProfileBySignatureStaticToStatic_v1 operation
            */
           public void receiveResultverifyUserProfileBySignatureStaticToStatic_v1(
                    com.xyzmo.wwww.biometricserver.WebServiceBiometricPartStub.VerifyUserProfileBySignatureStaticToStatic_v1Response result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from verifyUserProfileBySignatureStaticToStatic_v1 operation
           */
            public void receiveErrorverifyUserProfileBySignatureStaticToStatic_v1(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for validateDynamicProfile_v1 method
            * override this method for handling normal response from validateDynamicProfile_v1 operation
            */
           public void receiveResultvalidateDynamicProfile_v1(
                    com.xyzmo.wwww.biometricserver.WebServiceBiometricPartStub.ValidateDynamicProfile_v1Response result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from validateDynamicProfile_v1 operation
           */
            public void receiveErrorvalidateDynamicProfile_v1(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for verifyUserBySignatureDynamicToDynamicSignedResponse_v1 method
            * override this method for handling normal response from verifyUserBySignatureDynamicToDynamicSignedResponse_v1 operation
            */
           public void receiveResultverifyUserBySignatureDynamicToDynamicSignedResponse_v1(
                    com.xyzmo.wwww.biometricserver.WebServiceBiometricPartStub.VerifyUserBySignatureDynamicToDynamicSignedResponse_v1Response result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from verifyUserBySignatureDynamicToDynamicSignedResponse_v1 operation
           */
            public void receiveErrorverifyUserBySignatureDynamicToDynamicSignedResponse_v1(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for verifyUserProfileBySignatureStaticToDynamic_v1 method
            * override this method for handling normal response from verifyUserProfileBySignatureStaticToDynamic_v1 operation
            */
           public void receiveResultverifyUserProfileBySignatureStaticToDynamic_v1(
                    com.xyzmo.wwww.biometricserver.WebServiceBiometricPartStub.VerifyUserProfileBySignatureStaticToDynamic_v1Response result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from verifyUserProfileBySignatureStaticToDynamic_v1 operation
           */
            public void receiveErrorverifyUserProfileBySignatureStaticToDynamic_v1(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for verifyUserProfileBySignatureStaticToDynamicSignedResponse_v1 method
            * override this method for handling normal response from verifyUserProfileBySignatureStaticToDynamicSignedResponse_v1 operation
            */
           public void receiveResultverifyUserProfileBySignatureStaticToDynamicSignedResponse_v1(
                    com.xyzmo.wwww.biometricserver.WebServiceBiometricPartStub.VerifyUserProfileBySignatureStaticToDynamicSignedResponse_v1Response result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from verifyUserProfileBySignatureStaticToDynamicSignedResponse_v1 operation
           */
            public void receiveErrorverifyUserProfileBySignatureStaticToDynamicSignedResponse_v1(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for verifyUserBySignatureStaticToStaticSignedResponse_v1 method
            * override this method for handling normal response from verifyUserBySignatureStaticToStaticSignedResponse_v1 operation
            */
           public void receiveResultverifyUserBySignatureStaticToStaticSignedResponse_v1(
                    com.xyzmo.wwww.biometricserver.WebServiceBiometricPartStub.VerifyUserBySignatureStaticToStaticSignedResponse_v1Response result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from verifyUserBySignatureStaticToStaticSignedResponse_v1 operation
           */
            public void receiveErrorverifyUserBySignatureStaticToStaticSignedResponse_v1(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for verifyUserBySignatureDynamicToStaticSignedResponse_v1 method
            * override this method for handling normal response from verifyUserBySignatureDynamicToStaticSignedResponse_v1 operation
            */
           public void receiveResultverifyUserBySignatureDynamicToStaticSignedResponse_v1(
                    com.xyzmo.wwww.biometricserver.WebServiceBiometricPartStub.VerifyUserBySignatureDynamicToStaticSignedResponse_v1Response result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from verifyUserBySignatureDynamicToStaticSignedResponse_v1 operation
           */
            public void receiveErrorverifyUserBySignatureDynamicToStaticSignedResponse_v1(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for verifyUserBySignatureStaticToDynamicSignedResponse_v1 method
            * override this method for handling normal response from verifyUserBySignatureStaticToDynamicSignedResponse_v1 operation
            */
           public void receiveResultverifyUserBySignatureStaticToDynamicSignedResponse_v1(
                    com.xyzmo.wwww.biometricserver.WebServiceBiometricPartStub.VerifyUserBySignatureStaticToDynamicSignedResponse_v1Response result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from verifyUserBySignatureStaticToDynamicSignedResponse_v1 operation
           */
            public void receiveErrorverifyUserBySignatureStaticToDynamicSignedResponse_v1(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for verifyUserProfileBySignatureDynamicToStaticSignedResponse_v1 method
            * override this method for handling normal response from verifyUserProfileBySignatureDynamicToStaticSignedResponse_v1 operation
            */
           public void receiveResultverifyUserProfileBySignatureDynamicToStaticSignedResponse_v1(
                    com.xyzmo.wwww.biometricserver.WebServiceBiometricPartStub.VerifyUserProfileBySignatureDynamicToStaticSignedResponse_v1Response result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from verifyUserProfileBySignatureDynamicToStaticSignedResponse_v1 operation
           */
            public void receiveErrorverifyUserProfileBySignatureDynamicToStaticSignedResponse_v1(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for identifyUserProfileBySignatureDynamicToDynamic_v1 method
            * override this method for handling normal response from identifyUserProfileBySignatureDynamicToDynamic_v1 operation
            */
           public void receiveResultidentifyUserProfileBySignatureDynamicToDynamic_v1(
                    com.xyzmo.wwww.biometricserver.WebServiceBiometricPartStub.IdentifyUserProfileBySignatureDynamicToDynamic_v1Response result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from identifyUserProfileBySignatureDynamicToDynamic_v1 operation
           */
            public void receiveErroridentifyUserProfileBySignatureDynamicToDynamic_v1(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for verifyUserProfileBySignatureDynamicToStatic_v1 method
            * override this method for handling normal response from verifyUserProfileBySignatureDynamicToStatic_v1 operation
            */
           public void receiveResultverifyUserProfileBySignatureDynamicToStatic_v1(
                    com.xyzmo.wwww.biometricserver.WebServiceBiometricPartStub.VerifyUserProfileBySignatureDynamicToStatic_v1Response result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from verifyUserProfileBySignatureDynamicToStatic_v1 operation
           */
            public void receiveErrorverifyUserProfileBySignatureDynamicToStatic_v1(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for verifyUserProfileBySignatureStaticToStaticSignedResponse_v1 method
            * override this method for handling normal response from verifyUserProfileBySignatureStaticToStaticSignedResponse_v1 operation
            */
           public void receiveResultverifyUserProfileBySignatureStaticToStaticSignedResponse_v1(
                    com.xyzmo.wwww.biometricserver.WebServiceBiometricPartStub.VerifyUserProfileBySignatureStaticToStaticSignedResponse_v1Response result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from verifyUserProfileBySignatureStaticToStaticSignedResponse_v1 operation
           */
            public void receiveErrorverifyUserProfileBySignatureStaticToStaticSignedResponse_v1(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for verifyUserBySignatureStaticToStatic_v1 method
            * override this method for handling normal response from verifyUserBySignatureStaticToStatic_v1 operation
            */
           public void receiveResultverifyUserBySignatureStaticToStatic_v1(
                    com.xyzmo.wwww.biometricserver.WebServiceBiometricPartStub.VerifyUserBySignatureStaticToStatic_v1Response result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from verifyUserBySignatureStaticToStatic_v1 operation
           */
            public void receiveErrorverifyUserBySignatureStaticToStatic_v1(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for verifyUserBySignatureDynamicToStatic_v1 method
            * override this method for handling normal response from verifyUserBySignatureDynamicToStatic_v1 operation
            */
           public void receiveResultverifyUserBySignatureDynamicToStatic_v1(
                    com.xyzmo.wwww.biometricserver.WebServiceBiometricPartStub.VerifyUserBySignatureDynamicToStatic_v1Response result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from verifyUserBySignatureDynamicToStatic_v1 operation
           */
            public void receiveErrorverifyUserBySignatureDynamicToStatic_v1(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for enrollDynamicProfile_v2 method
            * override this method for handling normal response from enrollDynamicProfile_v2 operation
            */
           public void receiveResultenrollDynamicProfile_v2(
                    com.xyzmo.wwww.biometricserver.WebServiceBiometricPartStub.EnrollDynamicProfile_v2Response result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from enrollDynamicProfile_v2 operation
           */
            public void receiveErrorenrollDynamicProfile_v2(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for identifyUserProfileBySignatureDynamicToDynamicSignedResponse_v1 method
            * override this method for handling normal response from identifyUserProfileBySignatureDynamicToDynamicSignedResponse_v1 operation
            */
           public void receiveResultidentifyUserProfileBySignatureDynamicToDynamicSignedResponse_v1(
                    com.xyzmo.wwww.biometricserver.WebServiceBiometricPartStub.IdentifyUserProfileBySignatureDynamicToDynamicSignedResponse_v1Response result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from identifyUserProfileBySignatureDynamicToDynamicSignedResponse_v1 operation
           */
            public void receiveErroridentifyUserProfileBySignatureDynamicToDynamicSignedResponse_v1(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for identifyUserBySignatureDynamicToDynamicSignedResponse_v1 method
            * override this method for handling normal response from identifyUserBySignatureDynamicToDynamicSignedResponse_v1 operation
            */
           public void receiveResultidentifyUserBySignatureDynamicToDynamicSignedResponse_v1(
                    com.xyzmo.wwww.biometricserver.WebServiceBiometricPartStub.IdentifyUserBySignatureDynamicToDynamicSignedResponse_v1Response result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from identifyUserBySignatureDynamicToDynamicSignedResponse_v1 operation
           */
            public void receiveErroridentifyUserBySignatureDynamicToDynamicSignedResponse_v1(java.lang.Exception e) {
            }
                


    }
    