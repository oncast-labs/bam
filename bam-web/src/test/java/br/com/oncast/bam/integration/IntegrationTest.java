package br.com.oncast.bam.integration;

import static org.junit.Assert.fail;

import java.util.List;

import javax.persistence.EntityManager;

import org.junit.After;
import org.junit.Before;

import br.com.caelum.vraptor.util.test.JSR303MockValidator;
import br.com.caelum.vraptor.util.test.MockResult;
import br.com.caelum.vraptor.validator.Message;
import br.com.oncast.bam.infra.EntityManagerFactory;

public class IntegrationTest {

	protected EntityManager entityManager;
	protected MockResult result = new MockResult();
	protected JSR303MockValidator validator = new JSR303MockValidator();

	@Before
	public void init() {
		entityManager = EntityManagerFactory.getEntityManager();
		entityManager.getTransaction().begin();
		result = new MockResult();
		validator = new JSR303MockValidator();
	}

	protected void shouldContainErrorMessage(String attributeName, String messageName, List<Message> errors) {
		for (Message message : errors) {
			if (message.getCategory().equals(attributeName)) {
				if (message.getMessage().equals(messageName)) {
					return;
				}
			}
		}

		fail(String.format("Error message '%s' not found for attribute '%s'", messageName, attributeName));
	}

	@After
	public void tearDown() {
		entityManager.getTransaction().rollback();
	}
}
