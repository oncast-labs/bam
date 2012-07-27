package br.com.oncast.bam.integration.xyzmo;

import java.rmi.RemoteException;

import br.com.oncast.bam.domain.User;
import br.com.oncast.bam.integration.xyzmo.factory.BiometricServerFactory;

import com.xyzmo.wwww.biometricserver.WebServiceUserAndProfileStub;
import com.xyzmo.wwww.biometricserver.WebServiceUserAndProfileStub.BioUserStatus;
import com.xyzmo.wwww.biometricserver.WebServiceUserAndProfileStub.User_Add_v1;
import com.xyzmo.wwww.biometricserver.WebServiceUserAndProfileStub.User_Add_v1Response;
import com.xyzmo.wwww.biometricserver.WebServiceUserAndProfileStub.User_Delete_v1;
import com.xyzmo.wwww.biometricserver.WebServiceUserAndProfileStub.User_Delete_v1Response;

public class UserProfileWrapper {

	public void addUser(User user) throws UserProfileException {
		try {
			BiometricServerFactory serverFactory = new BiometricServerFactory();
			User_Add_v1 bioUser = new User_Add_v1();
			bioUser.setBioUserId(user.getId().toString());
			bioUser.setDisplayName(user.getName());
			bioUser.setBioUserStatus(BioUserStatus.Active);
			User_Add_v1Response userAddResponse;
			userAddResponse = serverFactory.getWebServiceProxyUserAndProfile().user_Add_v1(bioUser);
			if (userAddResponse.getUser_Add_v1Result().getBaseResult() != WebServiceUserAndProfileStub.BaseResultEnum.ok) {
				throw new UserProfileException(userAddResponse.getUser_Add_v1Result().getErrorInfo().getErrorMsg());
			}
		} catch (RemoteException e) {
			throw new UserProfileException(e);
		}
	}
	
	public void deleteUser(User user) throws UserProfileException {
		try {
			BiometricServerFactory serverFactory = new BiometricServerFactory();
			User_Delete_v1 bioUser = new User_Delete_v1();
			bioUser.setBioUserId(user.getId().toString());
			User_Delete_v1Response userDeleteResponse;
			userDeleteResponse = serverFactory.getWebServiceProxyUserAndProfile().user_Delete_v1(bioUser);
			if (userDeleteResponse.getUser_Delete_v1Result().getBaseResult() != WebServiceUserAndProfileStub.BaseResultEnum.ok) {
				throw new UserProfileException(userDeleteResponse.getUser_Delete_v1Result().getErrorInfo().getErrorMsg());
			}
		} catch (RemoteException e) {
			throw new UserProfileException(e);
		}
	}

}
