package br.com.fiap.banco;

public class App {
	
	public static void main(String[] args) {
	
		ContaCorrente contaCorrente = new ContaCorrente(101010);
		ContaEspecial contaEspecial = new ContaEspecial(50212);
		
		ContaPoupanca contaPoupanca = new ContaPoupanca(98745);
		contaPoupanca.depositar(100);
		contaPoupanca.depositar(1000);
		contaPoupanca.depositar(-10000);
		
		
		contaPoupanca.transferir(500, contaCorrente);
		
		contaCorrente.transferir(100, contaEspecial);
		
		System.out.println(contaPoupanca.getNumero() + " " + contaPoupanca.getSaldo());
		System.out.println(contaCorrente.getNumero() + " " + contaCorrente.getSaldo());
		System.out.println(contaEspecial.getNumero() + " " + contaEspecial.getSaldo());

		System.out.println(contaPoupanca.totalDeContas);
		System.out.println(contaCorrente.totalDeContas);
		System.out.println(contaEspecial.totalDeContas);
		
		ContaCrypto contaCrypto = new ContaCrypto(0);
		
		System.out.println(contaPoupanca.totalDeContas);
		System.out.println(contaCorrente.totalDeContas);
		System.out.println(contaEspecial.totalDeContas);
		
		
		Conta.cotacaodoDolar();
	}

}
