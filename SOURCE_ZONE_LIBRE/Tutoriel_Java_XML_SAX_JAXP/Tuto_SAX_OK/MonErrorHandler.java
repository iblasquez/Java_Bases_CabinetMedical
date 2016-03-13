import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;


public class MonErrorHandler implements ErrorHandler{

	// m�thode permettant de g�rer les erreurs
	public void error(SAXParseException arg0) throws SAXException {
		System.out.println("Erreur SAX rencontree ligne "+ 
									arg0.getLineNumber()
									+ ": " + arg0.getMessage());
		
	}

	// m�thode permettant de g�rer les erreurs fatales
	public void fatalError(SAXParseException arg0) throws SAXException {
		System.out.println("Erreur FATALE SAX rencontree ligne "+ 
				arg0.getLineNumber()
				+ ": " + arg0.getMessage());
		
	}
	
	// m�thode permettant de g�rer les warning
	public void warning(SAXParseException arg0) throws SAXException {
		System.out.println("Avertissement SAX rencontree ligne "+ 
				arg0.getLineNumber()
				+ ": " + arg0.getMessage());
		
	}

}
