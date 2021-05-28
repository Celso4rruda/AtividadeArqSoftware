package br.com.atvcamadaspackage.dominio;

import java.util.List;

import br.com.atvcamadaspackage.enumerator.*;

public class Cliente {

	private Integer id;
	private String nome;
	private String email;
	private String cpfOuCnpj;
	private TipoCliente tipo;

	private List<Pedido> pedido;
	private List<Endereco> enderecos;
	private List<String> telefone;

	public Cliente() {
		super();
	}

	public Cliente(Integer id, String nome, String email, String cpfOuCnpj, TipoCliente tipo, List<Pedido> pedido,
			List<Endereco> enderecos, List<String> telefone) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.cpfOuCnpj = cpfOuCnpj;
		this.tipo = tipo;
		this.pedido = pedido;
		this.enderecos = enderecos;
		this.telefone = telefone;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpfOuCnpj() {
		return cpfOuCnpj;
	}

	public void setCpfOuCnpj(String cpfOuCnpj) {
		this.cpfOuCnpj = cpfOuCnpj;
	}

	public TipoCliente getTipo() {
		return tipo;
	}

	public void setTipo(TipoCliente tipo) {
		this.tipo = tipo;
	}

	public List<Pedido> getPedido() {
		return pedido;
	}

	public void setPedido(List<Pedido> pedido) {
		this.pedido = pedido;
	}

	public List<Endereco> getEnderecos() {
		return enderecos;
	}

	public void setEnderecos(List<Endereco> enderecos) {
		this.enderecos = enderecos;
	}

	public List<String> getTelefone() {
		return telefone;
	}

	public void setTelefone(List<String> telefone) {
		this.telefone = telefone;
	}

}
