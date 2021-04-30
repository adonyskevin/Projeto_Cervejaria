package com.npisistemas.brewer.repository.filter;

import com.npisistemas.brewer.model.Estado;

public class CidadeFilter {
	
	private Long codigo;
	private String nome;
	private Estado estado;
	
	public Long getCodigo() {
		return codigo;
	}
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Estado getEstado() {
		return estado;
	}
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
}
