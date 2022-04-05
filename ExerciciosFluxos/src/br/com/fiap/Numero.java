package br.com.fiap;

import javax.swing.JOptionPane;

public class Numero {
	
	public static void main(String[] args) {
		
		int indice = 0;
		int numero = Integer.valueOf(JOptionPane.showInputDialog("Digite um número"));
		double limite = Math.pow(10, 3);
		String[] unidades = {" unidades", " dezenas", " centenas", " milhares"};
		
 		
		for(int i=1; i <= limite ; i*=10) {
			System.out.println(numero % (i*10) / i + unidades[indice++]);
		}

	}

}
