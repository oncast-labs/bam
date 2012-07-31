package br.com.oncast.bam.repository;

import javax.persistence.EntityManager;

import br.com.caelum.vraptor.ioc.Component;
import br.com.oncast.bam.domain.Document;

@Component
public class DocumentRepository extends Repository<Document, Long> {

	public DocumentRepository(EntityManager entityManager) {
		super(entityManager);
	}

}
