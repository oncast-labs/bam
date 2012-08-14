package br.com.oncast.bam.controller;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.verify;
import static org.mockito.MockitoAnnotations.initMocks;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import br.com.caelum.vraptor.util.test.MockResult;
import br.com.caelum.vraptor.util.test.MockValidator;
import br.com.oncast.bam.domain.document.DocumentType;
import br.com.oncast.bam.domain.factory.DocumentTypeFactory;
import br.com.oncast.bam.repository.DocumentTypeRepository;

public class DocumentTypeControllerTest {

	@Mock
	private DocumentTypeRepository documentTypeRepository;

	private MockResult result;
	private MockValidator validator;
	private DocumentTypeController documentTypeController;

	@Before
	public void setUp() {
		initMocks(this);
		result = new MockResult();
		validator = new MockValidator();
		documentTypeController = new DocumentTypeController(documentTypeRepository, result, validator);
	}

	@Test
	public void shouldReturnAllDocumentTypes() {
		documentTypeController.index();

		verify(documentTypeRepository).findAll();
	}

	@Test
	public void shouldReturnNewDocumentType() {
		assertNotNull(documentTypeController.newDocumentType());
	}

	@Test
	public void shouldCreateDocumentType() {
		DocumentType documentType = DocumentTypeFactory.getDocumentType();

		documentTypeController.create(documentType);

		verify(documentTypeRepository).create(documentType);
		assertEquals("Tipo de documento criado com sucesso.", result.included("sucess"));
	}
}
