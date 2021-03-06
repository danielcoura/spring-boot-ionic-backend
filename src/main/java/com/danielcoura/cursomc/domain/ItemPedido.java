package com.danielcoura.cursomc.domain;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class ItemPedido implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	@JsonIgnore
	private ItemPedidoPK id = new ItemPedidoPK();
	
	private Double desconto;
	
	private Integer quantitade;
	
	private Double preco;
	
	public ItemPedido() {
		// TODO Auto-generated constructor stub
	}

	public ItemPedido(Pedido pedido, Produto produto, Double desconto, Integer quantitade, Double preco) {
		super();
		this.id.setProduto(produto);
		this.id.setPedido(pedido);
		this.desconto = desconto;
		this.quantitade = quantitade;
		this.preco = preco;
	}

	@JsonIgnore
	public Pedido getPedido() {
		return id.getPedido();
	}

	public Produto getProduto() {
		return id.getProduto();
	}

	public ItemPedidoPK getId() {
		return id;
	}

	public void setId(ItemPedidoPK id) {
		this.id = id;
	}

	public Double getDesconto() {
		return desconto;
	}

	public void setDesconto(Double desconto) {
		this.desconto = desconto;
	}

	public Integer getQuantitade() {
		return quantitade;
	}

	public void setQuantitade(Integer quantitade) {
		this.quantitade = quantitade;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		ItemPedido other = (ItemPedido) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	

	
}
