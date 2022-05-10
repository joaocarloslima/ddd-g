package br.com.fiap.rh;

public class Gerente extends Funcionario implements Autenticavel {

	private String area;
	private double bonus;
	private String senha;

	public double calcularSalario() {
		return super.getSalario() + this.bonus;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	@Override
	public boolean logar(String senhaDigitada) {
		return this.senha == senhaDigitada;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}


	

}
