package com.iut.testJAXB;

import java.io.FileInputStream;
import java.io.IOException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class EssaiX2J {
	
	public static void main( String[] args ) {
		try {
			// 1. Cr�ation d'un JAXBContext
			// point d'entr�e dans l'API JAXB
			JAXBContext jc = JAXBContext.newInstance(Personne.class);// � la place de "com.iut.testJAXB" avec xjc
			
			
			// 2. Creation d'un Unmarshaller
		     Unmarshaller unm = jc.createUnmarshaller();
		     
		     
		     // 3. Lecture du flux XML 
		     // et construction du graphe d'objets Java 
			Personne unePers = (Personne) unm.unmarshal(new FileInputStream("Personne.xml"));

		    
			// 4. Consultation  
			    System.out.println("La personne extraite du document XML est : " );
		    	System.out.println("Nom : " + unePers.getNom());
		    	System.out.println("Prenom : " + unePers.getPrenom());
		    	System.out.println("Taille: " + unePers.getTaille());
		    	System.out.println("-----------------------");
     
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		catch (IOException e) {// Exception n�cessaire en raison du FileInpuStream
			e.printStackTrace();
		}
	
		System.out.println(" Fin de EssaiX2J");

	}// fin main

}
