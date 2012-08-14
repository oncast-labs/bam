package br.com.oncast.bam.repository;

import static org.junit.Assert.assertNotNull;

import javax.persistence.EntityManager;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import br.com.oncast.bam.domain.factory.UserFactory;
import br.com.oncast.bam.domain.user.User;
import br.com.oncast.bam.infra.EntityManagerFactory;

public class UserRepositoryTest {

	private EntityManager entityManager;
	private UserRepository userRepository;

	@Before
	public void setUp() {
		entityManager = EntityManagerFactory.getEntityManager();
		entityManager.getTransaction().begin();
		userRepository = new UserRepository(entityManager);
	}

	@Test
	public void shouldFindByUsername() {
		User user = UserFactory.getUser();
		userRepository.create(user);

		assertNotNull(userRepository.findByUsername(user.getUsername()));
	}

	@After
	public void tearDown() {
		entityManager.getTransaction().rollback();
	}

}
