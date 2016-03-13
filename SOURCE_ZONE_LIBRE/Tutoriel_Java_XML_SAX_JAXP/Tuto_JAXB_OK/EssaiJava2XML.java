package com.iut.testJAXB;

import java.io.FileOutputStream;
import java.io.IOException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;




public class EssaiJava2XML {
	
	public static void main( String[] args ) {
		try {
			// Cr�ation d'un JAXBContext: point d'entr�e dans l'API JAXB
			JAXBContext jc = JAXBContext.newInstance("com.iut.testJAXB");
					
			// Creation d'un Marshaller
		     Marshaller marshaller = jc.createMarshaller();
		     marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true); // Indentation du document XML g�n�r�
		     
		    // Creation d'un graphe d'objets compatible JAXB
		     Livre livre1 = new Livre();
		     livre1.setTitre("XML");
		     livre1.setAuteur("Alexandre BRILLANT");
		     livre1.setEdition("Eyrolles");
		     livre1.setISBN("92-212-12151-3");
		    	    		     
		  // Ecriture du flux XML � partir 
		  // de l'objet racine du graphe d'objets
		   marshaller.marshal(livre1, new FileOutputStream("JAXBOutput.xml"));
			    
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		catch (IOException e) {// Exception n�cessaire en raison du FileInpuStream
			e.printStackTrace();
		}
	
	System.out.println(" Fin de EssaiJava2XML");

	}// fin main

}
