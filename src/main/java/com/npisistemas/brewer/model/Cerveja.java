package com.npisistemas.brewer.model;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

public class Cerveja {
	@NotBlank(message = "Informe o SKU")
	private String sku;
	
	@NotBlank(message = "Informe o nome")
	private String nome;
	
	@Size(max = 50, min = 5, message = "A descrição deve ter entre 5 e 50 caracteres")
	private String descricao;
	
	public String getSku() {
		return sku;
	}
	public void setSku(String sku) {
		this.sku = sku;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}