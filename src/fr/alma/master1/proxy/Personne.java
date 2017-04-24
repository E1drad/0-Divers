package fr.alma.master1.proxy;

public class Personne implements InterfacePersonne {
	private String nom;
	private Integer age;
	
	public Personne(String nom, Integer age){
		this.age = age;
		this.nom = nom;
	}
	
	public String getNom() {
		return nom;
	}
	public Integer getAge() {
		return age;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
}
