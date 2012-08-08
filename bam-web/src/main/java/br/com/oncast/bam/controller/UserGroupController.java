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
import br.com.oncast.bam.service.UserService;

@Resource
@RequestScoped
public class UserGroupController {

	private Validator validator;
	private UserGroupRepository userGroupRepository;
	private Result result;
	private UserService userService;

	public UserGroupController(UserGroupRepository userGroupRepository, Result result, Validator validator,
			UserService userService) {
		this.userGroupRepository = userGroupRepository;
		this.result = result;
		this.validator = validator;
		this.userService = userService;
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
		userGroup.setAdministrator(userService.getLoggedUser());
		validator.validate(userGroup);
		validator.onErrorUsePageOf(this).newUserGroup();
		userGroupRepository.create(userGroup);
		result.redirectTo(this).index();
	}
}
