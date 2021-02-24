package com.npisistemas.brewer.model;

import org.hibernate.validator.constraints.NotBlank;

public class Usuario {
	@NotBlank(message = "Informe o nome")
	private String nome;
	
	private String email;
	
	private String dataNascimento;
	
	@NotBlank(message = "Informe a senha")
	private String senha;
	
	private Boolean status;
	
	private String permissao;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public String getPermissao() {
		return permissao;
	}

	public void setPermissao(String permissao) {
		this.permissao = permissao;
	}
}