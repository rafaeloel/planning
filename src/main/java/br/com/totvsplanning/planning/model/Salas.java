package br.com.totvsplanning.planning.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;

@Entity
public class Salas {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotBlank(message = "Favor informar o título.")
	private String titulo;

	@OneToMany
	private List<Usuario> usuario = new ArrayList();
	private Integer tipo;

	public Salas() {

	}

	public Salas(String titulo, Integer tipoJogo) {
		this.titulo = titulo;
		this.tipo = tipoJogo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Integer getTipoJogo() {
		return tipo;
	}

	public void setTipoJogo(Integer tipoJogo) {
		this.tipo = tipoJogo;
	}

	public List<Usuario> getUsuario() {
		return usuario;
	}

	public void setUsuario(List<Usuario> usuario) {
		this.usuario = usuario;
	}

}
