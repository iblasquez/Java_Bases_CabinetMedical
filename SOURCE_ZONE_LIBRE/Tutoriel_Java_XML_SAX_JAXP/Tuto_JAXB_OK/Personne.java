package com.iut.testJAXB;

public class Personne {
	private String nom;
	private String prenom;
	private Integer taille;
	
	
	public Personne()
	{}
	
	/**
	 * @param nom
	 * @param prenom
	 * @param taille
	 */
	public Personne(String nom, String prenom, Integer taille) {
		this.nom = nom;
		this.prenom = prenom;
		this.taille = taille;
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/**
	 * @return the taille
	 */
	public Integer getTaille() {
		return taille;
	}

	/**
	 * @param taille the taille to set
	 */
	public void setTaille(Integer taille) {
		this.taille = taille;
	}
	
	
	@Override
	public String toString() {
		
		return "nom : " + nom + "\n" + 
		"prenom : " + prenom + "\n" + 
		"taille : " + taille + "\n" ;
	}
	

}
