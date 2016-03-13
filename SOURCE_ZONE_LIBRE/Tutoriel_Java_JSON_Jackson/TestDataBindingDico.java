package com.iut.tutoJackson.essai.databinding;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.iut.tutoJackson.metier.Definition;
import com.iut.tutoJackson.metier.Dictionnaire;
import com.iut.tutoJackson.metier.Lettre;
import com.iut.tutoJackson.metier.Mot;
import com.iut.tutoJackson.metier.User;

public class TestDataBindingDico {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// /////////////////////////////////
		// Dictionnaire Test
		// ////////////////////////////////
		Dictionnaire dictionnaire = new Dictionnaire();
		// Mot : Abricot
		Definition definition = new Definition();
		definition.setContent("Un abricot est ...");
		definition.setRapporteur("Kent Back");
		Definition autreDefinition = new Definition();
		autreDefinition.setContent("ou encore ...");
		autreDefinition.setRapporteur("Robert Martins");
		Mot mot = new Mot();
		mot.setMot("Abricot");
		mot.setDefinitions(Arrays.asList(definition, autreDefinition));
		// Mot : Abeille
		Definition definition2 = new Definition();
		definition2.setContent("Une abeille est ...");
		definition2.setRapporteur("Martin Fowler");
		Mot autreMot = new Mot();
		autreMot.setMot("Abeille");
		autreMot.setDefinitions(Arrays.asList(definition2));
		// Lettre A
		Lettre lettre = new Lettre();
		lettre.setLettre("A");
		lettre.setMots(Arrays.asList(mot,autreMot));
		dictionnaire.getLettres().add(lettre);

		System.out.println(dictionnaire);
		System.out.println("---------------------------------------");

		// //////////////////
		// Sérialisation
		// ///////////////////
		System.out.println("---------------------");
		System.out.println("--- SERIALISATION ---");
		System.out.println("---------------------");
		
		// A vous d'écrire le code pour procéder à la sérialisation
		// d'un dictionnaire dans le fichier dictionnaire.json
		
		

		// //////////////////
		// Dé-Sérialisation
		// ///////////////////
		System.out.println("---------------------");
		System.out.println("--- DESERIALISATION ---");
		System.out.println("---------------------");
		
		// A vous d'écrire le code pour procéder à la désérialisation
		// d'un dictionnaire à partir du fichier dictionnaire.json
		
		
		// et afficher dans la console, le dictionnaire désérialiser...
		
		
	}

}
