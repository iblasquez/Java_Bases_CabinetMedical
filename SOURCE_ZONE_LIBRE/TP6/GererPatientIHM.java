package com.iut.cabinet.presentation;

import java.sql.Date;
import java.util.Scanner;
import com.iut.cabinet.util.DateUtil;


public class GererPatientIHM {
	
	
	//////////////////////////////////
	//	 Constructeur
	/////////////////////////////////
	public GererPatientIHM()
		{
		int monChoix;
		
		
		
		
		// Affichage du menu Gestion des Patients 
		// et choix de l'action à réaliser ...
		// 
		do
		{
		 menu();
		 try
		 	{
			 System.out.println(" ---> Votre Choix : ");
			 Scanner sc = new Scanner(System.in);   
			 monChoix= sc.nextInt();
		 	}
		 catch(Exception e)
		 {monChoix=-1;} // -1 pour passer dans le défault 
		 				// et recommencer la saisie si par exemple lettre saisie à la place d'entier ...
		 				// voir javadoc pour savoir quelles exceptions lance réellement nextInt();
		 
		 switch (monChoix)
		 	{
		 case 1 :	creerPatient();
		 			System.out.println("--------------------------------------");
		 			break;
		 			
		 case 2 :	System.out.println("-- Modification d'un patient");
		 			System.out.println("---- \t A FAIRE ----");			
		 			System.out.println("--------------------------------------");
					break;
					
		 case 3 :	System.out.println("-- Suppression d'un patient");
		 			System.out.println("---- \t A FAIRE ----");			
		 			System.out.println("--------------------------------------");
					break;
					
		 case 4 :	System.out.println("-- Lister tous les patient");
		 			System.out.println("---- \t A FAIRE ----");			
		 			System.out.println("--------------------------------------");
					break;
					
		 case 0 :	System.out.println("-- Au revoir ... ");
					System.out.println("--------------------------------------");
					break;
		default : System.out.println("-- Veuillez saisir un entier entre 0 et 4");
		 			System.out.println("--------------------------------------");
 			}
		} while (monChoix!=0); 
				
		}

	private static void menu() 
	{
			//	 Affichage du menu 
			System.out.println("--------------------------------------");
			System.out.println("---- Gestion des Patients   ------");	
			System.out.println("--------------------------------------");
			System.out.println("-- 1. Creer un patient");
			System.out.println("-- 2. Modifier un patient");
			System.out.println("-- 3. Supprimer un patient");
			System.out.println("-- 4. Lister tous les patients");
			System.out.println("-- 0. Quitter");
			System.out.println("--------------------------------------");

	}	
	

