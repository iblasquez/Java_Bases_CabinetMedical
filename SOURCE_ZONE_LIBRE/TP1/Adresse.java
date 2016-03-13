package com.iut.cabinet.metier;

/**	 Une <code> Adresse </code> représente une adresse postale.
 *  Elle est caractérisée par :
 * <ul>
 * <li> un <code>numéro</code> </li>
 * <li> un libellé de <code>rue</code> </li>
 * <li> un libellé de <code>voie</code> </li>
 * <li> un complément d'identification du point géographique comme un <code>batiment</code> </li>
 * <li> un <code>code postal</code> </li>
 * <li> une localité de destination (<code>ville </code>) </li>
 * <li> un <code> pays </code> </li>       
 * </ul>
 * @author Isabelle BLASQUEZ
 * @version 1.0
 */
public class Adresse {
	
	/** Le numero
     * @see Adresse#getNumero
     * @see Adresse#setNumero
     */
	  private String numero; // String car il peut y avoir 21 bis
	
	/** Le libellé de la rue. 
     * @see Adresse#getRue
     * @see Adresse#setRue
     */
	  private String rue;
	  
	  /** Le libellé de la voie. 
	     * @see Adresse#getVoie
	     * @see Adresse#setVoie
	     */
	  private String voie;
	  
	  /** Le complément d'identification du point géographique. 
	     * @see Adresse#getBatiment
	     * @see Adresse#setBatiment
	     */
	  private String batiment;
	  
	  /** Le code Postal. 
	     * @see Adresse#getCodePostal
	     * @see Adresse#setCodePostal
	     */
	  private String codePostal;
	  
	  /** La localité de destination
	     * @see Adresse#getVille
	     * @see Adresse#setVille
	     */
	  private String ville;
	  
	  /** Le pays.
	     * @see Adresse#getPays
	     * @see Adresse#setPays
	     */
	  private String pays;

	  ////////////////////
	  // Constructeurs
	  ////////////////////
	  /**
	     * Construit une nouvelle <code> Adresse </code>
	     * en passant des valeurs par défaut pour tous les attributs
	     */
	  public Adresse() {  }  
	 
	    /**
	     * Construit une nouvelle <code> Adresse </code>
	     * en passant une valeur spécifique pour tous les attributs
	     * 
	     * @param numero     le numéro
	     * @param rue    	 le libellé de la rue.
	   	 * @param voie 		 le libellé de la voie. 
	   	 * @param batiment   le complément d'identification
	   	 * @param codePostal le code Postal. 
	   	 * @param ville		 la localité de destination
	   	 * @param pays		 le pays.
	     */
	  public Adresse(String numero, String rue,String voie,String batiment,
			  String codePostal, String ville, String pays){
			setNumero(numero);
			setRue(rue);
			setVoie(voie);
			setBatiment(batiment);
			setCodePostal(codePostal);
			setVille(ville);
			setPays(pays);
		    }
		  
	  ///////////////////////////
	  // Getteurs et Setteurs
	  ///////////////////////////
	  /////////////
	  // Numero
	  /** Retourne le numero de cette <code>Adresse</code> sous forme de <code>String</code>.
       * @return le <code>numéro</code>. */
	  public String getNumero()
	  {	    return numero;	  }
	  
	  /** Mise à jour du numéro de cette <code>Adresse</code>.
       * @param numero le nouveau numéro de cette <code>Adresse</code>.
       */
	  public void setNumero(String numero)
	  {	    this.numero = numero;   }
	  
	  /////////////
	  // Rue
	  /** Retourne le libellé de la rue de cette <code>Adresse</code> sous forme de <code>String</code>.
       * @return le libellé de la <code>rue</code>.  */
	  public String getRue()
	  {	    return rue;	  }
	  
	  /** Mise à jour du libellé de la rue de cette <code>Adresse</code>.
       * @param rue le nouveau libellé de la rue de cette <code>Adresse</code>
       */
	  public void setRue(String rue)
	  {	    this.rue = rue;	  }


	  /////////////
	  // Voie
	  /** Retourne le libellé de la voie de cette <code>Adresse</code> sous forme de <code>String</code>.
       * @return le libellé de la <code>voie</code>.  */
	  public String getVoie()
	  {	    return voie;	  }
	  
	  /** Mise à jour du libellé de la voie de cette <code>Adresse</code>.
       * @param voie le nouveau libellé de la voie de cette <code>Adresse</code>
       */
	  public void setVoie(String voie)
	  {	    this.voie = voie;	  }

	  ///////////////
	  // Batiment
	  /** Retourne le complément d'identification du point géographique de cette <code>Adresse</code> sous forme de <code>String</code>.
       * @return le complément d'identification du point géographique sous forme de <code>batiment</code>.  */
	  public String getBatiment()
	  {	    return batiment;	  }
	  
	  /** Mise à jour du complément d'identification du point géographique cette <code>Adresse</code>.
       * @param batiment le nouveau complément d'identification du point géographique de cette <code>Adresse</code>
       */
	  public void setBatiment(String batiment)
	  {	    this.batiment = batiment; 	  }

	 

	  ///////////////
	  // codePostal
	  /** Retourne le code postal cette <code>Adresse</code> sous forme de <code>String</code>.
       * @return le <code>code postal </code>.  */
	   public String getCodePostal()
	  {	    return codePostal;	  }

