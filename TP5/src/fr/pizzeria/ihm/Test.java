package fr.pizzeria.ihm;

import fr.pizzeria.model.CategoriePizza;

public class Test {

	public static void main(String[] args) {
		for(CategoriePizza s:CategoriePizza.values()) {
			System.out.println(s.getCat());
		}

	}

}
