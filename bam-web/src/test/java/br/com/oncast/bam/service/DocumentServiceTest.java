package br.com.oncast.bam.service;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.doNothing;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import br.com.caelum.vraptor.interceptor.multipart.DefaultUploadedFile;
import br.com.oncast.bam.CopyFileException;
import br.com.oncast.bam.domain.Document;
import br.com.oncast.bam.repository.DocumentRepository;

public class DocumentServiceTest {

	@Mock
	private DocumentRepository documentRepository;

	@Before
	public void setUp() {
		documentRepository = Mockito.mock(DocumentRepository.class);
	}

	@Test
	public void shouldStoreUploadedFileOnDisk() throws CopyFileException, FileNotFoundException {
		// Given
		InputStream document = new FileInputStream(this.getClass().getResource("/teste.pdf").getPath());
		DefaultUploadedFile uploadedFile = new DefaultUploadedFile(document, "teste.pdf", null);

		// When
		doNothing().when(documentRepository).create(new Document());
		DocumentService documentService = new DocumentService(documentRepository);
		documentService.store(uploadedFile);

		// Then
		File fileOnDisk = new File(DocumentService.DEFAULT_PATH + uploadedFile.getFileName());
		assertTrue(fileOnDisk.exists());
	}
}
