import java.util.ArrayList;

public class ApplicationCompte {
	static ArrayList<CompteClient> comptesClient;
	static {
		comptesClient = new ArrayList<>();
		comptesClient.add(new CompteClient(new Compte("Martin",37),250,false,0));
		comptesClient.add(new CompteClient(new Compte("Strome",28),1375,true,450));
		comptesClient.add(new CompteClient(new Compte("Gilbert",59),9750,true,1000));
		comptesClient.add(new CompteClient(new Compte("Ali",51),5240,true,1000));
		comptesClient.add(new CompteClient(new Compte("Macron",40),15500,true,2500));
		comptesClient.add(new CompteClient(new Compte("Matthias",24),-150,true,450));
		comptesClient.add(new CompteClient(new Compte("Serendim",29),490,false,0));
		comptesClient.add(new CompteClient(new Compte("Goura",71),1500,true,450));
	}
	public static void main(String[] args) {
//		ArrayList<CompteClient> compteFiltreAge = ExtractionServices.listeCompteClient(comptesClient,30,50);
//		ArrayList<CompteClient> compteFiltreAgeMontant = ExtractionServices.listeCompteClient(compteFiltreAge, 1000);
//		for(CompteClient compte:compteFiltreAgeMontant) {
//			System.out.println(compte);
//		}
		comptesClient = TriServices.reverseSort(comptesClient);
		for(CompteClient compte:comptesClient) {
			System.out.println(compte);
		}
	}

}
