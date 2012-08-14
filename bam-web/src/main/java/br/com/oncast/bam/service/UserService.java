package br.com.oncast.bam.service;

import org.springframework.security.core.context.SecurityContextHolder;

import br.com.caelum.vraptor.ioc.Component;
import br.com.oncast.bam.domain.user.User;
import br.com.oncast.bam.integration.xyzmo.UserProfileException;
import br.com.oncast.bam.integration.xyzmo.UserProfileWrapper;
import br.com.oncast.bam.repository.UserRepository;

@Component
public class UserService {

	private UserRepository userRepository;
	private UserProfileWrapper userProfileWrapper;

	public UserService(UserRepository userRepository, UserProfileWrapper userProfileWrapper) {
		this.userRepository = userRepository;
		this.userProfileWrapper = userProfileWrapper;
	}

	public void create(User user) {
		userRepository.create(user);

		try {
			userProfileWrapper.addUser(user.getId().toString(), user.getName());
		} catch (UserProfileException e) {
			e.printStackTrace();
		}
	}

	public User getLoggedUser() {
		String username = SecurityContextHolder.getContext().getAuthentication().getName();
		return userRepository.findByUsername(username);
	}
}
