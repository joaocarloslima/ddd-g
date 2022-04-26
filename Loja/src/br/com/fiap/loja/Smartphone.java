package br.com.fiap.loja;

public class Smartphone extends Produto {

	private String marca;
	private String modelo;
	
	public Smartphone(String descricao, double preco, String modelo) {
		super(descricao, preco);
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public String toString() {
		return "Smartphone [marca=" + marca + ", modelo=" + modelo + ", getDescricao()=" + getDescricao()
				+ ", preco=R$" + getPreco() + "]";
	}
	

}
