package br.com.fiap;

import javax.swing.JOptionPane;

public class OperacoesBasicas {

	public static void main(String[] args) {
		//refatorar

		int numero1 = Integer.valueOf(JOptionPane.showInputDialog("Digite um n�mero"));
		int numero2 = Integer.valueOf(JOptionPane.showInputDialog("Digite outro n�mero"));

		//System.out.printf("Soma = %d", soma); 
		System.out.println("SOMA = " + (numero1 + numero2));
		System.out.println("DIFEREN�A = " + (numero1 - numero2));
		System.out.println("MULTIPLICA��O = " + numero1 * numero2);
		System.out.println("DIVIS�O = " + numero1 / numero2);
	}
}
