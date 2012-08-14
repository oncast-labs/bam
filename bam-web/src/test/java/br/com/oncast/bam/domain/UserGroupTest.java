package br.com.oncast.bam.domain;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import br.com.oncast.bam.EnabledUsersException;
import br.com.oncast.bam.domain.factory.UserFactory;
import br.com.oncast.bam.domain.factory.UserGroupFactory;
import br.com.oncast.bam.domain.user.User;
import br.com.oncast.bam.domain.user.UserGroup;

public class UserGroupTest {

	@Test
	public void shouldBeEnabledByDefault() {
		UserGroup group = new UserGroup();
		assertTrue(group.isEnabled());
	}

	@Test
	public void shouldAddMember() {
		User user = UserFactory.getUser();

		UserGroup group = new UserGroup();
		group.addUser(user);

		assertTrue(group.getMembers().contains(user));
	}

	@Test(expected = EnabledUsersException.class)
	public void shouldNotDisableWhenThereAreEnabledUsers() throws EnabledUsersException {
		UserGroup group = UserGroupFactory.getEnabledUserGroup();
		group.addUser(UserFactory.getDisabledUser());
		group.addUser(UserFactory.getEnabledUser());

		group.disable();
	}

	@Test
	public void shouldDisableIfThereAreOnlyDisabledUsers() throws EnabledUsersException {
		UserGroup group = UserGroupFactory.getEnabledUserGroup();
		group.addUser(UserFactory.getDisabledUser());

		group.disable();

		assertFalse(group.isEnabled());
	}
}
