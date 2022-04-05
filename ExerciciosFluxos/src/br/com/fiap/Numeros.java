package br.com.fiap;

import javax.swing.JOptionPane;

public class Numeros {
	
	public static void main(String[] args) {
		
		int numero = 0;
		int quantidadeDePositivos = 0;
		int quantidadeDeNegativos = 0;
		int quantidadeDeZeros = 0;
		
		for(int i = 0 ; i< 5; i++) {
			numero = Integer.valueOf(JOptionPane.showInputDialog("Digite um número"));
			
			if(numero > 0) quantidadeDePositivos++;
			if(numero < 0) quantidadeDeNegativos++;
			if(numero == 0) quantidadeDeZeros++;	
			
		}
		
		System.out.println("Positivos = " + quantidadeDePositivos);
		System.out.println("Negativos = " + quantidadeDeNegativos);
		System.out.println("Zeros = " + quantidadeDeZeros);
		
	}

}
