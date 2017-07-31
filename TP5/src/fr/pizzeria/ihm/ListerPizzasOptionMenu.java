package fr.pizzeria.ihm;

import java.util.ArrayList;

import fr.pizzeria.model.Pizza;

public class ListerPizzasOptionMenu extends OptionMenu {
	private ArrayList<Pizza> pizzas = new ArrayList<>();
	public ListerPizzasOptionMenu(ArrayList<Pizza> pizzas) {
		super.libelle = "1. Lister les pizzas";
		this.pizzas = pizzas;
	}
	@Override
	public void execute() {
		for(int i=0;i<pizzas.size();i++) {
			System.out.println(pizzas.get(i));
		}
		System.out.println("-------------------------------------");
	}

}
