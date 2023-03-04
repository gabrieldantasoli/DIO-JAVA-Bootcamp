package main.MainClasse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import org.junit.jupiter.api.BeforeAll;

import main.Calculator.EuNaoSeiMatematica;
import main.CarComparations.Car;
import main.CarComparations.CarComparator;
import main.Colecoes.Colecoes;
import main.Colecoes.OrdenacaoEmCollections;
import main.Heranca.Funcionario;
import main.Heranca.Gerente;
import main.Heranca.Vendedor;
import main.Interface.Calculadora;
import main.ListaDuplamenteEncadeada.ListaDuplamenteEncadeada;
import main.ListaEncadeadaSimples.SingleLinkedList;
import main.MapsCollections.MapCollections;
import main.OrdenarEmSets.MinhasSeries;
import main.Pilha.Stack;
import main.SetCollection.SetCollection;

public class MainClasse {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String AN1,AN2,AN3;
		
		AN1 = sc.nextLine();
		AN2 = sc.nextLine();
		AN3 = sc.nextLine();
		
		Map animais = new HashMap<String, String>(){{
			put("vertebrado ave carnivoro","aguia"); 
			put("vertebrado ave onivoro","pomba");
			put("vertebrado mamifero onivoro","homem");
			put("vertebrado mamifero herbivoro","vaca");
			
			put("invertebrado inseto hematofago","pulga");
			put("invertebrado inseto herbivoro","lagarta");
			
			put("invertebrado anelideo hematofago","sanguessuga");
			put("invertebrado anelideo onivoro","minhoca");
		}};

		String animal = AN1 + " " + AN2 + " " + AN3;

		System.out.println(animais.get(animal));
	}
	
}