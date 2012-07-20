package br.com.oncast.bam.controller;

import java.util.List;

import br.com.caelum.vraptor.Delete;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Put;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.Validator;
import br.com.oncast.bam.domain.User;
import br.com.oncast.bam.repository.UserRepository;

@Resource
public class UserController {

	private final Result result;
	private final UserRepository repository;
	private final Validator validator;

	UserController(Result result, UserRepository repository, Validator validator) {
		this.result = result;
		this.repository = repository;
		this.validator = validator;
	}

	@Get("/users")
	public List<User> index() {
		return repository.findAll();
	}

	@Post("/users")
	public void create(User user) {
		validator.validate(user);
		validator.onErrorUsePageOf(this).newUser();
		repository.create(user);
		result.redirectTo(this).index();
	}

	@Get("/users/new")
	public User newUser() {
		return new User();
	}

	@Put("/users")
	public void update(User user) {
		validator.validate(user);
		validator.onErrorUsePageOf(this).edit(user);
		repository.update(user);
		result.redirectTo(this).index();
	}

	@Get("/users/{user.id}/edit")
	public User edit(User user) {
		return repository.find(user.getId());
	}

	@Delete("/users/{user.id}")
	public void destroy(User user) {
		repository.destroy(repository.find(user.getId()));
		result.redirectTo(this).index();
	}
}