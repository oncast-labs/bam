package br.com.oncast.bam.repository;

import javax.persistence.EntityManager;

import br.com.caelum.vraptor.ioc.Component;
import br.com.oncast.bam.domain.document.DocumentType;

@Component
public class DocumentTypeRepository extends Repository<DocumentType, Long> {

	public DocumentTypeRepository(EntityManager entityManager) {
		super(entityManager);
	}

}
