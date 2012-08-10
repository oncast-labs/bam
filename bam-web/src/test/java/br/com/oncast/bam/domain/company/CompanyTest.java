package br.com.oncast.bam.domain.company;

import static org.junit.Assert.*;

import org.junit.Test;

public class CompanyTest {

	@Test
	public void shouldAddContact() {
		Contact contact = new Contact();
		Company company = new Company();

		company.addContact(contact);

		assertTrue(company.getContacts().contains(contact));
	}

}
