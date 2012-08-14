package br.com.oncast.bam.controller;

import java.util.List;

import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.Validator;
import br.com.oncast.bam.domain.document.DocumentType;
import br.com.oncast.bam.repository.DocumentTypeRepository;

@Resource
public class DocumentTypeController {

	private DocumentTypeRepository documentTypeRepository;
	private Result result;
	private Validator validator;

	public DocumentTypeController(DocumentTypeRepository documentTypeRepository, Result result, Validator validator) {
		this.documentTypeRepository = documentTypeRepository;
		this.result = result;
		this.validator = validator;
	}

	@Get("/documenttypes/new")
	public DocumentType newDocumentType() {
		return new DocumentType();
	}

	@Post("/documenttypes")
	public void create(DocumentType documentType) {
		validator.validate(documentType);
		validator.onErrorUsePageOf(this).newDocumentType();

		documentTypeRepository.create(documentType);

		result.include("sucess", "Tipo de documento criado com sucesso.");
		result.redirectTo(this).index();
	}

	@Get("/documenttypes")
	public List<DocumentType> index() {
		return documentTypeRepository.findAll();
	}
}