	public void creerPatient() 
		{
			
		System.out.println(" \n ---------------------------------------------------------------");
	  	System.out.println(" \n ------ CREATION d'un NOUVEAU PATIENT (sans ascendant) ---------");
	  	System.out.println(" \n ---------------------------------------------------------------");
	   	////////////////////////////////////////////////////////////////////
		// Saisie des caractéristiques d'un patient
		// Patient sans ascendant pour le moment ...
		// Etape 2 : afficherEcranSaisie (ici ce sont plutôt des messages)
		// Etape 3 : validerSaisie
		// Ici étape 2 et étape 3 sont entremêlées car on est en mode console
	  	/////////////////////////////////////////////////////////////////////
	
	  			//nir
		System.out.println(" \t Saisir le NIR du Patient : ");
		Scanner sc = new Scanner(System.in);//Nouvel objet Scanner   
		String nir = sc.next(); // Récupération de la chaîne de caractère
	  			// nom
		System.out.println(" \t Saisir le nom du Patient : ");
		sc = new Scanner(System.in);   
		String nom= sc.next(); 
				// prenom
		System.out.println(" \t Saisir le prénom du Patient : ");
		sc = new Scanner(System.in); 
		String prenom= sc.next(); 
				// date de Naissance
		System.out.println(" \t Saisir la date de naissance (au format : jj/mm/aaaa): ");
		sc = new Scanner(System.in);
		String s_dateNaissance= sc.next();
		Date dateNaissance = DateUtil.toDate(s_dateNaissance,DateUtil.FRENCH_DEFAUT);
		
		// sexe
		boolean saisieOK=false;
		boolean isMale=false;
		do
			{
			System.out.println(" \t Saisir le sexe (m ou f) du patient : ");
			sc = new Scanner(System.in); 
			char c_isMale = sc.next().charAt(0);
			switch (c_isMale){
		 		case 'f' : 
		 		case 'F' : isMale=false;saisieOK=true;
		 					break;
		 		case 'm' : 
		 		case 'M' : isMale=true;saisieOK=true;
		 					break;
		 	   default  : System.out.println(" Veuillez saisir m ou f ");
		 	   			  break;							
				}
			}
		while (!saisieOK);
				// téléphone
		System.out.println(" \t Saisir le téléphone du patient : ");
		sc = new Scanner(System.in);   
		String telephone= sc.next(); 
				// portable
		System.out.println(" \t Saisir le portable du patient : ");
		sc = new Scanner(System.in);  
		String portable= sc.next(); 
				// email
		System.out.println(" \t Saisir l'email du patient : ");
		sc = new Scanner(System.in); 
		String email= sc.next(); 
				//	adresse
		System.out.println(" \t Saisir l'adresse du patient : ");
						//numero
		System.out.println(" \t \t numero : ");
		sc = new Scanner(System.in);   
		String numero= sc.next(); 
						//rue
		System.out.println(" \t \t rue : ");
		sc = new Scanner(System.in);  
		String rue= sc.next(); 
						//voie
		System.out.println(" \t \t voie : ");
		sc = new Scanner(System.in);   
		String voie= sc.next();
						//batiment
		System.out.println(" \t \t batiment : ");
		sc = new Scanner(System.in); 
		String batiment= sc.next(); 
						//codePostal
		System.out.println(" \t \t codePostal : ");
		sc = new Scanner(System.in);  
		String codePostal= sc.next(); 
						//ville
		System.out.println(" \t \t ville : ");
		sc = new Scanner(System.in);
		String ville= sc.next(); 
					//pays
		System.out.println(" \t \t pays : ");
		sc = new Scanner(System.in);
		String pays= sc.next(); 
	
		
		 //Medecin Traitant 
		System.out.println(" \t Saisir le nom et prénom du médecin Traitant : ");
		sc = new Scanner(System.in); 
		String medecinTraitant= sc.next(); 
		 
		 //	numéro du Patient
			System.out.println(" \t Saisir le numéro que vous donnez au Patient : ");
			sc = new Scanner(System.in); 
			Integer idPersonne= sc.nextInt(); 
		System.out.println(" \n ------------------------------------------");
				
		//	ascendant => dans une premier temps, on va travailler sans ascendant
		//  vous n'oublierez donc pas de spécifier null lors du renseignement de l'ascendant ...
		
		////////////////////////////////////////////////////////////////////
		// Etape 4 : Création du nouveau patient, appel au contrôleur ....
	  	/////////////////////////////////////////////////////////////////////
	  	
		// ..... à vous de jouer ....
		// ... et d'écrire le code ...
		// ... pour compléter les étapes manquantes du use-case ... 

		} // fin méthode creerPatient
	
	
	//... à compléter par vos soins
	// pour améliorer l'application ...
	public void modifierPatient()
		{
		}
	
	//... à compléter par vos soins
	// pour améliorer l'application ...
	public void supprimerPatient()
		{
		}
	
	//... à compléter par vos soins
	// pour améliorer l'application ...
	public void listerPatients()
		{
			
		// Déclaration d'une Collection de PatientDTO
	    Collection<PatientDTO> maListe=null;

  		// Récupération de maListe par appel à la méthode listerPatient 
  		// du contrôleur de use case
  		////////////////////////////////////////
	  	//  ... à vous de coder cet appel ... 
	  	///////////////////////////////////////

	    for(PatientDTO unPatientDTO : maListe)
	    {
	    	// Affichage restreint d'informations concernant le patient
	    	System.out.println("-----------------------------------");
	    	System.out.println(" NIR : "+ unPatientDTO.getNir());
	    	System.out.println(" Nom : "+ unPatientDTO.getNom());
	    	System.out.println(" Prenom : "+ unPatientDTO.getPrenom());
	    	System.out.println(" DateNaissance : "+
 						DateUtil.toString(unPatientDTO.getDateNaissance()));
	    	System.out.println("-----------------------------------");
	    }
		}// fin méthode listerPatient
	
	public static void main(String[] args) {
		new GererPatientIHM();
		}
	}
	




