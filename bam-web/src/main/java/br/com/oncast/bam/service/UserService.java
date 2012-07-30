package br.com.oncast.bam.service;

import br.com.caelum.vraptor.ioc.Component;
import br.com.oncast.bam.domain.User;
import br.com.oncast.bam.integration.xyzmo.UserProfileException;
import br.com.oncast.bam.integration.xyzmo.UserProfileWrapper;
import br.com.oncast.bam.repository.UserRepository;

@Component
public class UserService {

	private UserRepository userRepository;
	private UserProfileWrapper userProfileWrapper;

	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
		this.userProfileWrapper = new UserProfileWrapper();
	}

	public void create(User user) {
		userRepository.create(user);

		try {
			userProfileWrapper.addUser(user.getId().toString(), user.getName());
		} catch (UserProfileException e) {
			e.printStackTrace();
		}
	}
}
