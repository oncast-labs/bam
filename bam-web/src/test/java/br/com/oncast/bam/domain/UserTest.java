package br.com.oncast.bam.domain;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import br.com.oncast.bam.domain.factory.UserFactory;
import br.com.oncast.bam.domain.user.User;

public class UserTest {

	@Test
	public void shouldBeEnabledByDefault() {
		User user = new User();
		assertTrue(user.isEnabled());
	}

	@Test
	public void shouldDisable() {
		User user = UserFactory.getEnabledUser();
		user.disable();
		assertFalse(user.isEnabled());
	}

}
