package br.com.oncast.bam.controller;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.interceptor.multipart.DefaultUploadedFile;
import br.com.caelum.vraptor.interceptor.multipart.UploadedFile;
import br.com.oncast.bam.CannotCopyDocumentException;
import br.com.oncast.bam.InvalidDocumentTypeException;
import br.com.oncast.bam.domain.document.Document;
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

	public void upload(UploadedFile uploadedFile) {
		try {
			documentService.store(uploadedFile);
			result.include("sucess", "O documento foi criado com sucesso");
		} catch (CannotCopyDocumentException e) {
			result.include("fail", "Não foi possível copiar o arquivo para o servidor, por favor, entre em contato com o suporte técnico.");
		} catch (InvalidDocumentTypeException e) {
			result.include("fail", "O tipo do documento selecionado não é válido.");
		}
	}

	@Post("/documents")
	public void upload(HttpServletRequest request, HttpServletResponse response) throws ServletException {

		PrintWriter writer = null;
		InputStream is = null;

		try {
			writer = response.getWriter();
		} catch (IOException ex) {
			ex.printStackTrace();
		}

		String fileName = request.getParameter("fileName");
		try {
			is = request.getInputStream();
			upload(new DefaultUploadedFile(is, fileName, "application/pdf"));
			is.close();
			response.setStatus(HttpServletResponse.SC_OK);
			writer.print("{ success: true }");
		} catch (FileNotFoundException ex) {
			response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
			writer.print("{ success: false }");
		} catch (IOException ex) {
			response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
			writer.print("{ success: false }");
		}

		writer.flush();
		writer.close();
	}

}
