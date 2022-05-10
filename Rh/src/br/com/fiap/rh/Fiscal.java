package br.com.fiap.rh;

public class Fiscal implements Autenticavel {
	
	private Autenticador autenticador = new Autenticador();

	@Override
	public boolean logar(String senhaDigitada) {
		return autenticador.autenticar(senhaDigitada);
	}

	
}
