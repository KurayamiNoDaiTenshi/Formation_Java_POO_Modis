package fr.pizzeria.ihm;

import java.util.ArrayList;
import java.util.Scanner;

import fr.pizzeria.model.CategoriePizza;
import fr.pizzeria.model.Pizza;

public class Menu {
	public static ArrayList<OptionMenu> actions = new ArrayList<OptionMenu>();
	public static ArrayList<Pizza> pizzas;
	public static Scanner scan = new Scanner(System.in);
	static {
		pizzas = new ArrayList<>();
		pizzas.add(new Pizza("PEP", "Pépéroni", 12.50,CategoriePizza.getCP("V")));
		pizzas.add(new Pizza("MAR", "Margherita", 14.00,CategoriePizza.getCP("VG")));
		pizzas.add(new Pizza("REIN", "La Reine", 11.50,CategoriePizza.getCP("V")));
		pizzas.add(new Pizza("FRO", "La 4 fromages", 12.00,CategoriePizza.getCP("SG")));
		pizzas.add(new Pizza("CAN", "La cannibale", 12.50,CategoriePizza.getCP("VG")));
		pizzas.add(new Pizza("SAV", "La savoyarde", 13.00,CategoriePizza.getCP("SG")));
		pizzas.add(new Pizza("ORI", "L'orientale", 13.50,CategoriePizza.getCP("P")));
		pizzas.add(new Pizza("IND", "L'indienne", 14.50,CategoriePizza.getCP("V")));
		actions.add(new ListerPizzasOptionMenu(pizzas));
		actions.add(new AjoutPizzaOptionMenu(pizzas,scan));
		actions.add(new EditPizzasOptionMenu(pizzas,scan));
		actions.add(new SuprPizzasOptionMenu(pizzas,scan));
	}
	public static void afficher() {
		System.out.println("***** Pizzeria Administration *****\n");
		for(int i = 0;i<actions.size();i++) {
			System.out.println(actions.get(i).getLibelle());
		}
		System.out.println("99. Sortir");

	}
	public static void main(String[] args) {
		afficher();
		int choix = 0;
		while(choix!= 99) {
			choix = scan.nextInt();
			switch (choix) {
			case 1:
				System.out.println("***Liste des pizzas***\n");
				actions.get(choix-1).execute();
				break;
			case 2:
				System.out.println("***Ajout d’une nouvelle pizza***\n");
				actions.get(choix-1).execute();
				break;
			case 3:
				System.out.println("***Mise à jour d’une pizza***\n");
				actions.get(choix-1).execute();
				break;
			case 4:
				System.out.println("***Suppression d’une pizza***\n");
				actions.get(choix-1).execute();
				break;
			case 99:
				System.out.println("Aurevoir  ☺");
				break;
			default:
				System.out.println(" /!\\ Choix Incorrect ! /!\\\n");
				break;
			}
			if(choix != 99) afficher();
		}
		scan.close();
	}
}
