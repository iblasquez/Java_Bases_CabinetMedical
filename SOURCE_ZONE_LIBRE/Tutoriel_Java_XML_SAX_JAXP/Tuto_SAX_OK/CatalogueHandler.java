import java.util.ArrayList;
import java.util.Collection;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import org.xml.sax.helpers.DefaultHandler;


	
public class CatalogueHandler extends DefaultHandler{
	//Le r�sultat de notre parsing
	// est r�cup�r� dans une Collection de Livre
	private Collection<Livre> catalogue;
	
	private Livre unLivre;
	
	//buffer nous permettant de r�cup�rer les donn�es 
	private StringBuffer buffer;

	// Constructeur
	public CatalogueHandler(){
		super();
	}
	
	//---------------------------------------------------
	//---- GESTIONNAIRE de CONTENU
	//---------------------------------------------------
	 /**
     * Evenement genere a chaque fois que l'analyseur rencontre une balise ouvrante.
     * @param uri URL de l'espace de nommage 
     * @param localName nom local de la balise (sans pr�fixe)
     * @param qName nom qualifi� de la balise (avec pr�fixe) 
     * @param atts collection des attributs de l'�l�ment
     * @throws SAXException si la balise ne correspond pas � ce qui est attendu
     **/
	//D�tection d'ouverture d'�l�ments ouvrants
	// seul catalogue et livre nous int�resse
	// --> catalogue pour instancier une ArrayList
	// --> livre pour instancier un nouveau livre
	// --> pour les balises titre,auteur,edition et ISBN 
	// on instancie un StringBuffer qui permettra de r�cup�rer les donn�es
	// c-a-d qui sera mis � jour avec le m�thode characters...
	// L'�tat interne du livre sera affect� 
	// lors de la fermeture d'un �lement de type titre,auteur,editionn,ISBN
	public void startElement(String uri, String localName,
			String qName, Attributes attributes) throws SAXException{
		if(qName.equals("catalogue")){
			catalogue = new ArrayList<Livre>();
		}
		else if(qName.equals("livre")){
			unLivre = new Livre();
			//inLivre = true;
		}
		else {
			buffer = new StringBuffer();
			if( qName.equals("titre") || qName.equals("auteur") 
					|| qName.equals("edition") ||qName.equals("ISBN") )
			{	buffer = new StringBuffer(); }
			
		    else{
				//erreur, on peut lever une exception
				throw new SAXException("Balise "+qName+" inconnue.");
				}
			}
	} // fin startElement
	
	/**
     * Evenement g�n�r� a chaque fermeture d'une balise.
      */
	//d�tection fin de balise
	// --> pour catalogue : ne rien faire
	// --> pour livre : ajouter le livre dans le catalogue
	// --> pour titre,auteur,edition,ISBN, on met � jour 
	// l'�tat interne du livre en cours d'analyse...
	public void endElement(String uri, String localName, String qName)
			throws SAXException{
		if(qName.equals("catalogue")){
			//ne rien faire ...
		}else if(qName.equals("livre")){
			catalogue.add(unLivre);
			unLivre = null;
		}else if(qName.equals("titre")){
			unLivre.setTitre(buffer.toString());
			buffer = null;
		}else if(qName.equals("auteur")){
			unLivre.setAuteur(buffer.toString());
			buffer = null;
		}else if(qName.equals("edition")){
			unLivre.setEdition(buffer.toString());
			buffer = null;
		}else if(qName.equals("ISBN")){
			unLivre.setISBN(buffer.toString());
			buffer = null;
		}else{
			//erreur, on peut lever une exception
			throw new SAXException("Balise "+qName+" inconnue.");
		}          
	}
	// Evenement genere � la rencontre de texte entre deux balises
	public void characters(char[] ch,int start, int length)
			throws SAXException{
		String lecture = new String(ch,start,length);
		if(buffer != null) buffer.append(lecture); 
		// test de buffer != null pour s"assurer qu'on ne m�morise pas des espaces blancs
		// car entre deux �l�ments : buffer est null, puisque buffer est instanci�
		// en d�but d'�l�ment (balise ouvrante)...
	}
	
	/**
     * Evenement genere au debut du document
     * c-a-d au demarrage du parse du flux xml.
     * @throws SAXException en cas de probleme ne permettant pas de
     * lancer dans l'analyse du document.
     */
	public void startDocument() throws SAXException {
		System.out.println("D�but du parsing");
		System.out.println("----------------------------");
	}
	
	/**
     * Evenement genere en fin de document
     * c-a-d a la fin de l'analyse du flux xml.
     * @throws SAXException en cas de probleme ne permettant pas de
     * considerer l'analyse du document  complete.
     */
	public void endDocument() throws SAXException {
		System.out.println("Fin du parsing");
		System.out.println("----------------------------");
		System.out.println("Resultats du parsing");
		System.out.println("----------------------------");
		for(Livre livre : catalogue){
			System.out.println(livre);
			System.out.println("----------------------------");
		}
	}
	
	//---------------------------------------------------
	//---- GESTIONNAIRE d'ERREUR
	//---------------------------------------------------
	// Impl�mentation des m�thodes error, fatalError et warning 
	// � rajouter 
	
	
}


