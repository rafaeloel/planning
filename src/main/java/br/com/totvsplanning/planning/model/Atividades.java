package br.com.totvsplanning.planning.model;

import javax.persistence.Id;

public class Atividades {

	@Id 
	private Long id;
	private String descricao;
	private int nota;

	public Atividades() {
		
	}
	
	public Atividades(Long id, String descricao, int nota) {
		this.id = id;
		this.descricao = descricao;
		this.nota = nota;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}

	public Long getId() {
		return id;
	}

}
