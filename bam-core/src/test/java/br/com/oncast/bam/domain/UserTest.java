package br.com.oncast.bam.domain;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class UserTest {

	@Test
	public void shouldBeEnabledByDefault() {
		User user = new User();
		assertTrue(user.isEnabled());
	}

}
