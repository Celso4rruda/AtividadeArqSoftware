package br.com.atvcamadaspackage.enumerator;

public enum EstadoPagamento {
	ABERTO(0, "Aberto"), PAGO(1, "Pago"), CANCELADO(2, "cancelado");

	private Integer codigo;
	private String valor;

	EstadoPagamento(int codigo, String valor) {
		this.codigo = codigo;
		this.valor = valor;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

}
