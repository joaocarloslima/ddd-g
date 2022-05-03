package br.com.fiap.banco;

public abstract class Conta {

	protected static int totalDeContas = 0;
	protected static final String NOME_DO_BANCO = "Fiap Bank";
	private int numero;
	private String nomeDoTitular;
	private double saldo;
	
	public Conta(int numero) {
		this.numero = numero;
		totalDeContas++;
	}

	public Conta(int numero, String nomeDoTitular) {
		this.numero = numero;
		this.nomeDoTitular = nomeDoTitular;
		totalDeContas++;
	}
	
	public abstract int calcularPontuacao();
	
	public static double cotacaodoDolar() {
		return 5.23;
	}
	
	public void depositar(double valor) {
		if (valor > 0) this.saldo += valor;
	}
	
	public final void sacar(double valor) {
		if (valor > 0) this.saldo -= valor;
	}
	
	public void transferir(double valor, Conta contaDestino) {//polimorfismo
		this.sacar(valor);
		contaDestino.depositar(valor);
	}
	
	public int getNumero() {
		return numero;
	}

	public String getNomeDoTitular() {
		return nomeDoTitular;
	}

	public void setNomeDoTitular(String nomeDoTitular) {
		this.nomeDoTitular = nomeDoTitular;
	}

	public double getSaldo() {
		return saldo;
	}
	
	
}
