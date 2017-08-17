package fr.pizzeria.ihm;

import java.util.ArrayList;
import java.util.Scanner;

import fr.pizzeria.model.CategoriePizza;
import fr.pizzeria.model.Pizza;

public class AjoutPizzaOptionMenu extends OptionMenu {
	private ArrayList<Pizza> pizzas = new ArrayList<>();
	private Scanner scan;
	public AjoutPizzaOptionMenu(ArrayList<Pizza> pizzas,Scanner scan) {
		super.libelle = "2. Ajouter une nouvelle pizza";
		this.pizzas = pizzas;
		this.scan = scan;
	}
	public static int searchPizza(ArrayList<Pizza> pizzas,String code) {
		String codePiz;
		int res = -1;
		boolean test;
		for(int i=0;i<pizzas.size();i++) {
			codePiz = pizzas.get(i).getCode();
			test = codePiz.equals(code);
			if(test) {
				res = i;
			}
		}
		return res;
	}

	@Override
	public void execute() {
		boolean exist;
		String code;
		String nom;
		double prix;
		CategoriePizza type;
		System.out.print("Saisisez le code : ");
		code = scan.next();
		code = code.toUpperCase();
		exist = searchPizza(pizzas,code) != -1;
		while(exist) {
			System.out.println("Code déjà existant veuillez en saisir un autre : ");
			code = scan.next();
			exist = searchPizza(pizzas,code) != -1;
		}
		System.out.print("Saisir le nom : ");
		nom = scan.next();
		nom = nom.substring(0,1).toUpperCase()+nom.substring(1).toLowerCase();
		System.out.println("Choisir la catégorie : ");
		for(CategoriePizza cp:CategoriePizza.values()) {
			System.out.println("["+cp.getCat()+"] "+cp);
		}
		String val = scan.next().toUpperCase();
		type = CategoriePizza.getCP(val);
		System.out.print("Saisir le prix : ");
		prix = scan.nextDouble();
		pizzas.add(new Pizza(code, nom, prix,type));
		System.out.println("Pizza "+code+" ajoutée à la liste");
	}
	}