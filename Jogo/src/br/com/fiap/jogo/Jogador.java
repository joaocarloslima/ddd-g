package br.com.fiap.jogo;

public class Jogador {

	private String nome;
	private int xp;
	private int hp;
	private boolean envenenado;
	
	//construtor padrão
	public Jogador() {
		this.xp = 0;
		this.hp = 100;
		this.envenenado = false;
	}
	
	//sobrecarga do método construtor
	public Jogador(String nome) {
		this.nome = nome;
		this.xp = 0;
		this.hp = 100;
		this.envenenado = false;
	}
	
	//métodos de acesso
	public int getXp() { //assinatura do método
		return this.xp;
	}
	
	public int getHp() {
		return this.hp;
	}
	
	public boolean isEnvenenado() {
		return this.envenenado;
	}
	
	//métodos de ação / métodos de trabalho / workers
	public void receberDano(int pontos) {
		if (pontos > 0) this.hp -= pontos;
	}
	
	public void receberCura(int pontos) {
		if (pontos > 0) this.hp += pontos;
	}
	
	public void ganharExperiencia(int pontos) {
		if (pontos > 0) this.xp += pontos;
	}
	
	public void receberAntidoto() {
		envenenado = !envenenado;
	}
	
}
