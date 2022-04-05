package br.com.fiap;

import javax.swing.JOptionPane;

public class Multiplos {
	
	public static void main(String[] args) {
		
		int numero1 = 
				Integer.valueOf(JOptionPane.showInputDialog("Digite um numero"));
		
		int numero2 = 
				Integer.valueOf(JOptionPane.showInputDialog("Digite outro numero"));
		
		
		if (numero1 % numero2 == 0) {
			System.out.println(numero1 + " é múltiplo de " + numero2);
		}else {
			System.out.println(numero1 + " não é múltiplo de " + numero2);
		}	
		
		if (numero2 % numero1 == 0) {
			System.out.println(numero2 + " é múltiplo de " + numero1);
		}else {
			System.out.println(numero2 + " não é múltiplo de " + numero1);
		}	
		
				
	}

}
