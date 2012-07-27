package br.com.oncast.bam.integration;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import br.com.caelum.vraptor.validator.ValidationException;
import br.com.oncast.bam.controller.UserController;
import br.com.oncast.bam.domain.User;
import br.com.oncast.bam.domain.factory.UserFactory;
import br.com.oncast.bam.repository.UserRepository;

public class UserIT extends IntegrationTest {

	private UserController userController;
	private UserRepository userRepository;

	@Before
	public void setUp() {
		userRepository = new UserRepository(entityManager);
		userController = new UserController(result, userRepository, validator);
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
	public void shouldCreateUserWithValidData() {
		// Given
		User user = UserFactory.getUser();

		// When
		userController.create(user);

		// Then
		assertEquals(result.included("sucess"), "Usuário incluído com sucesso!");
	}
}
