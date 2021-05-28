package br.com.atvcamadaspackage.dominio;

import java.sql.Date;
import java.util.List;

public class Pedido {

	private Integer id;
	private Date instante;

	private List<ItemPedido> itens;
	private Pagamento pagamento;
	private Cliente cliente;
	private Endereco enderecoDeEntrega;

	public Pedido() {

	}

	public Pedido(Integer id, Date instante, List<ItemPedido> itens, Pagamento pagamento, Cliente cliente,
			Endereco enderecoDeEntrega) {
		super();
		this.id = id;
		this.instante = instante;
		this.itens = itens;
		this.pagamento = pagamento;
		this.cliente = cliente;
		this.enderecoDeEntrega = enderecoDeEntrega;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getInstante() {
		return instante;
	}

	public void setInstante(Date instante) {
		this.instante = instante;
	}

	public List<ItemPedido> getItens() {
		return itens;
	}

	public void setItens(List<ItemPedido> itens) {
		this.itens = itens;
	}

	public Pagamento getPagamento() {
		return pagamento;
	}

	public void setPagamento(Pagamento pagamento) {
		this.pagamento = pagamento;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Endereco getEnderecoDeEntrega() {
		return enderecoDeEntrega;
	}

	public void setEnderecoDeEntrega(Endereco enderecoDeEntrega) {
		this.enderecoDeEntrega = enderecoDeEntrega;
	}

}
