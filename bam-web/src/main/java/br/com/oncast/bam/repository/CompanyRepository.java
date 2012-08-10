package br.com.oncast.bam.repository;

import javax.persistence.EntityManager;

import br.com.caelum.vraptor.ioc.Component;
import br.com.oncast.bam.domain.company.Company;

@Component
public class CompanyRepository extends Repository<Company, Long> {

	public CompanyRepository(EntityManager entityManager) {
		super(entityManager);
	}

}
