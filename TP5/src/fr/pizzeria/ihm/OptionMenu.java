package fr.pizzeria.ihm;

import java.util.ArrayList;

import fr.pizzeria.model.Pizza;

public abstract class OptionMenu {
	protected String libelle;
	public String getLibelle() {
		return this.libelle;
	}
	public abstract void execute();
}
