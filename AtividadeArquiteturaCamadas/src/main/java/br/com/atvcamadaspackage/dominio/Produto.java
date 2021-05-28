package br.com.atvcamadaspackage.dominio;

import java.util.List;

public class Produto {

	private int id;
	private String nome;
	private double preco;

	private List<Categoria> categoria;
	private List<ItemPedido> pedido;

	public Produto() {

	}

	public Produto(int id, String nome, double preco, List<Categoria> categoria, List<ItemPedido> pedido) {
		super();
		this.id = id;
		this.nome = nome;
		this.preco = preco;
		this.categoria = categoria;
		this.pedido = pedido;
	}

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

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public List<Categoria> getCategoria() {
		return categoria;
	}

	public void setCategoria(List<Categoria> categoria) {
		this.categoria = categoria;
	}

	public List<ItemPedido> getPedido() {
		return pedido;
	}

	public void setPedido(List<ItemPedido> pedido) {
		this.pedido = pedido;
	}

	

}
