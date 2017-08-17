package fr.pizzeria.ihm;

import java.util.ArrayList;
import java.util.Scanner;

import fr.pizzeria.model.CategoriePizza;
import fr.pizzeria.model.Pizza;

public class EditPizzasOptionMenu extends OptionMenu {
	private ArrayList<Pizza> pizzas = new ArrayList<>();
	private Scanner scan;
	public EditPizzasOptionMenu(ArrayList<Pizza> pizzas,Scanner scan) {
		super.libelle = "3. Mettre à jour une pizza";
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
		System.out.println("Saisir code pizza à modifier : ");
		String code =scan.next();
		code = code.toUpperCase();
		CategoriePizza type;
		int idx = searchPizza(pizzas,code);
		if(idx != -1) {
			System.out.println("Saisir nouveau nom (saisir n/c pour garder l'ancienne valeur) : ");
			String nom = scan.next();
			nom = nom.substring(0,1).toUpperCase()+nom.substring(1).toLowerCase();
			if(nom.equals("N/c")) {
				nom = pizzas.get(idx).getNom();
			}
			System.out.println("Choisir la catégorie : ");
			for(CategoriePizza cp:CategoriePizza.values()) {
				System.out.println("["+cp.getCat()+"] "+cp);
			}
			String val = scan.next();
			type = CategoriePizza.getCP(val);
			if(type == null) {
				type = pizzas.get(idx).getType();
			}
			System.out.println("Saisir nouveau prix (saisir -1 pour garder l'ancienne valeur) : ");
			double prix = scan.nextDouble();
			if(prix < 0) {
				prix = pizzas.get(idx).getPrix();
			}
			pizzas.set(idx, new Pizza(code, nom, prix,type));
			System.out.println("Pizza "+code+" modifié.");
		} else {
			System.out.println("Code inconnue !");
		}

	}

}
