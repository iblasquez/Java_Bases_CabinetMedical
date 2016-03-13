package com.iut.testJAXB;

import java.io.FileOutputStream;
import java.io.IOException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;



public class EssaiJ2X {
		
		public static void main( String[] args ) {
			try {
				// Cr�ation d'un JAXBContext: point d'entr�e dans l'API JAXB
				JAXBContext jc = JAXBContext.newInstance(Personne.class);// � la place de "com.iut.testJAXB" avec xjc
				
				
				// Creation d'un Marshaller
			     Marshaller marshaller = jc.createMarshaller();
			     marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true); // Indentation du document XML g�n�r�
			     
			    // Creation d'une personne
			     Personne pers= new Personne();
			     pers.setNom("LAGAFFE");
			     pers.setPrenom("Gaston");
			     pers.setTaille(170);
		    
			     
			    // Ecriture du flux XML � partir 
			    // de l'objet racine du graphe d'objets
			     marshaller.marshal(pers, new FileOutputStream("Personne.xml"));
			 			    
			} catch (JAXBException e) {
				e.printStackTrace();
			}
			catch (IOException e) {// Exception n�cessaire en raison du FileInpuStream
				e.printStackTrace();
			}
			
			System.out.println(" Fin de EssaiJ2X");
			
		}// fin main

	} // fin EssaiJ2X


