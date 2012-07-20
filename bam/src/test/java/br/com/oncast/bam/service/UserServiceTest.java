package br.com.oncast.bam.service;

import static org.mockito.Mockito.verify;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import br.com.oncast.bam.domain.User;
import br.com.oncast.bam.repository.UserRepository;

@RunWith(MockitoJUnitRunner.class)
public class UserServiceTest {

	private UserService userService;

	@Mock
	private UserRepository userRepository;

	@Before
	public void setup() {
		userService = new UserService(userRepository);
	}

	@Test
	public void shouldCreateUser() {
		// Given
		User user = new User();
		user.setCpf("11111111111");
		user.setUsername("userTest");
		user.setPassword("userPass");

		// When
		userService.createUser(user);

		// Then
		verify(userRepository).create(user);
	}

}