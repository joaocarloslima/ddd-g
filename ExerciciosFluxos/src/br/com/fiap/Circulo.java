package br.com.fiap;

import javax.swing.JOptionPane;

public class Circulo {
	
	public static void main(String[] args) {
		
		double raio = 
				Double.valueOf(JOptionPane.showInputDialog("Digite o raio do c�rculo"));
		
		double diametro = 2 * raio;
		double circunferencia = 2 * Math.PI * raio;
		double area = Math.PI * Math.pow(raio, 2);

		System.out.println("Di�metro = " + diametro);
		System.out.println("Circunfer�ncia = " + circunferencia);
		System.out.println("�rea = " + area);
		
	}

}
