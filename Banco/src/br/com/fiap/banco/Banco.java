package br.com.fiap.banco;

public class Banco {

	public static void main(String[] args) {
		
		Conta conta = new Conta();
		conta.setNumero(123456);
		System.out.println(conta.getNumero() + " R$"
							+ conta.getSaldo());
		
		ContaPoupanca contaPoupanca = new ContaPoupanca();
		contaPoupanca.setNumero(987654);
		System.out.println(contaPoupanca.getNumero() + " R$"
							+contaPoupanca.getSaldo());
						
		
	}
	
}
