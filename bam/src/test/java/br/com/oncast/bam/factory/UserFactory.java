package br.com.oncast.bam.factory;

import br.com.oncast.bam.domain.User;

public class UserFactory {

	public static User getUser() {
		User user = new User();
		user.setCpf("01234567890");
		user.setName("Lauro");
		user.setPassword("123456");
		user.setEmail("teste@teste.com");
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

}
