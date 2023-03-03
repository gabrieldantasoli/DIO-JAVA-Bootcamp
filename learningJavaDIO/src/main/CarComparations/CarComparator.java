package main.CarComparations;

import java.util.Comparator;

public class CarComparator implements Comparator<Car>{

	@Override
	public int compare(Car c1, Car c2) {
		int velMax = c1.getVelMax().compareTo(c2.getVelMax());
		if (velMax != 0) return velMax;
		
		int aceleracao = c1.getAceleracao().compareTo(c2.getAceleracao());
		if (aceleracao != 0) return aceleracao;
		
		int cavalos = c1.getCavalos().compareTo(c2.getCavalos());
		if (cavalos != 0) return cavalos;
		
		return c1.getModelo().compareToIgnoreCase(c2.getModelo());
	}

}