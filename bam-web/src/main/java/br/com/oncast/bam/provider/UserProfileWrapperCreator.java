package br.com.oncast.bam.provider;

import br.com.caelum.vraptor.ioc.Component;
import br.com.caelum.vraptor.ioc.ComponentFactory;
import br.com.oncast.bam.integration.xyzmo.UserProfileWrapper;
import br.com.oncast.bam.integration.xyzmo.factory.BiometricServerFactory;

@Component
public class UserProfileWrapperCreator implements ComponentFactory<UserProfileWrapper> {

	@Override
	public UserProfileWrapper getInstance() {
		return new UserProfileWrapper(new BiometricServerFactory());
	}

}
