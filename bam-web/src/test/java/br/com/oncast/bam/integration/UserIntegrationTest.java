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
		User user = UserFactory.getUserWithoutName();

		try {
			userController.create(user);
		} catch (ValidationException e) {
			shouldContainErrorMessage("name", "may not be null", validator.getErrors());
		}
	}

	@Test
	public void shouldValidatePresenceOfCpf() {
		User user = UserFactory.getUserWithoutCpf();

		try {
			userController.create(user);
		} catch (ValidationException e) {
			shouldContainErrorMessage("cpf", "may not be null", validator.getErrors());
		}
	}

	@Test
	public void shouldValidatePresenceOfEmail() {
		User user = UserFactory.getUserWithoutEmail();

		try {
			userController.create(user);
		} catch (ValidationException e) {
			shouldContainErrorMessage("email", "may not be null", validator.getErrors());
		}
	}

	@Test
	public void shouldValidatePresenceOfUsername() {
		User user = UserFactory.getUserWithoutUsername();

		try {
			userController.create(user);
		} catch (ValidationException e) {
			shouldContainErrorMessage("username", "may not be null", validator.getErrors());
		}
	}

	@Test
	public void shouldCreateUserWithValidData() {
		User user = UserFactory.getUser();

		userController.create(user);

		assertEquals(result.included("sucess"), "Usuário incluído com sucesso!");
	}
}
