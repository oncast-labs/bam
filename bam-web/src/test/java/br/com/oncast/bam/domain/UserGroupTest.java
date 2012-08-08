package br.com.oncast.bam.domain;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import br.com.oncast.bam.EnabledUsersInGroupException;
import br.com.oncast.bam.domain.factory.UserFactory;
import br.com.oncast.bam.domain.factory.UserGroupFactory;

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
		group.addMember(user);

		assertTrue(group.getMembers().contains(user));
	}

	@Test(expected = EnabledUsersInGroupException.class)
	public void shouldNotDisableWhenThereAreEnabledUsers() throws EnabledUsersInGroupException {
		UserGroup group = UserGroupFactory.getEnabledUserGroup();
		group.addMember(UserFactory.getDisabledUser());
		group.addMember(UserFactory.getEnabledUser());

		group.disable();
	}

	@Test
	public void shouldDisableIfThereAreOnlyDisabledUsers() throws EnabledUsersInGroupException {
		UserGroup group = UserGroupFactory.getEnabledUserGroup();
		group.addMember(UserFactory.getDisabledUser());

		group.disable();

		assertFalse(group.isEnabled());
	}
}
