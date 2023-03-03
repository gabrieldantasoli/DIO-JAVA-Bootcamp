package main.Calculator;

public class Calculator {
	
	public double soma(double num1, double num2) {
		double calc = num1 + num2;
		return calc;
	}
	
	public double subtracao(double num1, double num2) {
		double calc = num1 - num2;
		return calc;
	}
	
	public double multiplicacao(double num1, double num2) {
		double calc = num1 * num2;
		return calc;
	}
	
	public double divisao(double num1, double num2) {
		double calc = num1 / num2;
		return calc;
	}
	
	public double exponenciacao(double num1, double num2) {
		double calc = Math.pow(num1, num2);
		return calc;
	}
}
