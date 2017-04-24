package fr.alma.master1.proxyCC;

public class Personne implements IPersonne {
	private String nom;

	public Personne() {

	}
	
	@Override
	public String getNom() {
		return nom;
	}

	@Override
	public void setNom(String nom) {
		this.nom = nom;
	}

}
