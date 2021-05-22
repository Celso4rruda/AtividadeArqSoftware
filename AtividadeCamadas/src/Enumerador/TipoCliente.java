package Enumerador;

public enum TipoCliente {

	PessoaFisica(0, "Pessoa Física"), PessoaJuridica(1, "Pessoa Jurídica");

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
