package br.com.totvsplanning.planning.controller.form;

import br.com.totvsplanning.planning.model.Salas;

public class SalaForm {

	private String titulo;
	private Integer tipo;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Integer getTpJogo() {
		return tipo;
	}

	public void setTpJogo(Integer tpJogo) {
		this.tipo = tpJogo;
	}	
	
	public Salas converter() {
		return new Salas(titulo, tipo);
	}
}
