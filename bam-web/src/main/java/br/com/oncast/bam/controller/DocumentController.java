package br.com.oncast.bam.controller;

import java.util.List;

import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.interceptor.multipart.UploadedFile;
import br.com.oncast.bam.CopyFileException;
import br.com.oncast.bam.domain.Document;
import br.com.oncast.bam.repository.DocumentRepository;
import br.com.oncast.bam.service.DocumentService;

@Resource
public class DocumentController {

	private DocumentService documentService;
	private DocumentRepository documentRepository;
	private Result result;

	public DocumentController(DocumentService documentService, DocumentRepository documentRepository, Result result) {
		this.documentService = documentService;
		this.documentRepository = documentRepository;
		this.result = result;
	}

	@Get("/documents")
	public List<Document> index() {
		return documentRepository.findAll();
	}

	@Get("/documents/new")
	public Document newDocument() {
		return new Document();
	}

	@Post("/documents")
	public void upload(UploadedFile uploadedFile) {
		try {
			documentService.store(uploadedFile);
		} catch (CopyFileException e) {
			e.printStackTrace();
		}
		result.forwardTo(this).index();
	}
}
