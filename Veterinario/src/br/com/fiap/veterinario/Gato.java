package br.com.fiap.veterinario;

public class Gato {
	
	//atributos
	private String cor;
	private double tamanho;
	private char genero;
	private String nome;
	private boolean vacinado;
	
	public boolean isVacinado() {
		return this.vacinado;
	}
	
	public Gato(String nome) {
		this.nome = nome;
		this.tamanho = 10;
	}
	//sobrecarga de método
	public Gato(String cor, char genero) {
		
	}
	
	//métodos Gets e Sets
	public String getCor() {
		return this.cor;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}	
	public void setTamanho(double tamanho) {
		if(tamanho <= 0) {
			System.err.println("Tamanho inválido");
		}else {
			this.tamanho = tamanho;
		}
	}
	
	public void miar() {
		System.out.println(nome + " diz: Miau");
	}
	
	public void miar(String dialeto) {
		System.out.println(nome + " diz: Miau");
	}
	
	public void miar(int decibeis) {
		System.out.println(nome + " diz: Miau");
	}
	
	
	
	public void julgar() {
		
	}
	

}
