package br.com.fiap.rh;

public class Engenheiro extends Funcionario {

	private String departamento;
	private int crea;
	

	public double calcularSalario() {
		return super.getSalario() * 1.5;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public int getCrea() {
		return crea;
	}

	public void setCrea(int crea) {
		this.crea = crea;
	}

}
