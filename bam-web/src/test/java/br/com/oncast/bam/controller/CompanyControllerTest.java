package br.com.oncast.bam.controller;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import br.com.caelum.vraptor.util.test.JSR303MockValidator;
import br.com.caelum.vraptor.util.test.MockResult;
import br.com.caelum.vraptor.util.test.MockValidator;
import br.com.caelum.vraptor.validator.ValidationException;
import br.com.oncast.bam.domain.company.Company;
import br.com.oncast.bam.domain.factory.CompanyFactory;
import br.com.oncast.bam.repository.CompanyRepository;

public class CompanyControllerTest {

	@Mock
	private CompanyRepository companyRepository;

	private MockResult result;
	private MockValidator validator;
	private CompanyController companyController;

	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
		result = spy(new MockResult());
		validator = spy(new JSR303MockValidator());
		companyController = new CompanyController(companyRepository, result, validator);
	}

	@Test
	public void shouldReturnNewCompany() {
		assertNotNull(companyController.newCompany());
	}

	@Test
	public void shouldCreateCompany() {
		Company company = CompanyFactory.getCompany();

		companyController.create(company);

		verify(companyRepository).create(company);
		assertEquals("A empresa foi incluida com sucesso.", result.included("sucess"));
	}

	@Test(expected = ValidationException.class)
	public void shouldNotCreateCompany() {
		companyController.create(new Company());
	}

	@Test
	public void shouldReturnAllCompanies() {
		companyController.index();

		verify(companyRepository).findAll();
	}

}
