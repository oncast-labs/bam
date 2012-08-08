package br.com.oncast.bam.repository;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.caelum.vraptor.ioc.Component;
import br.com.oncast.bam.domain.User;

@Component
public class UserRepository extends Repository<User, Long> {

	public UserRepository(EntityManager entityManager) {
		super(entityManager);
	}

	public User findByUsername(String username) {
		TypedQuery<User> query = entityManager.createQuery(
				"from br.com.oncast.bam.domain.User where username = :username", User.class);
		query.setParameter("username", username);
		return (User) query.getSingleResult();
	}
}
