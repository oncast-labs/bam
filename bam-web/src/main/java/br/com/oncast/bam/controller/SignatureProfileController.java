package br.com.oncast.bam.controller;

import java.util.List;

import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.Validator;
import br.com.oncast.bam.domain.SignatureProfile;
import br.com.oncast.bam.repository.SignatureProfileRepository;

@Resource
public class SignatureProfileController {

	private SignatureProfileRepository signatureProfileRepository;
	private Result result;
	private Validator validator;

	public SignatureProfileController(SignatureProfileRepository signatureProfileRepository, Validator validator,
			Result result) {
		this.signatureProfileRepository = signatureProfileRepository;
		this.validator = validator;
		this.result = result;
	}

	@Get("/signatureprofiles")
	public List<SignatureProfile> index() {
		return signatureProfileRepository.findAll();
	}

	@Get("/signatureprofiles/new")
	public SignatureProfile newSignatureProfile() {
		return new SignatureProfile();
	}

	@Post("/signatureprofiles")
	public void create(SignatureProfile signatureProfile) {
		validator.validate(signatureProfile);
		validator.onErrorUsePageOf(this).newSignatureProfile();

		signatureProfileRepository.create(signatureProfile);

		result.include("sucess", "Perfil de assinatura adicionado com sucesso.");
		result.redirectTo(this.index());
	}
}
