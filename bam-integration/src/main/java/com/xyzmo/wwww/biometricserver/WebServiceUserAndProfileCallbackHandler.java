
/**
 * WebServiceUserAndProfileCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.4  Built on : Dec 19, 2010 (08:18:42 CET)
 */

    package com.xyzmo.wwww.biometricserver;

    /**
     *  WebServiceUserAndProfileCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class WebServiceUserAndProfileCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public WebServiceUserAndProfileCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public WebServiceUserAndProfileCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for profile_GetInfo_v1 method
            * override this method for handling normal response from profile_GetInfo_v1 operation
            */
           public void receiveResultprofile_GetInfo_v1(
                    com.xyzmo.wwww.biometricserver.WebServiceUserAndProfileStub.Profile_GetInfo_v1Response result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from profile_GetInfo_v1 operation
           */
            public void receiveErrorprofile_GetInfo_v1(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for profileHistory_GetInfosFromAllSignatures_v1 method
            * override this method for handling normal response from profileHistory_GetInfosFromAllSignatures_v1 operation
            */
           public void receiveResultprofileHistory_GetInfosFromAllSignatures_v1(
                    com.xyzmo.wwww.biometricserver.WebServiceUserAndProfileStub.ProfileHistory_GetInfosFromAllSignatures_v1Response result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from profileHistory_GetInfosFromAllSignatures_v1 operation
           */
            public void receiveErrorprofileHistory_GetInfosFromAllSignatures_v1(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for user_TurnOnValidation_v1 method
            * override this method for handling normal response from user_TurnOnValidation_v1 operation
            */
           public void receiveResultuser_TurnOnValidation_v1(
                    com.xyzmo.wwww.biometricserver.WebServiceUserAndProfileStub.User_TurnOnValidation_v1Response result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from user_TurnOnValidation_v1 operation
           */
            public void receiveErroruser_TurnOnValidation_v1(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for user_GetInfosFromFilteredUsers_v1 method
            * override this method for handling normal response from user_GetInfosFromFilteredUsers_v1 operation
            */
           public void receiveResultuser_GetInfosFromFilteredUsers_v1(
                    com.xyzmo.wwww.biometricserver.WebServiceUserAndProfileStub.User_GetInfosFromFilteredUsers_v1Response result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from user_GetInfosFromFilteredUsers_v1 operation
           */
            public void receiveErroruser_GetInfosFromFilteredUsers_v1(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for profile_Resume_v1 method
            * override this method for handling normal response from profile_Resume_v1 operation
            */
           public void receiveResultprofile_Resume_v1(
                    com.xyzmo.wwww.biometricserver.WebServiceUserAndProfileStub.Profile_Resume_v1Response result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from profile_Resume_v1 operation
           */
            public void receiveErrorprofile_Resume_v1(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for profile_Suspend_v1 method
            * override this method for handling normal response from profile_Suspend_v1 operation
            */
           public void receiveResultprofile_Suspend_v1(
                    com.xyzmo.wwww.biometricserver.WebServiceUserAndProfileStub.Profile_Suspend_v1Response result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from profile_Suspend_v1 operation
           */
            public void receiveErrorprofile_Suspend_v1(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for user_GetInfosFromUserRange_v1 method
            * override this method for handling normal response from user_GetInfosFromUserRange_v1 operation
            */
           public void receiveResultuser_GetInfosFromUserRange_v1(
                    com.xyzmo.wwww.biometricserver.WebServiceUserAndProfileStub.User_GetInfosFromUserRange_v1Response result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from user_GetInfosFromUserRange_v1 operation
           */
            public void receiveErroruser_GetInfosFromUserRange_v1(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for staticSignature_GetImage_v1 method
            * override this method for handling normal response from staticSignature_GetImage_v1 operation
            */
           public void receiveResultstaticSignature_GetImage_v1(
                    com.xyzmo.wwww.biometricserver.WebServiceUserAndProfileStub.StaticSignature_GetImage_v1Response result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from staticSignature_GetImage_v1 operation
           */
            public void receiveErrorstaticSignature_GetImage_v1(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for user_Add_v1 method
            * override this method for handling normal response from user_Add_v1 operation
            */
           public void receiveResultuser_Add_v1(
                    com.xyzmo.wwww.biometricserver.WebServiceUserAndProfileStub.User_Add_v1Response result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from user_Add_v1 operation
           */
            public void receiveErroruser_Add_v1(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for user_ReturnNumberUsers_v1 method
            * override this method for handling normal response from user_ReturnNumberUsers_v1 operation
            */
           public void receiveResultuser_ReturnNumberUsers_v1(
                    com.xyzmo.wwww.biometricserver.WebServiceUserAndProfileStub.User_ReturnNumberUsers_v1Response result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from user_ReturnNumberUsers_v1 operation
           */
            public void receiveErroruser_ReturnNumberUsers_v1(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for user_TurnOffValidation_v1 method
            * override this method for handling normal response from user_TurnOffValidation_v1 operation
            */
           public void receiveResultuser_TurnOffValidation_v1(
                    com.xyzmo.wwww.biometricserver.WebServiceUserAndProfileStub.User_TurnOffValidation_v1Response result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from user_TurnOffValidation_v1 operation
           */
            public void receiveErroruser_TurnOffValidation_v1(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for user_ChangeUserAttributes_v1 method
            * override this method for handling normal response from user_ChangeUserAttributes_v1 operation
            */
           public void receiveResultuser_ChangeUserAttributes_v1(
                    com.xyzmo.wwww.biometricserver.WebServiceUserAndProfileStub.User_ChangeUserAttributes_v1Response result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from user_ChangeUserAttributes_v1 operation
           */
            public void receiveErroruser_ChangeUserAttributes_v1(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for profile_Add_v1 method
            * override this method for handling normal response from profile_Add_v1 operation
            */
           public void receiveResultprofile_Add_v1(
                    com.xyzmo.wwww.biometricserver.WebServiceUserAndProfileStub.Profile_Add_v1Response result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from profile_Add_v1 operation
           */
            public void receiveErrorprofile_Add_v1(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for user_GetInfosFromAllProfiles_v1 method
            * override this method for handling normal response from user_GetInfosFromAllProfiles_v1 operation
            */
           public void receiveResultuser_GetInfosFromAllProfiles_v1(
                    com.xyzmo.wwww.biometricserver.WebServiceUserAndProfileStub.User_GetInfosFromAllProfiles_v1Response result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from user_GetInfosFromAllProfiles_v1 operation
           */
            public void receiveErroruser_GetInfosFromAllProfiles_v1(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for profile_ResetStatistics_v1 method
            * override this method for handling normal response from profile_ResetStatistics_v1 operation
            */
           public void receiveResultprofile_ResetStatistics_v1(
                    com.xyzmo.wwww.biometricserver.WebServiceUserAndProfileStub.Profile_ResetStatistics_v1Response result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from profile_ResetStatistics_v1 operation
           */
            public void receiveErrorprofile_ResetStatistics_v1(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for profile_GetInfosFromAllSignatures_v1 method
            * override this method for handling normal response from profile_GetInfosFromAllSignatures_v1 operation
            */
           public void receiveResultprofile_GetInfosFromAllSignatures_v1(
                    com.xyzmo.wwww.biometricserver.WebServiceUserAndProfileStub.Profile_GetInfosFromAllSignatures_v1Response result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from profile_GetInfosFromAllSignatures_v1 operation
           */
            public void receiveErrorprofile_GetInfosFromAllSignatures_v1(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for user_GetInfosFromUserFilteredRange_v1 method
            * override this method for handling normal response from user_GetInfosFromUserFilteredRange_v1 operation
            */
           public void receiveResultuser_GetInfosFromUserFilteredRange_v1(
                    com.xyzmo.wwww.biometricserver.WebServiceUserAndProfileStub.User_GetInfosFromUserFilteredRange_v1Response result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from user_GetInfosFromUserFilteredRange_v1 operation
           */
            public void receiveErroruser_GetInfosFromUserFilteredRange_v1(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for dynamicSignature_GetImage_v1 method
            * override this method for handling normal response from dynamicSignature_GetImage_v1 operation
            */
           public void receiveResultdynamicSignature_GetImage_v1(
                    com.xyzmo.wwww.biometricserver.WebServiceUserAndProfileStub.DynamicSignature_GetImage_v1Response result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from dynamicSignature_GetImage_v1 operation
           */
            public void receiveErrordynamicSignature_GetImage_v1(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for dynamicSignature_GetInfo_v1 method
            * override this method for handling normal response from dynamicSignature_GetInfo_v1 operation
            */
           public void receiveResultdynamicSignature_GetInfo_v1(
                    com.xyzmo.wwww.biometricserver.WebServiceUserAndProfileStub.DynamicSignature_GetInfo_v1Response result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from dynamicSignature_GetInfo_v1 operation
           */
            public void receiveErrordynamicSignature_GetInfo_v1(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for user_GetInfo_v1 method
            * override this method for handling normal response from user_GetInfo_v1 operation
            */
           public void receiveResultuser_GetInfo_v1(
                    com.xyzmo.wwww.biometricserver.WebServiceUserAndProfileStub.User_GetInfo_v1Response result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from user_GetInfo_v1 operation
           */
            public void receiveErroruser_GetInfo_v1(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for profile_GetInfo_v2 method
            * override this method for handling normal response from profile_GetInfo_v2 operation
            */
           public void receiveResultprofile_GetInfo_v2(
                    com.xyzmo.wwww.biometricserver.WebServiceUserAndProfileStub.Profile_GetInfo_v2Response result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from profile_GetInfo_v2 operation
           */
            public void receiveErrorprofile_GetInfo_v2(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for user_Delete_v1 method
            * override this method for handling normal response from user_Delete_v1 operation
            */
           public void receiveResultuser_Delete_v1(
                    com.xyzmo.wwww.biometricserver.WebServiceUserAndProfileStub.User_Delete_v1Response result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from user_Delete_v1 operation
           */
            public void receiveErroruser_Delete_v1(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for user_GetInfosFromAllUsers_v1 method
            * override this method for handling normal response from user_GetInfosFromAllUsers_v1 operation
            */
           public void receiveResultuser_GetInfosFromAllUsers_v1(
                    com.xyzmo.wwww.biometricserver.WebServiceUserAndProfileStub.User_GetInfosFromAllUsers_v1Response result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from user_GetInfosFromAllUsers_v1 operation
           */
            public void receiveErroruser_GetInfosFromAllUsers_v1(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for profile_Delete_v1 method
            * override this method for handling normal response from profile_Delete_v1 operation
            */
           public void receiveResultprofile_Delete_v1(
                    com.xyzmo.wwww.biometricserver.WebServiceUserAndProfileStub.Profile_Delete_v1Response result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from profile_Delete_v1 operation
           */
            public void receiveErrorprofile_Delete_v1(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for user_ResetStatistics_v1 method
            * override this method for handling normal response from user_ResetStatistics_v1 operation
            */
           public void receiveResultuser_ResetStatistics_v1(
                    com.xyzmo.wwww.biometricserver.WebServiceUserAndProfileStub.User_ResetStatistics_v1Response result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from user_ResetStatistics_v1 operation
           */
            public void receiveErroruser_ResetStatistics_v1(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for user_Suspend_v1 method
            * override this method for handling normal response from user_Suspend_v1 operation
            */
           public void receiveResultuser_Suspend_v1(
                    com.xyzmo.wwww.biometricserver.WebServiceUserAndProfileStub.User_Suspend_v1Response result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from user_Suspend_v1 operation
           */
            public void receiveErroruser_Suspend_v1(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for user_Resume_v1 method
            * override this method for handling normal response from user_Resume_v1 operation
            */
           public void receiveResultuser_Resume_v1(
                    com.xyzmo.wwww.biometricserver.WebServiceUserAndProfileStub.User_Resume_v1Response result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from user_Resume_v1 operation
           */
            public void receiveErroruser_Resume_v1(java.lang.Exception e) {
            }
                


    }
    