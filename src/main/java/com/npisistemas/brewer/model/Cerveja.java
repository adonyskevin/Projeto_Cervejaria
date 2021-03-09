package com.npisistemas.brewer.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

import com.npisistemas.brewer.validation.SKU;

@Entity
@Table(name="cerveja")
public class Cerveja {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;
	
	@SKU
	@NotBlank(message = "Informe o SKU")
	private String sku;
	
	@NotBlank(message = "Informe o nome")
	private String nome;
	
	@NotBlank(message = "Informe a descrição")
	@Size(max = 50, min = 1, message = "A descrição deve ter entre 1 e 50 caracteres")
	private String descricao;
	
	@NotNull(message = "Informe o valor")
	@DecimalMin(value = "0.01", message = "O valor não deve ser maior que R$ 0,01")
	@DecimalMax(value = "9999999.99", message = "O valor não deve ser maior que R$ 9.999.999,99")
	private BigDecimal valor;
	
	@DecimalMax(value = "100", message = "O teor alcoólico não pode ser maior que 100%")
	@Column(name = "teor_alcoolico")
	private BigDecimal teorAlcoolico;
	
	@NotNull(message = "Informe a comissão")
	@DecimalMax(value = "100", message = "A comissão não pode ser maior que 100%")
	private BigDecimal comissao;
	
	@NotNull(message = "Informe o estilo")
	@ManyToOne
	@JoinColumn(name = "codigo_estilo")
	private Estilo estilo;
	
	@NotNull(message = "Informe a quantidade em estoque")
	@Max(value = 9999, message = "A quantidade em estoque não pode ser maior que 9.999")
	@Column(name = "quantidade_estoque")
	private Integer quantidadeEstoque;
	
	@NotNull(message = "Informe a origem")
	@Enumerated(EnumType.STRING)
	private Origem origem;
	
	@NotNull(message = "Informe o sabor")
	@Enumerated(EnumType.STRING)
	private Sabor sabor;
	
// GETTERS AND SETTERS	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cerveja other = (Cerveja) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}
	
	public Long getCodigo() {return codigo;}
	
	public void setCodigo(Long codigo) {this.codigo = codigo;}
	
	public BigDecimal getValor() {return valor;}
	
	public void setValor(BigDecimal valor) {this.valor = valor;}
	
	public BigDecimal getComissao() {return comissao;}
	
	public void setComissao(BigDecimal comissao) {
		if (comissao != null){
			this.comissao = comissao;
		}
		else this.comissao = BigDecimal.valueOf(0);
	}
	
	public BigDecimal getTeorAlcoolico() {return teorAlcoolico;}
	
	public void setTeorAlcoolico(BigDecimal teorAlcoolico) {
		if (teorAlcoolico != null){
			this.teorAlcoolico = teorAlcoolico;
		}
		else this.teorAlcoolico = BigDecimal.valueOf(0);
	}
	
	public Integer getQuantidadeEstoque() {return quantidadeEstoque;}
	
	public void setQuantidadeEstoque(Integer quantidadeEstoque) {this.quantidadeEstoque = quantidadeEstoque;}
	
	public Origem getOrigem() {return origem;}
	
	public void setOrigem(Origem origem) {this.origem = origem;}
	
	public Sabor getSabor() {return sabor;}
	
	public void setSabor(Sabor sabor) {this.sabor = sabor;}
	
	public Estilo getEstilo() {return estilo;}
	
	public void setEstilo(Estilo estilo) {this.estilo = estilo;}
	
	public String getSku() {return sku;}
	
	public void setSku(String sku) {this.sku = sku;}
	
	public String getNome() {return nome;}
	
	public void setNome(String nome) {this.nome = nome;}
	
	public String getDescricao() {return descricao;}
	
	public void setDescricao(String descricao) {this.descricao = descricao;}
}