package br.com.oncast.bam.domain.factory;

import br.com.oncast.bam.domain.user.User;

public class UserFactory {

	public static User getUser() {
		User user = new User();
		user.setCpf("01234567890");
		user.setName("Lauro");
		user.setPassword("123456");
		user.setEmail("teste@teste.com");
		user.setUsername("laurocaetano");
		return user;
	}

	public static User getUserWithoutName() {
		User user = getUser();
		user.setName(null);
		return user;
	}

	public static User getUserWithoutCpf() {
		User user = getUser();
		user.setCpf(null);
		return user;
	}

	public static User getUserWithoutEmail() {
		User user = getUser();
		user.setEmail(null);
		return user;
	}

	public static User getUserWithoutUsername() {
		User user = getUser();
		user.setUsername(null);
		return user;
	}

	public static User getEnabledUser() {
		User user = getUser();
		return user;
	}

	public static User getDisabledUser() {
		User user = getUser();
		user.disable();
		return user;
	}
}
