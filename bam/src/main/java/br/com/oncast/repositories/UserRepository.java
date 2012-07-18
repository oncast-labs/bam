package br.com.oncast.repositories;

import javax.persistence.EntityManager;

import br.com.caelum.vraptor.ioc.Component;
import br.com.oncast.domain.User;

@Component
public class UserRepository extends Repository<User, Long> {

	UserRepository(EntityManager entityManager) {
		super(entityManager);
	}
}
