package OrdenarEmSets;

import java.util.Comparator;

public class ComparatorNomeGeneroDuracao implements Comparator<Serie> {

	@Override
	public int compare(Serie s1, Serie s2) {
		int nome = s1.getNome().compareToIgnoreCase(s2.getNome());
		if (nome != 0) return nome;
		
		int genero = s1.getGenero().compareToIgnoreCase(s2.getGenero());
		if (genero != 0) return genero;
		
		return Integer.compare(s1.getDuracao(), s2.getDuracao());
	}
	
}
