package br.com.fiap;

import javax.swing.JOptionPane;

public class Multiplos {
	
	public static void main(String[] args) {
		
		int numero1 = 
				Integer.valueOf(JOptionPane.showInputDialog("Digite um numero"));
		
		int numero2 = 
				Integer.valueOf(JOptionPane.showInputDialog("Digite outro numero"));
		
		
		if (numero1 % numero2 == 0) {
			System.out.println(numero1 + " � m�ltiplo de " + numero2);
		}else {
			System.out.println(numero1 + " n�o � m�ltiplo de " + numero2);
		}	
		
		if (numero2 % numero1 == 0) {
			System.out.println(numero2 + " � m�ltiplo de " + numero1);
		}else {
			System.out.println(numero2 + " n�o � m�ltiplo de " + numero1);
		}	
		
				
	}

}
