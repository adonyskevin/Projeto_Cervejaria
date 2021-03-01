package com.npisistemas.brewer.model;

import org.hibernate.validator.constraints.NotBlank;

public class Estilo {
	private int id;
	
	@NotBlank(message = "Informe o nome do estilo")
	private String nome;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
