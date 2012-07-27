package br.com.oncast.bam.integration.xyzmo;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import br.com.oncast.bam.domain.User;
import br.com.oncast.bam.domain.factory.UserFactory;

public class UserProfileWrapperTest {
	
	private UserProfileWrapper wrapper;
	
	@Before
	public void setUp() {
		wrapper = new UserProfileWrapper();
	}

	@Test
	public void shouldCreateNewUser() {
		//given
		User user = UserFactory.getUser();
		user.setId(1L);
		
		try {
			//when
			wrapper.addUser(user);
		} catch(UserProfileException e) {
			//then
			fail();
		}
	}
	
	@Test
	public void shouldDeleteExistingUser() {
		//given
		User user = new User();;
		user.setId(1L);
		
		try {
			//when
			wrapper.deleteUser(user);
		} catch(UserProfileException e) {
			//then
			fail();
		}
	}
	
}
