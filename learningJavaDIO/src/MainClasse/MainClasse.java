package MainClasse;

import Calculator.EuNaoSeiMatematica;
import ListaEncadeadaSimples.SingleLinkedList;
import Pilha.Stack;

public class MainClasse {
	
	public static void main(String[] args) {
		Stack stack = new Stack<Integer>();
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.push(6);
		stack.push(7);
		stack.push(8);
		stack.push(9);
		stack.push(10);
		
		System.out.println(stack.getArrayStack());
		
		stack.pop();
		System.out.println(stack.getArrayStack());
		stack.pop();
		System.out.println(stack.getArrayStack());
		stack.pop();
		System.out.println(stack.getArrayStack());
		stack.pop();
		stack.pop();
		System.out.println(stack.getArrayStack());
		stack.pop();
		System.out.println(stack.getArrayStack());
		stack.pop();
		System.out.println(stack.getArrayStack());
		stack.pop();
		System.out.println(stack.getArrayStack()); 
		
		stack.push(3);
		System.out.println(stack.top());
	}
}