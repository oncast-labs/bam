package br.com.oncast.bam.service;

import static org.mockito.Mockito.verify;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import br.com.oncast.bam.domain.User;
import br.com.oncast.bam.domain.factory.UserFactory;
import br.com.oncast.bam.integration.xyzmo.UserProfileException;
import br.com.oncast.bam.integration.xyzmo.UserProfileWrapper;
import br.com.oncast.bam.repository.UserRepository;

@RunWith(MockitoJUnitRunner.class)
public class UserServiceTest {

	private UserService userService;

	@Mock
	private UserRepository userRepository;

	@Mock
	private UserProfileWrapper userProfileWrapper;

	@Before
	public void setup() {
		userService = new UserService(userRepository, userProfileWrapper);
	}

	@Test
	public void shouldCreateUser() throws UserProfileException {
		// Given
		User user = UserFactory.getUser();
		user.setId(1L);

		// When
		userService.create(user);

		// Then
		verify(userRepository).create(user);
		verify(userProfileWrapper).addUser(user.getId().toString(), user.getName());
	}

}