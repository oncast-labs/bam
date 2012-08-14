package br.com.oncast.bam.repository;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;

import br.com.caelum.vraptor.ioc.Component;
import br.com.oncast.bam.domain.document.Document;

@Component
public class DocumentRepository extends Repository<Document, Long> {

	public DocumentRepository(EntityManager entityManager) {
		super(entityManager);
	}

	public List<String> validContentTypes() {
		return Arrays.asList("application/pdf");
	}

}
