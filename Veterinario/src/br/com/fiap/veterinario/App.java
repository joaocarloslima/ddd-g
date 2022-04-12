package br.com.fiap.veterinario;

public class App {
	
	public static void main(String[] args) {
		//String nome = JOptionPane.showInputDialog(null, "Digite..");
		
		Gato felix = new Gato("Felix");
		felix.setCor("Preto");
		felix.setTamanho(10);
		//felix.genero = 'M';
		
		if(felix.isVacinado()) {
			
		}
		

		System.out.println("A cor do gato é " + felix.getCor());
		
		Gato garfield = new Gato();
		//garfield.nome = "Garfield";
		//garfield.cor = "Caramelo";
		//garfield.tamanho = -20;
		//garfield.genero = 'M';
		
		garfield.miar();
		felix.miar();
		
	}

}
