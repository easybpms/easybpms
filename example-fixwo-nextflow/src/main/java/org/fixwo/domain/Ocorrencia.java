package org.fixwo.domain;

public class Ocorrencia {
	
	private Long id;
	private String cliente;
	private Boolean existeArea;
	private String status;
	private String setor;
	private String feedback;
	private Boolean avaliacao;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public Boolean getExisteArea() {
		return existeArea;
	}
	public void setExisteArea(Boolean existeArea) {
		this.existeArea = existeArea;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getSetor() {
		return setor;
	}
	public void setSetor(String setor) {
		this.setor = setor;
	}
	public String getFeedback() {
		return feedback;
	}
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
	public Boolean getAvaliacao() {
		return avaliacao;
	}
	public void setAvaliacao(Boolean avaliacao) {
		this.avaliacao = avaliacao;
	}

}
