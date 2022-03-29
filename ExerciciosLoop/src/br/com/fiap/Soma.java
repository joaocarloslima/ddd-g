package br.com.fiap;

import javax.swing.JOptionPane;

public class Soma {

	public static void main(String[] args) {

		double soma = 0;

		while (soma < 500) {
			soma += Double.valueOf(JOptionPane.showInputDialog("Soma atual=" + soma + "\nDigite um valor"));
		}

	}

}
