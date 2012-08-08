package br.com.oncast.bam.integration;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import br.com.caelum.vraptor.validator.ValidationException;
import br.com.oncast.bam.controller.UserController;
import br.com.oncast.bam.domain.User;
import br.com.oncast.bam.domain.factory.UserFactory;
import br.com.oncast.bam.integration.xyzmo.UserProfileWrapper;
import br.com.oncast.bam.integration.xyzmo.factory.BiometricServerFactory;
import br.com.oncast.bam.repository.UserRepository;
import br.com.oncast.bam.service.UserService;

public class UserIntegrationTest extends IntegrationTest {

	private UserController userController;
	private UserRepository userRepository;
	private UserService userService;

	@Before
	public void setUp() {
		userRepository = new UserRepository(entityManager);
		userService = new UserService(userRepository, new UserProfileWrapper(new BiometricServerFactory()));
		userController = new UserController(result, userService, userRepository, validator);
	}

	@Test
	public void shouldValidatePresenceOfName() {
		// Given
		User user = UserFactory.getUserWithoutName();

		try {
			// When
			userController.create(user);
		} catch (ValidationException e) {
			// Then
			shouldContainErrorMessage("name", "may not be null", validator.getErrors());
		}
	}

	@Test
	public void shouldValidatePresenceOfCpf() {
		// Given
		User user = UserFactory.getUserWithoutCpf();

		try {
			// When
			userController.create(user);
		} catch (ValidationException e) {
			// Then
			shouldContainErrorMessage("cpf", "may not be null", validator.getErrors());
		}
	}

	@Test
	public void shouldValidatePresenceOfEmail() {
		// Given
		User user = UserFactory.getUserWithoutEmail();

		try {
			// When
			userController.create(user);
		} catch (ValidationException e) {
			// Then
			shouldContainErrorMessage("email", "may not be null", validator.getErrors());
		}
	}

	@Test
	public void shouldValidatePresenceOfUsername() {
		// Given
		User user = UserFactory.getUserWithoutUsername();

		try {
			// When
			userController.create(user);
		} catch (ValidationException e) {
			// Then
			shouldContainErrorMessage("username", "may not be null", validator.getErrors());
		}
	}

	@Test
	public void shouldCreateUserWithValidData() {
		// Given
		User user = UserFactory.getUser();

		// When
		userController.create(user);

		// Then
		assertEquals(result.included("sucess"), "Usuário incluído com sucesso!");
	}
}
