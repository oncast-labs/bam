package br.com.oncast.bam.domain;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class UsuarioTest {
	
	@Test
	public void testUsuarioUsername() {
		Usuario u = new Usuario();
		u.setUsername("lapavila");
		assertEquals("lapavila", u.getUsername());
	}
	
	@Test
	public void testUsuarioPassword() {
		Usuario u = new Usuario();
		u.setPassword("1234");
		assertEquals("1234", u.getPassword());
	}
}
