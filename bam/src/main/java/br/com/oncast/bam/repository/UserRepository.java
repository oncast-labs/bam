package br.com.oncast.bam.repository;

import javax.persistence.EntityManager;

import br.com.caelum.vraptor.ioc.Component;
import br.com.oncast.bam.domain.User;

@Component
public class UserRepository extends Repository<User, Long> {

	UserRepository(EntityManager entityManager) {
		super(entityManager);
	}
}
