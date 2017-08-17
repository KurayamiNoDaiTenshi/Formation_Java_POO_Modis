import java.util.Comparator;

public class CompteClient implements Comparable<CompteClient> {
	private Compte compte;
	private double montant;
	private boolean decouvertAutorise;
	private double plafondDecouvert;
	public CompteClient(Compte c) {
		this.compte = c;
		this.montant = 0;
		this.decouvertAutorise = false;
		this.plafondDecouvert = 0;
	}
	public CompteClient(Compte c,double m) {
		this.compte = c;
		this.montant = m;
		this.decouvertAutorise = false;
		this.plafondDecouvert = 0;
	}
	public CompteClient(Compte c, double montant,boolean decouvertAutorise, double plafondDecouvert) {
		this.compte = c;
		this.montant = montant;
		this.decouvertAutorise = decouvertAutorise;
		this.plafondDecouvert = plafondDecouvert;
	}
	public String toString(){
		String decouv;
		if(this.decouvertAutorise){
			decouv = "autorisée de "+this.plafondDecouvert+"€";
		}
		else {
			decouv = "interdit";
		}
		return compte+" : "+montant+"€ Découvert "+decouv;
	}
	public Compte getCompte() {
		return compte;
	}
	public void setCompte(Compte compte) {
		this.compte = compte;
	}
	public double getMontant() {
		return montant;
	}
	public void setMontant(double montant) {
		this.montant = montant;
	}
	public boolean isDecouvertAutorise() {
		return decouvertAutorise;
	}
	public void setDecouvertAutorise(boolean decouvertAutorise) {
		this.decouvertAutorise = decouvertAutorise;
	}
	public double getPlafondDecouvert() {
		return plafondDecouvert;
	}
	public void setPlafondDecouvert(double plafondDecouvert) {
		this.plafondDecouvert = plafondDecouvert;
	}
	public void ajoutMontant(double montant) {
		this.montant += montant;
	}
	public void retraitMontant(double montant) {
		double res = this.montant -= montant;
		if(res < 0) {
			if(this.decouvertAutorise) {
				if(res - this.plafondDecouvert < 0) {
					System.out.println("Operation impossible valeur du plafond de découvert dépassé.");
				}
			}
			else {
				System.out.println("Opération Impossible découvert interdit sur ce compte.");
			}
		}
		else {
			this.montant = res;
		}
	}
	@Override
	public int compareTo(CompteClient o) {
		return Double.compare(this.montant, o.montant);
	}

}
