package com.iut.cabinet.metier;

import java.util.Collection;

public class PersonneDAOJDBC implements PersonneDAO{
	
	
	
/////////////////////////////
	// Create et Update du CRUD
	/** permet de cr�er ou mettre � jour une Personne quel que soit son type
	 * @param unePersonne la personne � cr�er/mettre � jour
	 * @return int idPersonne correspondant � la cl� unique
	 */
	public int store(Personne unePersonne){
		
		// .... � vous de coder ....
		return 0 ; // � changer
	}
	
	
	/////////////////////////////
	// Retrieve CRUD
	/** permet de r�cup�rer la liste compl�te des personnes
	 * @return Collection<Personne> la liste des personnes
	 */
	public Collection<Personne> findAllPersonnes(){
		
		// .... � vous de coder ....
		return null; // � changer...
	}
	
	/** permet de charger une personne 
	 * @param idPersonne correspond � la cl� unique
	 * @return Personne la personne trouv�e (null sinon)
	 */
	public Personne loadPersonne(int idPersonne){
		
		// .... � vous de coder ....
		return null; // � changer...
	}
	
	/** permet de v�rifier l'existnece ou non d'une personne selon sa cl�
	 * @param unePersonne � tester
	 * @return true ou false
	 */
	public boolean existPersonne(Personne unePersonne){
		
		// .... � vous de coder ....
		return true; // � changer...
	}


	/////////////////////////////
	// Delete CRUD
	/** permet de supprimer une personne
	 * @param  idPersonne correspond � la cl� unique de la personne � supprimer
	 * @return true ou false
	 */
	public boolean deletePersonne(int idPersonne){
		
		// .... � vous de coder ....
		return true; // � changer...
	}

	
	//... coder �galement toutes les m�thodes que vous auriez pu rajouter ...

	
}

