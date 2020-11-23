package br.com.totvsplanning.planning.controller.dto;

import br.com.totvsplanning.planning.model.Usuario;

public class UsuarioDto {

	private String nome;
	private Integer tipoUser;

	public UsuarioDto(Usuario user) {
		this.nome = user.getNome();
		this.tipoUser = user.getTipo();
	}

	public String getNome() {
		return nome;
	}

	public Integer getTipoUser() {
		return tipoUser;
	}
}
