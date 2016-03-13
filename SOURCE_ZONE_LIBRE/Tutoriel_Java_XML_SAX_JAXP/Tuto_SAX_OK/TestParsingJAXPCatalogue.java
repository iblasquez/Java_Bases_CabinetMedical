package com.iut.testSax;

import java.io.IOException;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.SAXException;
import javax.xml.parsers.ParserConfigurationException;


public class TestParsingJAXPCatalogue {
	
	public static void main(String[] args) {
	
		try {
			// Instanciation du parser à l'aide d'une SAXParserfactory
			SAXParserFactory factory = SAXParserFactory.newInstance();
			SAXParser parser = factory.newSAXParser();
			
		    // Instanciation du gestionnaire ...
			CatalogueHandler monGestionnaireSAX = new CatalogueHandler();
			parser.parse("testSAX3.xml", monGestionnaireSAX);
		//… suivis des catch nécessaires … 
	} catch (SAXException e) {
		System.out.println("Erreur d'analyse: "+ e.getMessage());
	} catch (IOException e) {
		System.out.println("Erreur I/O: "+ e.getMessage());
	} catch (ParserConfigurationException e) {
		System.out.println("Erreur configuration du parser: "+ e.getMessage());
	}
	
	System.out.println("-- Fin TestParsingSAXCatalogue !!! ");
	}
}// fin classe TestParsingJAXPCatalogue
