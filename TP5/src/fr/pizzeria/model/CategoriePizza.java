package fr.pizzeria.model;

public enum CategoriePizza {
	VIANDE ("V"), POISSON("P"), VÉGÉTARIENNE("VG"), SANS_GLUTEN("SG");
	
	private String categorie;
	
	private CategoriePizza(String cat) {
		categorie = cat;
	}
	public String getCat() {
		return this.categorie;
	}
	public static CategoriePizza getCP (String code) {
		CategoriePizza catP = null;
		for(CategoriePizza cp:CategoriePizza.values()) {
			if(code.equals(cp.getCat())) {
				catP = cp;
			}
		}
		return catP;
	}
}
