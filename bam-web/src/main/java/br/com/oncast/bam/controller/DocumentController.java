package br.com.oncast.bam.controller;

import java.util.List;

import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.interceptor.multipart.UploadedFile;
import br.com.oncast.bam.CantCopyDocumentException;
import br.com.oncast.bam.InvalidDocumentTypeException;
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
			result.include("sucess", "O documento foi criado com sucesso");
			result.forwardTo(this).index();
		} catch (CantCopyDocumentException e) {
			result.include("fail",
					"Não foi possível copiar o arquivo para o servidor, por favor, entre em contato com o suporte técnico.");
			result.forwardTo(this).newDocument();
		} catch (InvalidDocumentTypeException e) {
			result.include("fail", "O tipo do documento selecionado não é válido.");
			result.forwardTo(this).newDocument();
		}
	}
}
