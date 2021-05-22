package Dominio;

import java.sql.Date;

import Enumerador.EstadoPagamento;

public class PagamentoComBoleto extends Pagamento {

	private Date dataVencimento;
	private Date dataPagamento;

	public PagamentoComBoleto() {
		// TODO Auto-generated constructor stub
	}

	

	public PagamentoComBoleto(Integer id, EstadoPagamento estado, Pedido pedido, Date dataVencimento,
			Date dataPagamento) {
		super(id, estado, pedido);
		this.dataVencimento = dataVencimento;
		this.dataPagamento = dataPagamento;
	}



	public Date getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public Date getDataPagamento() {
		return dataPagamento;
	}

	public void setDataPagamento(Date dataPagamento) {
		this.dataPagamento = dataPagamento;
	}

}
