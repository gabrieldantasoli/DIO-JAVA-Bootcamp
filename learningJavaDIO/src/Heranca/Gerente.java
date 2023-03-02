package Heranca;

public class Gerente extends Funcionario {
	private double salario;
	
	public Gerente(String nome , double salario) {
		super(nome);
		this.salario = salario;
	}
	
	@Override
	public void exibirDados() {
		System.out.println("Nome : " + super.nome);
		System.out.println("Salario : R$" + this.salario);
	}
}
