package main.Colecoes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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
		/* Formas de sort :
		 * Collections.sort(meusGatos); 
		 * Collections.sort(meusGatos, new ComparatorIdade());
		 * meusGatos.sort(new ComparatorIdade());
		 */
		
		meusGatos.sort(new ComparatorIdade());
		System.out.println(meusGatos);
		
		// Ordenacao pela cor
		meusGatos.sort(new ComparatorCor());
		System.out.println(meusGatos);
		
		// Ordenacao pelo nome
		/*  meusGatos.sort(new ComparatorNome())
		 *  == 
		 *  meusGatos.sort(Comparator.comparing((Gato gato) -> gato.getNome()))
		 *  == 
		 *  meusGatos.sort(Comparator.comparing(Gato::getNome));*/
		meusGatos.sort(Comparator.comparing(Gato::getNome));
		System.out.println(meusGatos);
		
		// Ordena por nome -> cor -> idade
		meusGatos.sort(new ComparatorNomeCorIdade());
		System.out.println(meusGatos);
	}
}
