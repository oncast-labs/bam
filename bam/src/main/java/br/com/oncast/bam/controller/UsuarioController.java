package br.com.oncast.bam.controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import br.com.oncast.bam.domain.Usuario;
import br.com.oncast.bam.service.UsuarioService;

@ManagedBean(name="usuarioController")
@ViewScoped
public class UsuarioController {

	@ManagedProperty("#{usuarioService}")
	private UsuarioService usuarioService;

	private List<Usuario> listaUsuarios;

	private Usuario usuario;

	private String username;
	private String password;

	@PostConstruct
	public void init() {
	}
	
	public void setUsuarioService(UsuarioService usuarioService) {
		this.usuarioService = usuarioService;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Usuario> getListaUsuarios() {
		return listaUsuarios;
	}

}