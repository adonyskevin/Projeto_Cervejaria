package com.npisistemas.brewer.model;

import org.hibernate.validator.constraints.NotBlank;

public class Cidade {
	@NotBlank(message = "Informe o nome")
	private String nome;
	
	@NotBlank(message = "Informe o Estado")
	private String estado;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
}
