package fr.pizzeria.ihm;

import java.util.ArrayList;
import java.util.Scanner;

import fr.pizzeria.model.Pizza;

public class AjoutPizzaOptionMenu extends OptionMenu {
	private ArrayList<Pizza> pizzas = new ArrayList<>();
	private Scanner scan;
	public AjoutPizzaOptionMenu(ArrayList<Pizza> pizzas,Scanner scan) {
		super.libelle = "2. Ajouter une nouvelle pizza";
		this.pizzas = pizzas;
		this.scan = scan;
	}

	@Override
	public void execute() {
		String code;
		String nom;
		double prix;
		System.out.print("Saisisez le code : ");
		code = scan.next();
		System.out.print("Saisir le nom : ");
		nom = scan.next();
		System.out.print("Saisir le prix : ");
		prix = scan.nextDouble();
		pizzas.add(new Pizza(code, nom, prix));
	}
	}