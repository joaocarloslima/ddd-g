package br.com.fiap;

import javax.swing.JOptionPane;

public class Fatorial {

	public static void main(String[] args) {

		int fatorial = 1;
		
		System.out.println("2" + "2");
		
		int numero = Integer.valueOf(JOptionPane.showInputDialog("Digite um numero"));;
		
		for(int i=numero; i >= 1; i--) {
			fatorial *= i;
		}
		
		System.out.println(fatorial);

	}

}
