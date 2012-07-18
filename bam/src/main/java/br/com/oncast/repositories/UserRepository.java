package br.com.oncast.repositories;

import java.util.List;

import br.com.oncast.domain.User;

public interface UserRepository {

	void create(User entity);

	User update(User entity);

	void destroy(User entity);

	User find(Long id);

	List<User> findAll();

}
