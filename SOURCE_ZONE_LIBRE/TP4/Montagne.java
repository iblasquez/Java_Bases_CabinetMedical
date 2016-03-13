public class Montagne {
	private String nom;
	private int hauteur;
	
	//Constructeurs
	public Montagne(){}
	
	public Montagne(String n, int h)
	{ this.setNom(n); this.setHauteur(h);}
	
	// Getteurs & Setteurs
	public String getNom()
	{return this.nom;}
	
	public void setNom(String nouvNom)
	{this.nom=nouvNom;}
	
	public int getHauteur()
	{return this.hauteur;}
	
	public void setHauteur(int nouvHaut)
	{this.hauteur=nouvHaut;}
	
	//toString
	public String toString(){
	return nom + " \t --> "+ hauteur + " m d'altitude";}
	
} // fin classe Montagne
	

