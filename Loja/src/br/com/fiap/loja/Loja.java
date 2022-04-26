package br.com.fiap.loja;

public class Loja {
	
	public static void main(String[] args) {
		
		Livro livro = new Livro("Livro de Java", 30, "João Carlos");
		System.out.println(livro);
		
		Livro livro2 = new Livro("Livro de Python", 1500, "Fernanda");
		System.out.println(livro2);

		Smartphone smartphone = new Smartphone("Iphone X", 44000, "XS 256g");
		System.out.println(smartphone);
		
		
	}

}
