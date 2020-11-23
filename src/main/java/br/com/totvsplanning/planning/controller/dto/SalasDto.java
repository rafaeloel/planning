package br.com.totvsplanning.planning.controller.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import br.com.totvsplanning.planning.model.Salas;
import br.com.totvsplanning.planning.model.Usuario;

public class SalasDto {

	private Long id;
	private String titulo;
	private Integer tipo;
	private List<UsuarioDto> usuarios;

	public SalasDto(Salas salas) {
		this.id = salas.getId();
		this.titulo = salas.getTitulo();
		//this.usuario = salas.getUsuario();
		this.tipo = salas.getTipoJogo();
		
		this.usuarios = new ArrayList();
		this.usuarios.addAll(salas.getUsuario().stream().map(UsuarioDto::new).collect(Collectors.toList()));
	}

	public Long getId() {
		return id;
	}

	public String getTitulo() {
		return titulo;
	}

	public List<UsuarioDto> getUsuarios() {
		return usuarios;
	}

	public Integer getTipoJogo() {
		return tipo;
	}
	
	public static List<SalasDto> converter(List<Salas> sala){
		return sala.stream().map(SalasDto::new).collect(Collectors.toList());
	}

}
