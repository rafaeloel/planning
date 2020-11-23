package br.com.totvsplanning.planning.model;

import javax.persistence.Id;

public class Votos {

	@Id
	private Long id;
	private Long salaId;
	private Long itemId;
	private Long userId;
	private Integer pontuacao;

	public Votos() {

	}

	public Votos(Long salaId, Long itemId, Long userId, Integer pontuacao) {
		this.salaId = salaId;
		this.itemId = itemId;
		this.userId = userId;
		this.pontuacao = pontuacao;
	}

	public Long getSalaId() {
		return salaId;
	}

	public void setSalaId(Long salaId) {
		this.salaId = salaId;
	}

	public Long getItemId() {
		return itemId;
	}

	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Integer getPontuacao() {
		return pontuacao;
	}

	public void setPontuacao(Integer pontuacao) {
		this.pontuacao = pontuacao;
	}

	public Long getId() {
		return id;
	}

}
