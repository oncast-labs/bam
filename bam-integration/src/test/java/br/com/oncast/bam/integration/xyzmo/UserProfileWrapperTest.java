package br.com.oncast.bam.integration.xyzmo;

import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class UserProfileWrapperTest {
	
	private UserProfileWrapper wrapper;
	
	@Before
	public void setUp() throws UserProfileException {
		wrapper = new UserProfileWrapper();
	}

	@Test
	public void shouldCreateNewUser() {
		//given
		String userId = "newTestUser";
		String fullName = "The New User For Test";
		
		try {
			//when
			wrapper.addUser(userId, fullName);
		} catch(UserProfileException e) {
			//then
			fail();
		}
		
		//remove the user
		try {
			wrapper.deleteUser(userId);
		} catch(UserProfileException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void shouldDeleteExistingUser() {
		//given
		String userId = "existingTestUser";
		try {
			//configure existing user
			wrapper.addUser(userId, "Existing Test User");
		} catch (UserProfileException e) {
			e.printStackTrace();
		}
		
		try {
			//when
			wrapper.deleteUser(userId);
		} catch(UserProfileException e) {
			//then
			fail();
		}
	}
	
}
