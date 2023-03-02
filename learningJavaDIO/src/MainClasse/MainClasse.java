package MainClasse;

import java.util.Scanner;

import Calculator.EuNaoSeiMatematica;
import ListaDuplamenteEncadeada.ListaDuplamenteEncadeada;
import ListaEncadeadaSimples.SingleLinkedList;
import Pilha.Stack;

public class MainClasse {
	
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
        int N = leitor.nextInt();
        int proximo, anterior = 0, atual = 1;
        
    	for (int i = 0; i < N; i++) {
    		if (i < 2) {
    			System.out.print(i + " ");
    		} else {
    			proximo = anterior + atual;
    			anterior = atual;
    			atual = proximo;
    			System.out.print(proximo + " ");
    		}
        }
	}
}