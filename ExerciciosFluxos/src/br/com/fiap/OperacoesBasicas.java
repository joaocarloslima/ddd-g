package br.com.fiap;

import javax.swing.JOptionPane;

public class OperacoesBasicas {

	public static void main(String[] args) {
		//refatorar

		int numero1 = Integer.valueOf(JOptionPane.showInputDialog("Digite um número"));
		int numero2 = Integer.valueOf(JOptionPane.showInputDialog("Digite outro número"));

		//System.out.printf("Soma = %d", soma); 
		System.out.println("SOMA = " + (numero1 + numero2));
		System.out.println("DIFERENÇA = " + (numero1 - numero2));
		System.out.println("MULTIPLICAÇÃO = " + numero1 * numero2);
		System.out.println("DIVISÃO = " + numero1 / numero2);
	}
}
