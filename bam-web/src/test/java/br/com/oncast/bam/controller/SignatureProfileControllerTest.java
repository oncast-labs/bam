package br.com.oncast.bam.controller;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

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
		MockitoAnnotations.initMocks(this);
		result = spy(new MockResult());
		validator = new MockValidator();
		signatureProfileController = new SignatureProfileController(signatureProfileRepository, validator, result);
	}

	@Test
	public void shouldGetAllSignatureProfiles() {
		signatureProfileRepository.findAll();

		verify(signatureProfileRepository).findAll();
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
		verify(result).redirectTo(signatureProfileController.index());
	}
}
