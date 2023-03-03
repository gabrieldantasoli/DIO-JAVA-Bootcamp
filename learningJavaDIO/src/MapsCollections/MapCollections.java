package MapsCollections;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Iterator;
import java.util.LinkedHashMap;

public class MapCollections {
	/* Metodos
	 * toString()
	 * put(key,value)
	 * get(key)
	 * containsKey(key)
	 * keySet()
	 * values()
	 * entrySet()
	 * 
	 */
	//Map<String, Double> carros1 = Map.of("gol",14.4, "Uno", 15.6, "Camaro",8d);
	private Map<String, Double> carrosPopulares = new HashMap<>() {{
		put("Gol", 14.4);
		put("Uno", 15.6);
		put("Camaro", 10.5);
		put("Kwid",12.5);
		put("BMW",10d);
	}};
	
	private Map<String, Double> carrosPopularesLinked = new LinkedHashMap<>() {{
		put("Gol", 14.4);
		put("Uno", 15.6);
		put("Camaro", 10.5);
		put("Kwid",12.5);
		put("BMW",10d);
	}};
	
	public MapCollections() {
		carrosPopulares.put("Uno",20d);
		carrosPopulares.put("Bugatti", 6d); 
		
		System.out.println(carrosPopularesLinked);
	}
	
	private void maisEficciente() {
		Double modeloMaisEficiente = Double.MIN_VALUE;
		String modelo = "";
		Set<Entry<String, Double>> entries = carrosPopulares.entrySet();
		
		for (Map.Entry<String, Double> entry : entries) {
			if (entry.getValue() > modeloMaisEficiente) {
				modelo = entry.getKey();
				modeloMaisEficiente = entry.getValue();
			}
		}
		
		System.out.println("Modelo mais eficiente = " + modelo + " com " + modeloMaisEficiente + " Km/L");
	}
	
	
	private void menosEficiente() {
		Double modeloMenosEficiente = Double.MAX_VALUE;
		String modelo = "";
		Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
		
		for (Map.Entry<String, Double> entry : entries) {
			if (entry.getValue() < modeloMenosEficiente) {
				modelo = entry.getKey();
				modeloMenosEficiente = entry.getValue();
			}
		}
		
		System.out.println("Modelo menos eficiente = " + modelo + " com " + modeloMenosEficiente + " Km/L");
	}
	
	private Double somaConsumos() {
		Double soma = 0d;
		
		/*Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
		
		for (Map.Entry<String, Double> entry : entries) {
			soma += entry.getValue();
		}*/
		
		// Fazendo a soma usando iterator
		Iterator<Double> iterator = carrosPopulares.values().iterator();
		
		while (iterator.hasNext()) {
			soma += iterator.next();
		}
		
		return soma;
	}
	
	private Double mediaConsumos() {
		return this.somaConsumos() / carrosPopulares.size();
	}
	
	
}
