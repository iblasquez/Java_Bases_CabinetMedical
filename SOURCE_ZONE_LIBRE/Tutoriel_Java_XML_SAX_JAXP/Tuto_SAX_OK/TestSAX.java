import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;


public class TestSAX {
	
	// Constructeur
	public TestSAX(){

		try {
			// Etape n°1: Instanciation d'un parseurSAX à l'aide d'une factory
			XMLReader saxParser = XMLReaderFactory.createXMLReader("org.apache.xerces.parsers.SAXParser");
		} catch (SAXException e) {
			System.out.println("Erreur d'analyse: "+ e.getMessage());
		}
	
	}
	
	
	//Test
	public static void main(String[] args) {
			TestSAX monPremierSAX = new TestSAX();
			
			System.out.println("Fin du Test !!! ");
	}

}
