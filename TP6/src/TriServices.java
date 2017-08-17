import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TriServices {
	public static ArrayList<CompteClient>reverseSort(ArrayList<CompteClient> comptes){
		Collections.sort(comptes,Collections.reverseOrder());
		return comptes; 
	}
}
