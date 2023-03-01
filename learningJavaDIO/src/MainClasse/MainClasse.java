package MainClasse;

import Calculator.EuNaoSeiMatematica;
import ListaDuplamenteEncadeada.ListaDuplamenteEncadeada;
import ListaEncadeadaSimples.SingleLinkedList;
import Pilha.Stack;

public class MainClasse {
	
	public static void main(String[] args) {
		ListaDuplamenteEncadeada<Integer> listaDupla = new ListaDuplamenteEncadeada<Integer>();
		listaDupla.addElement(1);
		listaDupla.addElement(2);
		listaDupla.addElement(3);
		listaDupla.addElement(4);
		listaDupla.addElement(5);
		listaDupla.addElement(6);
		listaDupla.addElement(7);
		listaDupla.addElement(8);
		listaDupla.addElement(9);
		listaDupla.addElement(10);
		listaDupla.removeElement(1);
		listaDupla.removeElement(5);
		listaDupla.removeElement(8);
		listaDupla.removeElement(10);
		listaDupla.removeElement(9);
		listaDupla.removeElement(9);
		
		System.out.println(listaDupla.arrayString());
	}
}