package br.com.fiap.rh;

public class Autenticador {
	
	private String senha;
	
	public boolean autenticar(String senhaDigitada) {
		return this.senha == senhaDigitada;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}


}
