package br.com.fiap.jogo;

public class Jogo {
	
	public static void main(String[] args) {
		
		Jogador jogador1 = new Jogador();
		
		Jogador jogador2 = new Jogador("Pedro");
		
	
		System.out.println(jogador2.getXp());
		System.out.println(jogador2.getHp());
		
		mostrarSitucao(jogador2);

		
		jogador2.receberDano(10);
		System.out.println(jogador2.getHp());
		
		jogador2.receberCura(5);
		System.out.println(jogador2.getHp());
		
		jogador2.ganharExperiencia(-10);
		System.out.println(jogador2.getXp());
		
		jogador2.receberAntidoto();
		mostrarSitucao(jogador2);

		
		jogador2.receberAntidoto();
		mostrarSitucao(jogador2);

	}

	private static void mostrarSitucao(Jogador jogador) {
		if (jogador.isEnvenenado()) {
			System.out.println("🤢");
		}else {
			System.out.println("😎");
		}
	}

}
