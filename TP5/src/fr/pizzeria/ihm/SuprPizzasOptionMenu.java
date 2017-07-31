package fr.pizzeria.ihm;

import java.util.ArrayList;
import java.util.Scanner;

import fr.pizzeria.model.Pizza;

public class SuprPizzasOptionMenu extends OptionMenu {
	private ArrayList<Pizza> pizzas = new ArrayList<>();
	private Scanner scan;
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
	public SuprPizzasOptionMenu(ArrayList<Pizza> pizzas,Scanner scan) {
		this.libelle = "4. Supprimer une pizza";
		this.pizzas = pizzas;
		this.scan = scan;
	}
	public void execute() {
		String code = scan.next();
		if(searchPizza(pizzas, code) != -1) {
			
		}
	}

}
