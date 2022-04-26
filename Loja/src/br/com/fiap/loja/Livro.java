package br.com.fiap.loja;

public class Livro extends Produto {

	private String autor;
	
	public Livro(String descricao, double preco, String autor) {
		super(descricao, preco);
		this.autor = autor;
	}
	
	public Livro() {
		super(null, 0);
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	//sobrescrita de método
	@Override
	public String toString() {
		return this.getDescricao() + 
				" R$" + this.getPreco() + 
				"(" + this.getAutor() + ")";
	}

}
