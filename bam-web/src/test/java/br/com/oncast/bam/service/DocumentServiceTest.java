package br.com.oncast.bam.service;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import br.com.caelum.vraptor.interceptor.multipart.DefaultUploadedFile;
import br.com.oncast.bam.CannotCopyDocumentException;
import br.com.oncast.bam.InvalidDocumentTypeException;
import br.com.oncast.bam.domain.Document;
import br.com.oncast.bam.repository.DocumentRepository;

public class DocumentServiceTest {

	@Mock
	private DocumentRepository documentRepository;
	private DocumentService documentService;

	@Before
	public void setUp() {
		documentRepository = Mockito.mock(DocumentRepository.class);
		documentService = new DocumentService(documentRepository);
		when(documentRepository.validContentTypes()).thenCallRealMethod();
	}

	@Test
	public void shouldStoreUploadedFileOnDisk() throws CannotCopyDocumentException, FileNotFoundException,
			InvalidDocumentTypeException {
		InputStream document = new FileInputStream(this.getClass().getResource("/teste.pdf").getPath());
		DefaultUploadedFile uploadedFile = new DefaultUploadedFile(document, "teste.pdf", "application/pdf");

		doNothing().when(documentRepository).create(new Document());
		documentService.store(uploadedFile);

		File fileOnDisk = new File(DocumentService.DEFAULT_PATH + uploadedFile.getFileName());
		assertTrue(fileOnDisk.exists());
	}

	@Test(expected = InvalidDocumentTypeException.class)
	public void shouldValidateDocumentType() throws CannotCopyDocumentException, FileNotFoundException,
			InvalidDocumentTypeException {
		InputStream document = new FileInputStream(this.getClass().getResource("/test.txt").getPath());
		DefaultUploadedFile uploadedFile = new DefaultUploadedFile(document, "test.txt", "application/text");

		documentService.store(uploadedFile);

		fail();
	}
}
