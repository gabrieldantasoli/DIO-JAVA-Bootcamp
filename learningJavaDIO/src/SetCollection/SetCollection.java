package SetCollection;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetCollection {
	/*
	 * Nao repete elementos
	 * Nao trabalha com posicoes
	 * 
	 * contains(element)
	 * Collections.min(notas1)
	 * Collections.max(notas1)
	 */
	public Set<Double> notas1 =  new HashSet<>();
	
	// nesse tipo de inicialisacao a colecao é imutável
	public Set<Double> notas = Set.of(4.3,445.6,5d,32.2,2d,45d,33.1);
	
	// Tree Set já organiza os elementos
	Set<Double> notas2 = new TreeSet<>();
	
	public SetCollection() {
		for (int i = 0; i < 11; i++) {
			notas1.add((double) i);
		}
		
		System.out.println(notas1);
		this.sum();
		notas1.remove(10d);
		this.sum();
		System.out.println(notas1);
		this.removeLessThenX(7d);
		
		notas2.add(1d);
		notas2.add(2d);
		notas2.add(4d);
		notas2.add(3d);
		notas2.add(1d);
		//notas2.clear();
		System.out.println(notas2);
	}
	
	public void sum() {
		Iterator<Double> iterator = notas1.iterator();
		Double soma = 0d;
		
		while (iterator.hasNext()) {
			Double next = iterator.next();
			soma += next;
		}
		
		System.out.println("Soma : " + soma);
	}
	
	public void removeLessThenX(Double x) {
		Iterator<Double> iterator = notas1.iterator();
		
		while (iterator.hasNext()) {
			Double next = iterator.next();
			if (next < x) {
				iterator.remove();
			}
		}
		
		System.out.println(notas1);
	}
}
