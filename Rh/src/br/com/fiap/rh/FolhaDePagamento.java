package br.com.fiap.rh;

public class FolhaDePagamento {
	
	private double pagamentoTotal;
	
	public void registrar(Funcionario funcionario) {
		pagamentoTotal += funcionario.calcularSalario();
	}
	
	public void autenticar(Autenticavel autenticavel, String senha) {
		if (autenticavel.logar(senha)) 
			System.out.println("logado com sucesso");
		else
			System.out.println("erro ao logar");
	}

	public double getPagamentoTotal() {
		return pagamentoTotal;
	}

}
