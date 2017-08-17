package fr.pizzeria.model;

public class Pizza {
	private Integer id;
	private String code;
	private String nom;
	private double prix;
	private CategoriePizza type;
	static int nextId = 0;
	public Pizza(String code,String nom,double prix,CategoriePizza type) {
		this.id = nextId;
		this.code = code;
		this.nom = nom;
		this.prix = prix;
		this.type = type;

		nextId++;
	}
	@Override
	public String toString() {
		return this.code+"->"+this.nom+" ["+this.type+"] ("+this.prix+"€)";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public CategoriePizza getType() {
		return type;
	}
	public void setType(CategoriePizza type) {
		this.type = type;
	}
}
