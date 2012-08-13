package br.com.oncast.bam.controller;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.spy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import br.com.caelum.vraptor.interceptor.multipart.DefaultUploadedFile;
import br.com.caelum.vraptor.interceptor.multipart.UploadedFile;
import br.com.caelum.vraptor.util.test.MockResult;
import br.com.oncast.bam.CannotCopyDocumentException;
import br.com.oncast.bam.InvalidDocumentTypeException;
import br.com.oncast.bam.repository.DocumentRepository;
import br.com.oncast.bam.service.DocumentService;

public class DocumentControllerTest {

	@Mock
	private DocumentService documentService;

	@Mock
	private DocumentRepository documentRepository;

	private DocumentController documentController;
	private MockResult result;
	private UploadedFile uploadedFile;

	@Before
	public void setUp() {
		result = spy(new MockResult());
		MockitoAnnotations.initMocks(this);

		documentController = new DocumentController(documentService, documentRepository, result);

		initUploadedFile();
	}

	@Test
	public void shouldUploadDocument() throws Exception {
		documentController.upload(uploadedFile);

		assertEquals("O documento foi criado com sucesso", result.included("sucess"));
	}

	@Test
	public void shouldValidateDocumentType() throws Exception {
		doThrow(new InvalidDocumentTypeException()).when(documentService).store(uploadedFile);

		documentController.upload(uploadedFile);

		String expected = "O tipo do documento selecionado não é válido.";
		assertEquals(expected, result.included("fail"));
	}

	@Test
	public void shouldNoticeWhenCantCopyDocumentToDisk() throws Exception {
		doThrow(new CannotCopyDocumentException()).when(documentService).store(uploadedFile);

		documentController.upload(uploadedFile);

		String expected = "Não foi possível copiar o arquivo para o servidor, por favor, entre em contato com o suporte técnico.";
		assertEquals(expected, result.included("fail"));
	}

	private void initUploadedFile() {
		try {
			InputStream document = new FileInputStream(this.getClass().getResource("/teste.pdf").getPath());
			uploadedFile = new DefaultUploadedFile(document, "teste.pdf", "application/pdf");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
