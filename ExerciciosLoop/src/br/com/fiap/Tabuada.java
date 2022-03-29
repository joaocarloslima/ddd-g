package br.com.fiap;

import javax.swing.JOptionPane;

public class Tabuada {
	
	public static void main(String[] args) {
		
		int numero = Integer.valueOf(JOptionPane.showInputDialog("Digite um numero"));
		int limite = Integer.valueOf(JOptionPane.showInputDialog("Digite o limite"));
		
		for(int i=0; i<=limite; i++) {

			System.out.println(numero + " x " + i + " = " + numero*i);
		
		}
		
		
	}

}
