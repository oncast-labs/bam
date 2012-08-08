package br.com.oncast.bam.domain.factory;

import br.com.oncast.bam.domain.UserGroup;

public class UserGroupFactory {

	public static UserGroup getEnabledUserGroup() {
		return new UserGroup();
	}

}
