package br.com.oncast.bam.domain.factory;

import br.com.oncast.bam.EnabledUsersException;
import br.com.oncast.bam.domain.user.UserGroup;

public class UserGroupFactory {

	public static UserGroup getEnabledUserGroup() {
		return new UserGroup();
	}

	public static UserGroup getDisabledUserGroup() {
		UserGroup userGroup = new UserGroup();
		userGroup.addUser(UserFactory.getDisabledUser());
		try {
			userGroup.disable();
		} catch (EnabledUsersException e) {
			e.printStackTrace();
		}
		return userGroup;
	}

}
