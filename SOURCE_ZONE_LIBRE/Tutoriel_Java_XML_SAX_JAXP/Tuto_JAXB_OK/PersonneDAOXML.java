package com.iut.cabinet.metier;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.iut.cabinet.metier.JAXB.HelperException;
import com.iut.cabinet.metier.JAXB.HelperPatient;
import com.iut.cabinet.metier.JAXB.ListePatientsType;
import com.iut.cabinet.metier.JAXB.PatientType;
import com.iut.cabinet.util.DateUtil;








public class PersonneDAOXML {

	
	public static Collection<Personne> findAllPersonne() throws CabinetTechniqueException 
	{
		Collection<Personne> listPers = new ArrayList<Personne>();

		///////////////////////////////////////////////////////////////////////////////////////////
		/// 1. Mise en place d'une opération de unmarshalling ( Désérialisation XML vers JAVA)
		///    en vue de la récupération d'un graphe d'objets JAVA instanciés à partir de classes annotées JAXB
		///////////////////////////////////////////////////////////////////////////////////////////
		ListePatientsType listePatientsJAXB=null;
		try {
			// 1. Création d'un JAXBContext
			JAXBContext jc = JAXBContext.newInstance("com.iut.cabinet.metier.JAXB");
						
			// 2. Creation d'un Unmarshaller
		     Unmarshaller unm = jc.createUnmarshaller();
		        
		     // 3. Lecture du flux XML 
		     // et construction du graphe d'objets Java annotées JAXB de type ListePatientsType
		    listePatientsJAXB = (ListePatientsType) unm.unmarshal(new FileInputStream("listePatients.xml"));
			}
		 catch (JAXBException e) {
			throw new CabinetTechniqueException("Probleme lors d'une operation de unmarshalling "+e.getMessage());
			}
		catch (IOException e) {// Exception nécessaire en raison du FileInpuStream
			throw new CabinetTechniqueException("Probleme fichier lors d'une operation de unmarshalling  : "+e.getMessage());
			}
		
		 
		///////////////////////////////////////////////////////////////////////////////////////////
		/// 2. Conversion du graphe d'objets JAVA instanciés à partir de classes annotées JAXB
		//   			  en graphe d'objets JAVA instanciés à partir de classes metier
		///////////////////////////////////////////////////////////////////////////////////////////
		if (listePatientsJAXB!=null) 
			{
			 Collection<PatientType> liste= listePatientsJAXB.getPatient();
			    for(PatientType unPatJAXB : liste){
			    	try {
						listPers.add(HelperPatient.toPatient(unPatJAXB));
					} catch (CabinetMedicalException e) {
						throw new CabinetTechniqueException("findAllPersonne de PersonneDAoFichierXML : conversion Collection PatientType (JAXB) en Collection Patient  : "+e.getMessage());
						
					} catch (HelperException e) {
						throw new CabinetTechniqueException("findAllPersonne de PersonneDAoFichierXML : conversion Collection PatientType (JAXB) en Collection Patient  : "+e.getMessage());
						
					}
			      }
			}
		
		////////////////////////////////
		/// renvoi de la Collection 
		////////////////////////////////
		return listPers;
	}// fin findAllPersonne

	
	
	
	
	//////////////////////////////////////////////
	// Méthode permettant la SERIALISATION
	public static void storeAllPersonne (Collection<Personne> uneListe) throws CabinetTechniqueException
	{

		///////////////////////////////////////////////////////////////////////////////////////////
		/// 1. Conversion du graphe d'objets JAVA instanciés à partir de classes métier
		//   			  en graphe d'objets JAVA instanciés à partir de classes annotées JAXB
		///////////////////////////////////////////////////////////////////////////////////////////
		
		// ... à vous de coder  
		
		///////////////////////////////////////////////////////////////////////////////////////////
		/// 2. Mise en place d'une opération de marshalling ( Sérialisation JAVA vers XML )
		///////////////////////////////////////////////////////////////////////////////////////////
		
		// ... à vous de coder  
		 
		} // fin storeAllPersonnes
	
	
	
	
	public static void main(String args[])
	{

		//////////////////////////
		/// Test storeAllPersonne
		//////////////////////////
		/*Collection<Personne> uneListe=new ArrayList<Personne>();
		
		Patient patient1=null;
		try {
			patient1=new Patient(1,"DUPONT","Julie",DateUtil.toDate("21/05/1960",DateUtil.FRENCH_DEFAUT),
			   false,"0555434355","0606060606","julie.dupont@tralala.fr",
			   new Adresse("15","avenue Jean Jaurès",null,null,"87000","Limoges","France"),
			   null,
			   "LEDOC Paul","260058700112367");
		} catch (CabinetMedicalException e) {
			System.out.println(" PB création Patient 1... "+e.getMessage());
		}	
		
		Patient patient2=null;
		try {
			patient2=new Patient(2,"DURAND","Toto",DateUtil.toDate("25/12/1990",DateUtil.FRENCH_DEFAUT),
					true,"0555430000","0605040302","toto.durand@etu.unilim.fr",
			        new Adresse("185","avenue Albert Thomas",null,"Résidence La Borie - Batiment A","87085","Limoges","France"),
			        null,
			        "CHILDREN Rose","297112A10102401");
		} catch (CabinetMedicalException e) {
			System.out.println(" PB création Patient 1... "+e.getMessage());
		}
	
		if (patient1!=null) uneListe.add(patient1);
		if (patient2!=null) uneListe.add(patient2);
			
		try {
			PersonneDAOXML.storeAllPersonne (uneListe);
		} catch (CabinetTechniqueException e) {
			System.out.println(" PB storeAllPersonne "+e.getMessage());
			e.printStackTrace();
			
		}
		System.out.println(" FIN Test storeAllPersonne ");
		System.out.println("------------------------");
		*/
		
		
		//////////////////////////
		/// Test Lister
		//////////////////////////
		try {
			Collection<Personne> maListe = PersonneDAOXML.findAllPersonne();
			
			for (Personne unePers : maListe)
				{
				System.out.println(unePers);
			    System.out.println("------------------------");
				}
		} catch (CabinetTechniqueException e) {
			System.out.println(" Erreur Test  findAllPersonne"+e.getMessage());
			
			e.printStackTrace();
		}
		System.out.println(" FIN Test findAllPersonne ");
		System.out.println("------------------------");
		
		System.out.println(" -- Fin Test PersonneDAOXML ");
		
	}
	
	
}// fin classe PersonneDAOXML
