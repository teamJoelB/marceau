package fr.marceau.model;

public class Adresse {
	
	private String address;
	
	public Adresse() {
		// TODO Auto-generated constructor stub
	}
	
	public Adresse(String address) {
		this.address = address;
	}
	
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String infoAdresse() {
		return "\t" + address;
	}

}
