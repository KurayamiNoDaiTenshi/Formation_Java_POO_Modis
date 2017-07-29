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
		for(int i = 0;i<listPizza.size();i++) {
			System.out.println(listPizza.get(i));
		}
	}
	public static Pizza searchPizza(String code) {
		String codePiz;
		for(int i=0;i<listPizza.size();i++) {
			codePiz = listPizza.get(i).getCode();
			if(codePiz == code) {
				return new Pizza(listPizza.get(i));
			}
		}
		return null;
	}
	public static void addPizza() {
		boolean exist;
		System.out.print("Saisisez le code : ");
		code = scan.next();
		exist = searchPizza(code) != null;
		while(exist) {
			System.out.print("Code déjà existant merci d'en saisir un autre : ");
			code = scan.next();
			exist = searchPizza(code) != null;
		}
		System.out.print("Saisir le nom : ");
		nom = scan.next();
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
				System.out.println("***Liste des pizzas***\n");
				listPizza();
				break;
			case 2:
				System.out.println("***Ajout d’une nouvelle pizza***\n");
				addPizza();
				break;
			case 3:
				System.out.println("***Mise à jour d’une pizza***\n");
				break;
			case 4:
				System.out.println("***Suppression d’une pizza***\n");
				break;
			case 99:
				System.out.println("Aurevoir  ☺");
				break;
				default:
					System.out.println(" /!\\ Choix Incorrect ! /!\\\n");
					break;
			}
			afficheMenu();
		}
	}
}
