package br.com.fiap;

import javax.swing.JOptionPane;

public class Circulo {
	
	public static void main(String[] args) {
		
		double raio = 
				Double.valueOf(JOptionPane.showInputDialog("Digite o raio do círculo"));
		
		double diametro = 2 * raio;
		double circunferencia = 2 * Math.PI * raio;
		double area = Math.PI * Math.pow(raio, 2);

		System.out.println("Diâmetro = " + diametro);
		System.out.println("Circunferência = " + circunferencia);
		System.out.println("Área = " + area);
		
	}

}
