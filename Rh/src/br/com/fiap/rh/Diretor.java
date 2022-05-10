package br.com.fiap.rh;

public class Diretor extends FuncionarioAutenticavel {

	@Override
	public double calcularSalario() {
		return super.getSalario() * 1.3;
	}

}
