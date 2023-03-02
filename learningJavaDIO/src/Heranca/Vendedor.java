package Heranca;

public class Vendedor extends Funcionario {
	private double salario;
	private double vendas;
	
	public Vendedor(String nome, double salarioFixo, double vendas) {
		super(nome);
		this.vendas = vendas;
		this.salario = salarioFixo + vendas * 0.05;
	}
	
	@Override
	public void exibirDados() {
		System.out.println("Nome : " + super.nome);
		System.out.println("Salario : R$" + this.salario);
	}
}
