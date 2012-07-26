package br.com.oncast.bam.service;

import br.com.caelum.vraptor.ioc.Component;
import br.com.oncast.bam.domain.User;
import br.com.oncast.bam.repository.UserRepository;

@Component
public class UserService {

	private UserRepository userRepository;

	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	public void createUser(User user) {
		userRepository.create(user);
	}
}
