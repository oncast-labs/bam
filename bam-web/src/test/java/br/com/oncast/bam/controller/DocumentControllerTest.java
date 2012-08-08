package br.com.oncast.bam.controller;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doThrow;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import br.com.caelum.vraptor.interceptor.multipart.DefaultUploadedFile;
import br.com.caelum.vraptor.util.test.MockResult;
import br.com.oncast.bam.CannotCopyDocumentException;
import br.com.oncast.bam.InvalidDocumentTypeException;
import br.com.oncast.bam.service.DocumentService;

public class DocumentControllerTest {

	@Mock
	private DocumentService documentService;

	private DocumentController documentController;
	private MockResult result;

	@Before
	public void setUp() {
		documentService = Mockito.mock(DocumentService.class);
		result = new MockResult();
		documentController = new DocumentController(documentService, null, result);
	}

	@Test
	public void shouldUploadDocument() throws FileNotFoundException, CannotCopyDocumentException,
			InvalidDocumentTypeException {
		// Given
		InputStream document = new FileInputStream(this.getClass().getResource("/teste.pdf").getPath());
		DefaultUploadedFile uploadedFile = new DefaultUploadedFile(document, "teste.pdf", "application/pdf");

		// Then
		doNothing().when(documentService).store(uploadedFile);
		documentController.upload(uploadedFile);

		// When
		String expected = "O documento foi criado com sucesso";
		assertEquals(expected, result.included("sucess"));
	}

	@Test
	public void shouldValidateDocumentType() throws FileNotFoundException, CannotCopyDocumentException,
			InvalidDocumentTypeException {
		// Given
		InputStream document = new FileInputStream(this.getClass().getResource("/teste.pdf").getPath());
		DefaultUploadedFile uploadedFile = new DefaultUploadedFile(document, "teste.pdf", "application/pdf");

		// Then
		doThrow(new InvalidDocumentTypeException()).when(documentService).store(uploadedFile);
		documentController.upload(uploadedFile);

		// When
		String expected = "O tipo do documento selecionado não é válido.";
		assertEquals(expected, result.included("fail"));

	}

	@Test
	public void shouldNoticeWhenCantCopyDocumentToDisk() throws FileNotFoundException, CannotCopyDocumentException,
			InvalidDocumentTypeException {
		// Given
		InputStream document = new FileInputStream(this.getClass().getResource("/teste.pdf").getPath());
		DefaultUploadedFile uploadedFile = new DefaultUploadedFile(document, "teste.pdf", "application/pdf");

		// Then
		doThrow(new CannotCopyDocumentException()).when(documentService).store(uploadedFile);
		documentController.upload(uploadedFile);

		// When
		String expected = "Não foi possível copiar o arquivo para o servidor, por favor, entre em contato com o suporte técnico.";
		assertEquals(expected, result.included("fail"));

	}

}
