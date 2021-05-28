package br.com.atvcamadaspackage.dominio;


public class ItemPedido {
	
	private Double desconto;
	private Integer quantidade;
	private Double preco;
	
	private Produto produto;
	private Pedido pedido;
	
	public ItemPedido() {
	
	}

	public ItemPedido(Double desconto, Integer quantidade, Double preco, Produto produto, Pedido pedido) {
		super();
		this.desconto = desconto;
		this.quantidade = quantidade;
		this.preco = preco;
		this.produto = produto;
		this.pedido = pedido;
	}

	public Double getDesconto() {
		return desconto;
	}

	public void setDesconto(Double desconto) {
		this.desconto = desconto;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	
	
	

}
