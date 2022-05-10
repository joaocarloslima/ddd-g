package br.com.fiap.rh;


public class App {
	
	public static void main(String[] args) {
		
		Engenheiro engenheiro = new Engenheiro();
		engenheiro.setCodigo(123);
		engenheiro.setNome("Joao");
		engenheiro.setSalario(5000);
		engenheiro.setCrea(147);
		engenheiro.setDepartamento("Produção");
		
		System.out.println(engenheiro.calcularSalario());
		
		Gerente gerente = new Gerente();
		gerente.setCodigo(321);
		gerente.setNome("Maria");
		gerente.setArea("Comercial");
		gerente.setSalario(7000);
		gerente.setBonus(2000);
		gerente.setSenha("fiap");
		
		System.out.println(gerente.calcularSalario());
		
		Presidente presidente = new Presidente();
		presidente.setCodigo(456);
		presidente.setNome("Marta");
		presidente.setSalario(10000);
		presidente.setValorDaCotaDeAcoes(5000);
		presidente.setSenha("12345");
		
		System.out.println(presidente.calcularSalario());
		
		
		Diretor diretor = new Diretor();
		diretor.setSalario(3000);
		
		System.out.println(diretor.calcularSalario());
		
		FolhaDePagamento folhaDePagamento = new FolhaDePagamento();
		folhaDePagamento.registrar(presidente);
		folhaDePagamento.registrar(gerente);
		folhaDePagamento.registrar(engenheiro);

		
		System.out.println("TOTAL " + folhaDePagamento.getPagamentoTotal());
		
		folhaDePagamento.autenticar(presidente, "123456");
		folhaDePagamento.autenticar(gerente, "fiap");
		
				
	}

}
