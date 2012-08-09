package br.com.oncast.bam.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Email;

import br.com.caelum.stella.bean.validation.CPF;

@Entity(name = "BAM_USER")
public class User {

	@Id
	@GeneratedValue
	private Long id;

	@CPF
	@NotNull
	@Column(unique = true)
	private String cpf;

	@Email
	@NotNull
	@Column(unique = true)
	private String email;

	@NotNull
	private String username;

	@NotNull
	private String password;

	@NotNull
	private String name;

	private boolean enabled = true;

	@ManyToOne
	private SignatureProfile signatureProfile;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void disable() {
		enabled = false;
	}

	public SignatureProfile getSignatureProfile() {
		return signatureProfile;
	}

	public void setSignatureProfile(SignatureProfile signatureProfile) {
		this.signatureProfile = signatureProfile;
	}

}
