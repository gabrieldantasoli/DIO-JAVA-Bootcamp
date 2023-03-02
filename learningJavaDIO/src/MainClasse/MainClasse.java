package MainClasse;

import java.util.Scanner;

import Calculator.EuNaoSeiMatematica;
import Heranca.Funcionario;
import Heranca.Gerente;
import Heranca.Vendedor;
import Interface.Calculadora;
import ListaDuplamenteEncadeada.ListaDuplamenteEncadeada;
import ListaEncadeadaSimples.SingleLinkedList;
import Pilha.Stack;

public class MainClasse {
	
	public static void main(String[] args) {
		Calculadora calc = new Calculadora();
		
		calc.somar(1, 2);
		calc.subtrair(1, 10);
		calc.multiplicar(1, 1000);
		calc.dividir(1, 5);
	}
}