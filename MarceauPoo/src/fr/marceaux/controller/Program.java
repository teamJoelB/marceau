package fr.marceaux.controller;

import javax.swing.JOptionPane;

import fr.marceau.model.Adresse;

public class Program {
	
	
	static {
		Adresse a1 = new Adresse("36 avenue pieree brossolet, 92240 Malakoff");
		Adresse a2 = new Adresse("10 Avenue Roger Salengro, 92370 Chaville");
		Adresse a3 = new Adresse("50 Rue fontaine Henri 4, 92370 Chaville");
		
		OperationPersonne.adresses.add(a1);
		OperationPersonne.adresses.add(a2);
		OperationPersonne.adresses.add(a3);
	}
	
	public static void main(String[] args) {
		
		/* Adresse a1 = new Adresse("36 avenue pieree brossolet, 92240 Malakoff");
		
		Personne p1 = new Personne("Marceaux", 18, a1);
		
		System.out.println(p1.infoPersonne());
		p1.setNom("Marceau LENOIR");
		System.out.println(p1.infoPersonne()); */
		
		
		// un petit programme pour la création des personne et les rajouiter 
		//des adresses en utilisant les collection et faire des recherche
		
		boolean sortie = false;
		
		while (!sortie) {
			switch (Menu.choix()) {
			case 1:
				OperationPersonne.creerPersonne();
				break;
			case 2:
				
				break;
			case 3:
				OperationPersonne.rajoutAdress();
				break;
			case 4:
				OperationPersonne.toutesLesPersonnes();
				break;
			case 5:
				
				break;
			case 6:
				sortie = true;
				break;

			default:
				JOptionPane.showMessageDialog(null, "Saisie incorrecte");
				break;
			}
		}
		
	}
}
