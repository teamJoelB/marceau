package fr.marceaux.controller;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import fr.marceau.model.Adresse;
import fr.marceau.model.Personne;

public class OperationPersonne {
	
	public static List<Personne> personnes = new ArrayList<Personne>();
	public static List<Adresse> adresses = new ArrayList<Adresse>();
	public static List<Adresse> addresseRetrouve = new ArrayList<Adresse>();

	public static void creerPersonne() {

		String nom = JOptionPane.showInputDialog("Entrer le nom de la personne");
		int age = Integer.parseInt(JOptionPane.showInputDialog("Age de la personne"));

		Adresse a1 = new Adresse("");
		
		Personne p = new Personne(nom, age, a1);
		personnes.add(p);
	}
	
	public static void toutesLesPersonnes() {
		String data = "";
		for (Personne personne : personnes) {
			data += "\n " + personne.infoPersonne() + "\n"; 
		}
		
		JOptionPane.showMessageDialog(null, data);
	}
	
	private static int rechercheAdresse() {
		String a = JOptionPane.showInputDialog("Entrer une partie de l'adresse");
		String data = "";
		
		//Adresse a = null;
		for (Adresse adresse : adresses) {
			if(adresse.getAddress().contains(a)){
				//a = adresse;
				addresseRetrouve.add(adresse);
			}
		}
		int i = 0;
		for (Adresse adresse : addresseRetrouve) {
			data += "\n " + i + " - " + adresse.getAddress() + "\n"; 
			i++;
		}
		int choix = Integer.parseInt(JOptionPane.showInputDialog(data + "\n \nQuelle adresse est la bonne dans le result"));
		return choix;
		
	}
	
	
	public static Personne recupPersonne() {
		Personne p = null;
		String nom = JOptionPane.showInputDialog("Nom de la personne que vous cherchez");
		for (Personne personne : personnes) {
			if(personne.getNom().equals(nom)) {
				p = personne;
			}
		}
		return p;
	}
	
	
	public static void rajoutAdress() {
	//	System.out.println(addresseRetrouve.get(rechercheAdresse()).getAddress());
		
		Personne p = recupPersonne();
		
		if(p != null) {
			p.setAdresse(addresseRetrouve.get(rechercheAdresse()));
			addresseRetrouve.clear();
			
		}
		else {
			JOptionPane.showMessageDialog(null, "Personne de ce nom ici ...");
		} 
				

	}

}
