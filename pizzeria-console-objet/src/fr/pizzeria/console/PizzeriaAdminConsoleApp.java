package fr.pizzeria.console;

import java.util.ArrayList;
import java.util.Scanner;

import fr.pizzeria.model.Pizza;

public class PizzeriaAdminConsoleApp {
	static String code;
	static String nom;
	static double prix;
	public static Scanner scan = new Scanner(System.in);
	static ArrayList<Pizza> listPizza;
	public static void afficheMenu() {
		System.out.println("***** Pizzeria Administration *****");
		System.out.println("1. Lister les pizzas");
		System.out.println("2. Ajouter une nouvelle pizza");
		System.out.println("3. Mettre à jour une pizza");
		System.out.println("4. Supprimer une pizza");
		System.out.println("99. Sortir");
	}
	public static void listPizza() {
		Pizza piz;
		for(int i = 0;i<listPizza.size();i++) {
			piz = listPizza.get(i);
			code = piz.getCode();
			nom = piz.getNom();
			prix = (double) piz.getPrix();
			
			System.out.println(code+"->"+nom+" ("+prix+"€)");
		}
	}
	public static void addPizza() {
		System.out.print("Saisisez le code : ");
		code = scan.nextLine();
		System.out.print("Saisir le nom : ");
		nom = scan.nextLine();
		System.out.print("Saisir le prix : ");
		prix = scan.nextDouble();
		listPizza.add(new Pizza(code, nom, prix));
	}
	
	public static void main (String[] args) {
		listPizza = new ArrayList<Pizza>();
		listPizza.add(new Pizza("PEP", "Pépéroni", 12.50));
		listPizza.add(new Pizza("MAR", "Margherita", 14.00));
		listPizza.add(new Pizza("REIN", "La Reine", 11.50));
		listPizza.add(new Pizza("FRO", "La 4 fromages", 12.00));
		listPizza.add(new Pizza("CAN", "La cannibale", 12.50));
		listPizza.add(new Pizza("SAV", "La savoyarde", 13.00));
		listPizza.add(new Pizza("ORI", "L'orientale", 13.50));
		listPizza.add(new Pizza("IND", "L'indienne", 14.50));
		afficheMenu();
		int choix = 0;
		while(choix!= 99) {
			choix = scan.nextInt();
			switch (choix) {
			case 1:
				System.out.println("Liste des pizzas");
				listPizza();
				break;
			case 2:
				System.out.println("Ajout d’une nouvelle pizza");
				break;
			case 3:
				System.out.println("Mise à jour d’une pizza");
				break;
			case 4:
				System.out.println("Suppression d’une pizza");
				break;
			case 99:
				System.out.println("Aurevoir  ☺");
				break;
				default:
					System.out.println("Choix Incorrect !");
					break;
			}
			afficheMenu();
		}
	}
}
