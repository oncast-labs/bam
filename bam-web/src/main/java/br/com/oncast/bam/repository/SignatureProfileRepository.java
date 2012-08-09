package br.com.oncast.bam.repository;

import javax.persistence.EntityManager;

import br.com.caelum.vraptor.ioc.Component;
import br.com.oncast.bam.domain.SignatureProfile;

@Component
public class SignatureProfileRepository extends Repository<SignatureProfile, Long> {

	public SignatureProfileRepository(EntityManager entityManager) {
		super(entityManager);
	}

}
