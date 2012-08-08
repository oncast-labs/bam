package br.com.oncast.bam.service;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.io.IOUtils;

import br.com.caelum.vraptor.interceptor.multipart.UploadedFile;
import br.com.caelum.vraptor.ioc.Component;
import br.com.oncast.bam.CannotCopyDocumentException;
import br.com.oncast.bam.InvalidDocumentTypeException;
import br.com.oncast.bam.domain.Document;
import br.com.oncast.bam.repository.DocumentRepository;

@Component
public class DocumentService {

	public static String DEFAULT_PATH = "c:/BAM/";
	private DocumentRepository documentRepository;

	public DocumentService(DocumentRepository documentRepository) {
		this.documentRepository = documentRepository;
	}

	public void store(UploadedFile uploadedFile) throws CannotCopyDocumentException, InvalidDocumentTypeException {
		validateFileType(uploadedFile);

		Document document = new Document();
		document.setName(uploadedFile.getFileName());

		documentRepository.create(document);
		copyFileToDisk(uploadedFile);
	}

	private void validateFileType(UploadedFile uploadedFile) throws InvalidDocumentTypeException {
		if (!documentRepository.validContentTypes().contains(uploadedFile.getContentType())) {
			throw new InvalidDocumentTypeException();
		}
	}

	private void copyFileToDisk(UploadedFile uploadedFile) throws CannotCopyDocumentException {
		try {
			File file = new File(DEFAULT_PATH + uploadedFile.getFileName());
			IOUtils.copyLarge(uploadedFile.getFile(), new FileOutputStream(file));
		} catch (IOException e) {
			throw new CannotCopyDocumentException();
		}
	}
}
