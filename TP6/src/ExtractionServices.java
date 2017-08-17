import java.util.ArrayList;

public class ExtractionServices {
	public static ArrayList<CompteClient> listeCompteClient(ArrayList<CompteClient> comptes,double montant){
		ArrayList<CompteClient> listeCompteClientFiltre = new ArrayList<>();
		for(CompteClient compte:comptes) {
			if(compte.getMontant() >= montant) {
				listeCompteClientFiltre.add(compte);
			}
		}
		return listeCompteClientFiltre;
	}
	public static ArrayList<CompteClient> listeCompteClient(ArrayList<CompteClient> comptes,int ageInf,int ageSup){
		ArrayList<CompteClient> listeCompteClientFiltre = new ArrayList<>();
		int age;
		for(CompteClient compte:comptes) {
			age = compte.getCompte().getAge();
			if(age >= ageInf && age <= ageSup) {
				listeCompteClientFiltre.add(compte);
			}
		}
		return listeCompteClientFiltre;
	}
	public static double moyenneMontant(ArrayList<CompteClient> comptes) {
		double avg = 0;
		for(CompteClient compte:comptes) {
			avg += compte.getMontant();
		}
		return avg/comptes.size();
	}
}
