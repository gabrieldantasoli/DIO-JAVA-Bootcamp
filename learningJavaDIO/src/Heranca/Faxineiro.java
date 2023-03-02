package Heranca;

public class Faxineiro extends Funcionario {
	private double salario;
	
	public Faxineiro(String nome, double salario) {
		super(nome);
		this.salario = salario;
	}
	
	@Override
	public void exibirDados() {
		System.out.println("Nome : " + super.nome);
		System.out.println("Salario : R$" + this.salario);
	}
}
