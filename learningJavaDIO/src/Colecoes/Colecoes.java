package Colecoes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Colecoes {
	// ArrayList deve ser usado onde mais operações de pesquisa são necessárias
	/* MÉTODOS DO ARRAYLIST
	 * indexOf(object) - posicao de um objeto
	 * toString()
	 * get(position)
	 * set(posicao, novo elemento) - substitui um elemento de uma posicao
	 * contains(element)
	 * Collections.min(notas1)
	 * Collections.max(notas1)
	 */
	public List<Integer> notas1 = new ArrayList<Integer>();
	public List<Double> notas2 = new ArrayList<Double>(); // *
	public List<Double> notas3 = new ArrayList<>(Arrays.asList(1.0,2d,3.3,4d,5.8,6d,7d));
	
	// LinkedList deve ser usada onde mais operações de inserção e exclusão são necessárias
	
	
	
	public Colecoes() {
		/*this.notas1.add(1);
		this.notas1.add(1);
		this.notas1.add(0,4);
		this.notas1.add(2);
		this.notas1.add(0, 4);
		this.notas1.set(notas1.indexOf(2), 1000);
		this.notas1.add(1);
		this.notas1.remove(4);
		
		this.Media(notas1);
		
		this.notas2.add(1d);
		this.notas2.add(1.2);
		
		this.notas3.add(10d);
		this.notas3.add(9.7);*/
		
		for (int index = 0; index < 250; index++) {
			notas1.add(index);
		}
		
		this.notas1 = this.removeSmallestsThenX(notas1, 240);
		
	}
	
	private void Media(List lista) {
		Iterator<Integer> iterator = lista.iterator();
		double soma = 0;
		
		while (iterator.hasNext()) {
			Integer next = iterator.next();
			soma += next;
		}
		
		System.out.println(soma / lista.size());
	}
	
	private List removeSmallestsThenX(List list, int x) {
		Iterator<Integer> iterator = list.iterator();
		
		while(iterator.hasNext()) {
			Integer next = iterator.next();
			if (next < x) iterator.remove();
		}
		
		return list;
	}
	
	
}
