package br.com.oncast.bam.integration;

import java.util.List;
import static org.junit.Assert.*;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import br.com.caelum.vraptor.util.test.JSR303MockValidator;
import br.com.caelum.vraptor.util.test.MockResult;
import br.com.caelum.vraptor.validator.Message;

public class IntegrationTest {

	protected EntityManager entityManager = Persistence
			.createEntityManagerFactory("default").createEntityManager();
	protected MockResult result = new MockResult();
	protected JSR303MockValidator validator = new JSR303MockValidator();

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

}
