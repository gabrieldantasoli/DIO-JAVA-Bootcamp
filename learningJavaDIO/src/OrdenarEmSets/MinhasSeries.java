package OrdenarEmSets;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class MinhasSeries {
	Set<Serie> minhasSeries = new TreeSet<>(new ComparatorNomeGeneroDuracao());
	
	public MinhasSeries() {
		minhasSeries.add(new Serie("The 100","Apocalipse",60));
		minhasSeries.add(new Serie("The Last Of Us","Apocalipse",70));
		minhasSeries.add(new Serie("Scooby Doo","Terror",60));
		System.out.println(minhasSeries);
	}
}
