package Calculator;

public class EuNaoSeiMatematica {
	Calculator minhaCalculadora = new Calculator();
	
	// Não sei somar :(
	public void realisarContaBasica() {
		double soma = minhaCalculadora.soma(2, 2);
		double multiplicacao = minhaCalculadora.multiplicacao(1, 2);
		double divisao = minhaCalculadora.divisao(10, 2);
		System.out.println("Fiz essas contas na calculadora pois não sei matemática básica.");
	}
}
