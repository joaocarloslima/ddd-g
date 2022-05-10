package br.com.fiap.rh;

public final class Presidente extends Funcionario implements Autenticavel {
	
	private double valorDaCotaDeAcoes;
	private Autenticador autenticador = new Autenticador();

	public double calcularSalario() {
		return super.getSalario() + this.valorDaCotaDeAcoes;
	}

	public double getValorDaCotaDeAcoes() {
		return valorDaCotaDeAcoes;
	}

	public void setValorDaCotaDeAcoes(double valorDaCotaDeAcoes) {
		this.valorDaCotaDeAcoes = valorDaCotaDeAcoes;
	}

	@Override
	public boolean logar(String senhaDigitada) {
		return autenticador.autenticar(senhaDigitada);
	}

	
}
