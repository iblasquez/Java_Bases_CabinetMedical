package com.iut.cabinet.user;

import java.io.Serializable;
import java.sql.Date;

import com.iut.cabinet.util.DateUtil;


/** La classe <code>PersonneDTO</code> représente 
 *  un objet DTO de type Personne caractérisé par
 *  <ul>
 *  <li>son identifiant <code>idPersonne</code></li>
 *  <li>son <code>nom</code>
 *  <li>son <code>prenom</code></li>
 *  <li>sa <code>dateNaissance</code></li>
 *  <li>son sexe <code>isMale</code></li>
 *  <li>son numero de <code>telephone</code></li>
 *  <li>son numero de <code>portable</code></li>
 *  <li>son adresse <code>email</code></li>
 *  <li>son <code>adresse</code></li>
 *  <li>son ascendant (<code>unAscendant</code>)</li>
 *  </ul>
 * @author Isabelle BLASQUEZ
 * @version 1.0
 */
public abstract class PersonneDTO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected Integer idPersonne;
	protected String nom;
	protected String prenom;
	protected Date dateNaissance;
	protected boolean isMale;
	protected String telephone;
	protected String portable;
	protected String email;
	protected AdresseDTO adresse;
	protected PersonneDTO unAscendant;

	
	/** Constructeur par défaut
	 * 
	 */
	public PersonneDTO(){}
	
	/** Constructeur
	 * @param adresse
	 * @param dateNaissance
	 * @param email
	 * @param idPersonne
	 * @param isMale
	 * @param nom
	 * @param portable
	 * @param prenom
	 * @param telephone
	 * @param unAscendant
	 */
	public PersonneDTO(Integer idPersonne, String nom, String prenom,
				Date dateNaissance, boolean isMale, String telephone,
				String portable, String email, AdresseDTO adresse, PersonneDTO unAscendant)  {
			
		
		super();
		this.adresse = adresse;
		this.dateNaissance = dateNaissance;
		this.email = email;
		this.idPersonne = idPersonne;
		this.isMale = isMale;
		this.nom = nom;
		this.portable = portable;
		this.prenom = prenom;
		this.telephone = telephone;
		this.unAscendant = unAscendant;
	}
	
	
	public Integer getIdPersonne() {
		return idPersonne;
	}
	
	public void setIdPersonne(Integer idPersonne) {
		this.idPersonne = idPersonne;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Date getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public boolean isMale() {
		return isMale;
	}

	public void setMale(boolean isMale) {
		this.isMale = isMale;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getPortable() {
		return portable;
	}

	public void setPortable(String portable) {
		this.portable = portable;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public AdresseDTO getAdresse() {
		return adresse;
	}

	public void setAdresse(AdresseDTO adresse) {
		this.adresse = adresse;
	}

	public PersonneDTO getUnAscendant() {
		return unAscendant;
	}

	public void setUnAscendant(PersonneDTO unAscendant) {
		this.unAscendant = unAscendant;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((adresse == null) ? 0 : adresse.hashCode());
		result = prime * result
				+ ((dateNaissance == null) ? 0 : dateNaissance.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result
				+ ((idPersonne == null) ? 0 : idPersonne.hashCode());
		result = prime * result + (isMale ? 1231 : 1237);
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		result = prime * result
				+ ((portable == null) ? 0 : portable.hashCode());
		result = prime * result + ((prenom == null) ? 0 : prenom.hashCode());
		result = prime * result
				+ ((telephone == null) ? 0 : telephone.hashCode());
		result = prime * result
				+ ((unAscendant == null) ? 0 : unAscendant.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PersonneDTO other = (PersonneDTO) obj;
		if (adresse == null) {
			if (other.adresse != null)
				return false;
		} else if (!adresse.equals(other.adresse))
			return false;
		if (dateNaissance == null) {
			if (other.dateNaissance != null)
				return false;
		} else if (!dateNaissance.equals(other.dateNaissance))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (idPersonne == null) {
			if (other.idPersonne != null)
				return false;
		} else if (!idPersonne.equals(other.idPersonne))
			return false;
		if (isMale != other.isMale)
			return false;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		if (portable == null) {
			if (other.portable != null)
				return false;
		} else if (!portable.equals(other.portable))
			return false;
		if (prenom == null) {
			if (other.prenom != null)
				return false;
		} else if (!prenom.equals(other.prenom))
			return false;
		if (telephone == null) {
			if (other.telephone != null)
				return false;
		} else if (!telephone.equals(other.telephone))
			return false;
		if (unAscendant == null) {
			if (other.unAscendant != null)
				return false;
		} else if (!unAscendant.equals(other.unAscendant))
			return false;
		return true;
	}
	
	@Override
	public String toString()  {
	    String s= "";
	    s="Numéro: "+idPersonne+"\n"+
	    "Nom : "+nom +"\n"+
	    "Prenom : "+prenom +"\n"+
	    //"DateNaissance : "+dateNaissance +"\n"+
	    "DateNaissance : "+DateUtil.toString(dateNaissance)+"\n"+ // pour avoir le format à la française ...
	    "isMale : "+isMale +"\n"+
	    "Telephone :  "+telephone +"\n"+
	    "Portable : "+portable +"\n"+
	    "Email : "+email +"\n"+
	    "Adresse : "+adresse +"\n"+
	    "Ascendant : "+unAscendant ;
	    return s;
	  }

}
