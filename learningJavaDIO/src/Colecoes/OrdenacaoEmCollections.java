package Colecoes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoEmCollections {
	
	public OrdenacaoEmCollections() {
		List<Gato> meusGatos = new ArrayList<>(){{
			add(new Gato("jon",18,"Preto"));
			add(new Gato("Simba",6,"tigrado"));
			add(new Gato("jon",12,"amarelo"));
		}};
		
		// ordem de insercao
		System.out.println(meusGatos);
		
		// ordem aleatoria
		Collections.shuffle(meusGatos);
		System.out.println(meusGatos);
		
		// ordem natural
		Collections.sort(meusGatos);
		System.out.println(meusGatos);
	}
}
