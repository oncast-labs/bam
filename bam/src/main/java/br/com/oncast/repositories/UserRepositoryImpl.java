package br.com.oncast.repositories;

import javax.persistence.EntityManager;

import br.com.caelum.vraptor.ioc.Component;
import br.com.oncast.domain.User;

@Component
public class UserRepositoryImpl extends Repository<User, Long> implements
		UserRepository {

	UserRepositoryImpl(EntityManager entityManager) {
		super(entityManager);
	}
}
