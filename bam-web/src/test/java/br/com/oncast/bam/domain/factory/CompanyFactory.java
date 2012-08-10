package br.com.oncast.bam.domain.factory;

import br.com.oncast.bam.domain.company.Company;

public class CompanyFactory {

	public static Company getCompany() {
		Company company = new Company();
		company.setName("MMC");
		company.setCnpj("71928692141914");
		return company;
	}

}
