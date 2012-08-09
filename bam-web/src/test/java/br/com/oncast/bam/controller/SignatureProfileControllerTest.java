package br.com.oncast.bam.controller;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import br.com.caelum.vraptor.util.test.MockResult;
import br.com.caelum.vraptor.util.test.MockValidator;
import br.com.oncast.bam.domain.SignatureProfile;
import br.com.oncast.bam.repository.SignatureProfileRepository;

public class SignatureProfileControllerTest {

	@Mock
	private SignatureProfileRepository signatureProfileRepository;

	private MockResult result;

	private MockValidator validator;

	private SignatureProfileController signatureProfileController;

	@Before
	public void setUp() {
		result = new MockResult();
		validator = new MockValidator();
		signatureProfileRepository = Mockito.mock(SignatureProfileRepository.class);
		signatureProfileController = new SignatureProfileController(signatureProfileRepository, validator, result);
	}

	@Test
	public void shouldGetAllSignatureProfiles() {
		when(signatureProfileRepository.findAll()).thenReturn(new ArrayList<SignatureProfile>());

		assertNotNull(signatureProfileController.index());
	}

	@Test
	public void shouldCreateNewSignatureProfile() {
		SignatureProfile signatureProfile = signatureProfileController.newSignatureProfile();

		assertNotNull(signatureProfile);
	}

	@Test
	public void shouldCreateSignatureProfile() {
		SignatureProfile signatureProfile = new SignatureProfile();

		signatureProfileController.create(signatureProfile);

		assertEquals("Perfil de assinatura adicionado com sucesso.", result.included("sucess"));
	}
}
