package br.com.atvcamadaspackage.enumerator;

public enum TipoCliente {

	PessoaFisica(0, "Pessoa F�sica"), PessoaJuridica(1, "Pessoa Jur�dica");

	private Integer codigo;
	private String valor;

	TipoCliente(int codigo, String valor) {
		this.codigo = codigo;
		this.valor = valor;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public String getValor() {
		return valor;
	}
}
