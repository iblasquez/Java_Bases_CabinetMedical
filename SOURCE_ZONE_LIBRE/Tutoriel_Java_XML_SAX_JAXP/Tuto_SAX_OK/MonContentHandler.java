import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;


public class MonContentHandler implements ContentHandler{

	
    /**
     * Evenement genere au debut du document
     * c-a-d au demarrage du parse du flux xml.
     * @throws SAXException en cas de probleme ne permettant pas de
     * lancer dans l'analyse du document.
     */
    public void startDocument() throws SAXException {
    	 System.out.println("----------------------");
         System.out.println("Debut de l'analyse du document XML");
         System.out.println("----------------------");
    }



//------------------------------------------------------------------------



    /**
     * Evenement genere en fin de document
     * c-a-d a la fin de l'analyse du flux xml.
     * @throws SAXException en cas de probleme ne permettant pas de
     * considerer l'analyse du document  complete.
     */
    public void endDocument() throws SAXException {
 	      System.out.println("----------------------");
          System.out.println("Fin de l'analyse du document" );
          System.out.println("----------------------");
    }



//------------------------------------------------------------------------

    /**
     * Evenement genere a chaque fois que l'analyseur rencontre une balise xml 

ouvrante.
     * @param uri URL de l'espace de nommage 
     * @param localName nom local de la balise (sans préfixe)
     * @param qName nom qualifié de la balise (avec préfixe) de la forme 

<code>nameSpaceURI + ":" + localName</code>
     * @param atts collection des attributs de l'élément
     * @throws SAXException si la balise ne correspond pas a ce qui est 

attendu,
     * comme par exemple non respect d'une dtd.
     */
    public void startElement(String uri, String localName, String name,
			Attributes atts) throws SAXException {
    	
    	    System.out.println();
    	    System.out.println("----------------------");
            System.out.println(" Ouverture de la balise " + localName );
            
            // s'il existe un espace de nom 
            // cela ne sera pas le cas dans nos exemples : testSAXi.xml
            if  ( ! "".equals(uri)){ 
            	System.out.println("--> appartenant a espace de nommage : "  + 

uri);
            	System.out.println("--> nom qualifié de la balise : " + name);
            	}
           
            // A propos des attributs de la balise
            int nbAttributs = atts.getLength();
            if (nbAttributs ==0) System.out.println("--> pas d'attributs pour cette balise");
            else
            	{ 
            	System.out.println("--> Détail des attributs de cette balise :");//parcours de la liste des attributs
            	for (int index = 0; index < nbAttributs; index++) { 
                    System.out.println("     -> " +  atts.getLocalName(index) 

+ " = " + atts.getValue(index));
            		}
            	}
    }



//------------------------------------------------------------------------

    /**
     * Evenement généré a chaque fermeture d'une balise.
      */
    public void endElement (String uri, String localName, String name)
	throws SAXException {
            
    	 System.out.println();
    	 System.out.println("----------------------");
         System.out.println(" Fermeture de la balise " + localName);
  
    }

 // Evenement genere à la rencontre de texte entre deux balises
	public void characters(char[] ch, int start, int length)
			throws SAXException {
		   String content = new String (ch,start,length);
		   System.out.println("--> caractères rencontrés : " + content);
	}

	


	
	public void endPrefixMapping(String arg0) throws SAXException {
		// TODO Auto-generated method stub
		
	}

	/*public void ignorableWhitespace(char[] arg0, int arg1, int arg2)
			throws SAXException {
		// TODO Auto-generated method stub
		
	}*/
	/**
     * Recu chaque fois que des caracteres d'espacement peuvent etre ignores au sens de
     * XML. C'est a dire que cet evenement est envoye pour plusieurs espaces se succedant,
     * les tabulations, et les retours chariot se succedants ainsi que toute combinaison de ces
     * trois types d'occurrence.
     * @param ch les caracteres proprement dits.
     * @param start le rang du premier caractere a traiter effectivement.
     * @param end le rang du dernier caractere a traiter effectivement
     * @see org.xml.sax.ContentHandler#ignorableWhitespace(char[], int, int)
     */
    public void ignorableWhitespace(char[] ch, int start, int end) throws SAXException {
            System.out.println("espaces inutiles rencontres : ..." + new String(ch, start, end) +  "...");
    }


	public void processingInstruction(String arg0, String arg1)
			throws SAXException {
		// TODO Auto-generated method stub
		
	}

	public void setDocumentLocator(Locator arg0) {
		// TODO Auto-generated method stub
		
	}

	public void skippedEntity(String arg0) throws SAXException {
		// TODO Auto-generated method stub
		
	}

	

	public void startPrefixMapping(String arg0, String arg1)
			throws SAXException {
		// TODO Auto-generated method stub
		
	}

}
