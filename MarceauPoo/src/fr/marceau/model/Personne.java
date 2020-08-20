package fr.marceau.model;

public class Personne {
	
	// propriété ou attribut de la class
	
	private String nom;
	private int age;
	private Adresse adresse;
	
	//constructeur vide
	public Personne(){
		
	}
	
	public Personne(String nom, int age, Adresse adresse) {
		this.nom = nom;
		this.age = age;
		this.adresse = adresse;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	// method
	public String infoPersonne() {
		return "Nom : " + nom + " Age : " + age + " ans" + adresse.infoAdresse();
	}

}
