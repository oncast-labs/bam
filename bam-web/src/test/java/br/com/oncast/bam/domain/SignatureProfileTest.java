package br.com.oncast.bam.domain;

import static org.junit.Assert.assertFalse;

import org.junit.Test;

import br.com.oncast.bam.EnabledUserGroupsException;
import br.com.oncast.bam.EnabledUsersException;
import br.com.oncast.bam.domain.factory.UserFactory;
import br.com.oncast.bam.domain.factory.UserGroupFactory;

public class SignatureProfileTest {

	@Test
	public void shouldDisable() throws EnabledUsersException, EnabledUserGroupsException {
		SignatureProfile signatureProfile = new SignatureProfile();
		signatureProfile.addUser(UserFactory.getDisabledUser());
		signatureProfile.addUserGroup(UserGroupFactory.getDisabledUserGroup());

		signatureProfile.disable();

		assertFalse(signatureProfile.isEnabled());
	}

	@Test(expected = EnabledUsersException.class)
	public void shouldInformThatThereAreEnabledUsers() throws EnabledUsersException, EnabledUserGroupsException {
		SignatureProfile signatureProfile = new SignatureProfile();
		signatureProfile.addUser(UserFactory.getEnabledUser());

		signatureProfile.disable();
	}

	@Test(expected = EnabledUserGroupsException.class)
	public void shouldInformThatThereAreEnabledUserGroups() throws EnabledUsersException, EnabledUserGroupsException {
		SignatureProfile signatureProfile = new SignatureProfile();
		signatureProfile.addUser(UserFactory.getDisabledUser());
		signatureProfile.addUserGroup(UserGroupFactory.getEnabledUserGroup());

		signatureProfile.disable();
	}

}
