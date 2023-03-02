package MainClasse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import Calculator.EuNaoSeiMatematica;
import CarComparations.Car;
import CarComparations.CarComparator;
import Colecoes.Colecoes;
import Colecoes.OrdenacaoEmCollections;
import Heranca.Funcionario;
import Heranca.Gerente;
import Heranca.Vendedor;
import Interface.Calculadora;
import ListaDuplamenteEncadeada.ListaDuplamenteEncadeada;
import ListaEncadeadaSimples.SingleLinkedList;
import Pilha.Stack;

public class MainClasse {
	
	public static void main(String[] args) {
		ArrayList<Car> carros = new ArrayList<>() {{
			add(new Car("Dodge",280,20.5,500));
			add(new Car("Camaro",250,20d,350));
			add(new Car("Bugatti",400,40d,1200));
			add(new Car("Nitro",300,20d,500));
			add(new Car("Katchau",400,40d,1200));
		}};
		
		//System.out.println(carros);
		//Collections.sort(carros);
		System.out.println(carros);
		Collections.sort(carros, new CarComparator());
		System.out.println(carros);
	}
}