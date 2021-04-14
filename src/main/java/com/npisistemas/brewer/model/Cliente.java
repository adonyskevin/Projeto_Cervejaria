package com.npisistemas.brewer.model;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

public class Cliente {
	@NotBlank(message = "Informe o nome")
	private String nome;
	
	@NotNull(message = "Informe o tipo de pessoa")
	@Enumerated(EnumType.STRING)
	private TipoPessoa tipoPessoa;
	
	@NotBlank
	private String numeroInscricao;
	
	private String telefone;
	
	private String email;
	
	private String logradouro;
	
	private int numero;
	
	@Size(max = 50, min = 5)
	private String complemento;
	
	@Size(max = 10, min = 8)
	private String cep;
	
	@NotNull(message = "Informe um estado")
	private Estado estado;
	
	@Size(max = 25)
	private String cidade;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNumeroInscricao() {
		return numeroInscricao;
	}
	public void setNumeroInscricao(String numeroInscricao) {
		this.numeroInscricao = numeroInscricao;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
}
