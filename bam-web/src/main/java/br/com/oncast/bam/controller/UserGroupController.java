package br.com.oncast.bam.controller;

import java.util.List;

import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.Validator;
import br.com.caelum.vraptor.ioc.RequestScoped;
import br.com.oncast.bam.domain.UserGroup;
import br.com.oncast.bam.repository.UserGroupRepository;

@Resource
@RequestScoped
public class UserGroupController {

	private Validator validator;
	private UserGroupRepository userGroupRepository;
	private Result result;

	public UserGroupController(UserGroupRepository userGroupRepository, Result result, Validator validator) {
		this.userGroupRepository = userGroupRepository;
		this.result = result;
		this.validator = validator;
	}

	@Get("/usergroups")
	public List<UserGroup> index() {
		return userGroupRepository.findAll();
	}

	@Get("/usergroups/new")
	public UserGroup newUserGroup() {
		return new UserGroup();
	}

	@Post("/usergroups")
	public void create(UserGroup userGroup) {
		validator.validate(userGroup);
		validator.onErrorUsePageOf(this).newUserGroup();
		userGroupRepository.create(userGroup);
		result.redirectTo(this).index();
	}
}
