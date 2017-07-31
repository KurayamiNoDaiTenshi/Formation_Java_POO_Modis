package fr.pizzeria.ihm;

import java.util.ArrayList;
import java.util.Scanner;

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
		System.out.println(searchPizza(pizzas,code));

	}

}
