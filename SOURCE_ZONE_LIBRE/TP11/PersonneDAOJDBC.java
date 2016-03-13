package com.iut.cabinet.metier;

import java.util.Collection;

public class PersonneDAOJDBC implements PersonneDAO{
	
	
	
/////////////////////////////
	// Create et Update du CRUD
	/** permet de créer ou mettre à jour une Personne quel que soit son type
	 * @param unePersonne la personne à créer/mettre à jour
	 * @return int idPersonne correspondant à la clé unique
	 */
	public int store(Personne unePersonne){
		
		// .... à vous de coder ....
		return 0 ; // à changer
	}
	
	
	/////////////////////////////
	// Retrieve CRUD
	/** permet de récupérer la liste complète des personnes
	 * @return Collection<Personne> la liste des personnes
	 */
	public Collection<Personne> findAllPersonnes(){
		
		// .... à vous de coder ....
		return null; // à changer...
	}
	
	/** permet de charger une personne 
	 * @param idPersonne correspond à la clé unique
	 * @return Personne la personne trouvée (null sinon)
	 */
	public Personne loadPersonne(int idPersonne){
		
		// .... à vous de coder ....
		return null; // à changer...
	}
	
	/** permet de vérifier l'existnece ou non d'une personne selon sa clé
	 * @param unePersonne à tester
	 * @return true ou false
	 */
	public boolean existPersonne(Personne unePersonne){
		
		// .... à vous de coder ....
		return true; // à changer...
	}


	/////////////////////////////
	// Delete CRUD
	/** permet de supprimer une personne
	 * @param  idPersonne correspond à la clé unique de la personne à supprimer
	 * @return true ou false
	 */
	public boolean deletePersonne(int idPersonne){
		
		// .... à vous de coder ....
		return true; // à changer...
	}

	
	//... coder également toutes les méthodes que vous auriez pu rajouter ...

	
}