	   /** Mise à jour du code postal cette <code>Adresse</code>.
	    * @param codePostal le nouveau code postal de cette <code>Adresse</code> */
	   public void setCodePostal(String codePostal)
		  {   this.codePostal = codePostal;  }
	  
	   ///////////////
	  // Ville
	   /** Retourne la localité de destination de cette <code>Adresse</code> sous forme de <code>String</code>.
	   * @return la localité de destination (<code>ville</code>).  */
	   public String getVille()
		  {
		    return ville;
		  }
	   
	   /** Mise à jour de la localité de destination cette <code>Adresse</code>.
	    * @param ville la nouvelle localité de destination de cette <code>Adresse</code> */
	   public void setVille(String ville)
	  {	    this.ville = ville;  }


	  ///////////////
	  // Pays
	   /** Retourne le pays de cette <code>Adresse</code> sous forme de <code>String</code>.
	    * @return le <code>pays </code>.  */
	   public String getPays()
		  {   return pays;  }
	   
	   /** Mise à jour du pays cette <code>Adresse</code>.
	    * @param pays le nouveau pays de cette <code>Adresse</code> */
	   public void setPays(String pays)
	  {	    this.pays = pays;  }


	 	  
	  /////////////////////////////////////////////////////////////
	  // Les 3 méthodes : toString, equals et hashcode 
	  // ... à retrouver dans toutes vos classes métiers ...
	  /////////////////////////////////////////////////////////////
	   /** Retourne un <code>String</code> qui contient les caractéristiques de cette <code>Adresse</code>.
	      * @return une chaine de caractères contenant les caractéristiques de cette <code>Adresse</code> */
	  public String toString()  {  
		    String s= "";
		    s="\n \t numéro: "+numero +"\n"+
		    "\t rue: "+rue +"\n"+
		    "\t voie: "+voie +"\n"+
		    "\t batiment: "+batiment +"\n"+
		    "\t codePostal: "+codePostal +"\n"+
		    "\t ville: "+ville +"\n"+
		    "\t pays: "+pays;
		    return s;
		  }
	  
	  /** Teste si l'<code>Objet</code> spécifié est bien une <code>Adresse</code> et si cette dernière est égale à cette <code>Adresse</code>
	    * en comparant les valeurs des attributs suivants : <code>numero</code>, <code>rue</code>, <code>codePostal</code>, <code>ville</code> et <code>pays</code>.
	    * @param obj l'<code>Adresse</code> spécifiée à comparer avec cette <code> Adresse </code>
	    * @return true  si les attributs <code>numero</code>, <code>rue</code>,
	    * <code>codePostal</code>, <code>ville</code>, <code>pays</code> ont la même valeur pour les deux <code> Adresse</code>; faux sinon. 
		*/
	   	// Egalité par rapport aux attributs : numero, rue codePostal, vill et pays
	  	// on ne teste pas ni voie, ni batiment...
	  	// méthode equals obtenue par generation automatique du code...
	  	// revient à tester ... 
	  	//  if ((numero.equals(adres.numero)) && (rue.equals(adres.rue)) 
	  	//	 && (codePostal.equals(adres.codePostal)) &&
	  	//	   (ville.equals(adres.ville)) && (pays.equals(adres.pays))) 
	  	//	  	return true;
	  	//  else return false;
		public boolean equals(Object obj) {
			if (this == obj) return true;
			if (obj == null) return false;
			if (!(obj instanceof Adresse)) return false;
			
			// si on compare bien 2 objets de type Adresse
			// on compare alors le contenu plus particulièrement
			// le codePostal, le numero, pays, rue, ville
			Adresse other = (Adresse) obj;
			if (codePostal == null) {
				if (other.codePostal != null)
					return false;
			}  else if (!codePostal.equals(other.codePostal))
				return false;
			if (numero == null) {
				if (other.numero != null)
					return false;
			} else if (!numero.equals(other.numero))
				return false;
			if (pays == null) {
				if (other.pays != null)
					return false;
			} else if (!pays.equals(other.pays))
				return false;
			if (rue == null) {
				if (other.rue != null)
					return false;
			} else if (!rue.equals(other.rue))
				return false;
			if (ville == null) {
				if (other.ville != null)
					return false;
			} else if (!ville.equals(other.ville))
				return false;
			return true;
		}
	
		/**
		* @see java.lang.Object#hashCode()
		*/
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result
				+ ((codePostal == null) ? 0 : codePostal.hashCode());
			result = prime * result + ((numero == null) ? 0 : numero.hashCode());
			result = prime * result + ((pays == null) ? 0 : pays.hashCode());
			result = prime * result + ((rue == null) ? 0 : rue.hashCode());
			result = prime * result + ((ville == null) ? 0 : ville.hashCode());
			return result;
		}

	
	  /**
	   * 
	   * @param args
	   */
	  public static void main(String[] args)
	  {
	    Adresse adresse = new Adresse();
	    System.out.println("Adresse par défaut "+adresse);
	    
	    Adresse adresseIUTInfo = new Adresse(null,"Allee Andre Maurois",
	    									null,"Departement Informatique",
	    									"87100", "Limoges", "France");
			
	    System.out.println("Adresse Departement Informatique "+adresseIUTInfo);
	  }
	}