package br.com.fiap.banco;

public final class ContaEspecial extends Conta {
	
	private double limite;

	public ContaEspecial(int numero) {
		super(numero);
	}

	public double getLimite() {
		return limite;
	}
	

	@Override
	public int calcularPontuacao() {	
		return (int) getLimite();
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

}
