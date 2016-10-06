package com.spring.festa.model;

public class Convidado {
	private Long id;
	private String nome;
	private Integer quantidadeAcompanhantes;

	public Convidado() {
	}

	public Convidado(Long id, String nome, Integer quantidadeAcompanhantes) {
		this.id = id;
		this.nome = nome;
		this.quantidadeAcompanhantes = quantidadeAcompanhantes;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getQuantidadeAcompanhantes() {
		return quantidadeAcompanhantes;
	}

	public void setQuantidadeAcompanhantes(Integer quantidadeAcompanhantes) {
		this.quantidadeAcompanhantes = quantidadeAcompanhantes;
	}

}
