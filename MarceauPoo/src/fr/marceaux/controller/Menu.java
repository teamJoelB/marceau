package fr.marceaux.controller;

import javax.swing.JOptionPane;

public class Menu {
	
	public static int choix() {
		String msg = "Menu Principal \n \n 1 - Créer une personne \n \n 2 - Créer une adresse \n \n 3- Rajouter une adreese à une personne \n \n 4 - Toutes les personnes \n \n 5 - Chercher une personne \n \n \n 6 - Quitter";
		int choix = Integer.parseInt(JOptionPane.showInputDialog(msg));
		
		return choix;
	}

}
