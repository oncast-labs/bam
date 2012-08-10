package br.com.oncast.bam.domain.company;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

import br.com.caelum.stella.bean.validation.CNPJ;

@Entity
public class Company {

	@Id
	@GeneratedValue
	private Long id;

	@NotNull
	private String name;

	@CNPJ
	@Column(unique = true)
	private String cnpj;

	@OneToOne
	private Address address;

	@OneToMany
	private List<Contact> contacts;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Long getId() {
		return id;
	}

	public List<Contact> getContacts() {
		return contacts;
	}

	public void addContact(Contact newContact) {
		if (contacts == null)
			contacts = new ArrayList<Contact>();
		contacts.add(newContact);
	}

}
