package br.com.oncast.bam.controller;

import java.util.List;

import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.Validator;
import br.com.oncast.bam.domain.company.Company;
import br.com.oncast.bam.repository.CompanyRepository;

@Resource
public class CompanyController {

	private CompanyRepository companyRepository;
	private Result result;
	private Validator validator;

	public CompanyController(CompanyRepository companyRepository, Result result, Validator validator) {
		this.companyRepository = companyRepository;
		this.result = result;
		this.validator = validator;
	}

	@Get("/companies/new")
	public Company newCompany() {
		return new Company();
	}

	@Post("/companies")
	public void create(Company company) {
		validator.validate(company);
		validator.onErrorUsePageOf(this).newCompany();

		companyRepository.create(company);

		result.include("sucess", "A empresa foi incluida com sucesso.");
		result.redirectTo(this).index();
	}

	@Get("/companies")
	public List<Company> index() {
		return companyRepository.findAll();
	}

}
