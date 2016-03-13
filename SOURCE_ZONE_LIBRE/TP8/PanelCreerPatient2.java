package com.iut.cabinet.presentation;
//////////////////////////////////////////////////////////
// ... Ceci n'est pas la mise en forme demandée
// ... mais si votre PanelCreerPatient ne marche pas
// ... vous pouvez toujours vous servir de cette classe
// ... pour continuer le TP d'aujourd'hui
// ... Bien sûr, nous en tiendrons compte dans la notation
///////////////////////////////////////////////////////////////


import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class PanelCreerPatient2 extends JPanel{
	
	
	//Tous les composants nécessaires
	// Attributs du patient
	private static final String [] TITRES={"Mr","Mme","Melle"};
	private JComboBox jcb_saisieTitre = new JComboBox (TITRES);
	private JTextField jtx_saisieNom = new JTextField (30);
	private JTextField jtx_saisiePrenom = new JTextField (30);
	private JTextField jtx_saisieTelPerso = new JTextField (10);
	private JTextField jtx_saisieTelPortable = new JTextField (10);
	private JTextField jtx_saisieMailPerso = new JTextField (120);
	
	private JTextField jtx_saisieNIR = new JTextField (15);
	private JTextField jtx_saisieMedecin = new JTextField (120);
	private JTextField jtx_saisieDate = new JTextField(10);
	
	// Attributs de l'adresse
	private JTextField jtx_saisieAdresseNumero= new JTextField (6);
	private JTextField jtx_saisieAdresseRue = new JTextField (120);
	private JTextField jtx_saisieAdresseVoie = new JTextField (120);
	private JTextField jtx_saisieAdresseBatiment = new JTextField (120);
	private JTextField jtx_saisieAdresseCodePostal = new JTextField (60);
	private JTextField jtx_saisieAdresseVille = new JTextField (120);
	private JTextField jtx_saisieAdressePays = new JTextField (120);

	
	// Boutons de validation
	JButton jb_Valider = new JButton("Valider");
	JButton jb_Quitter = new JButton("Quitter");
	
	

	////////////////////////////////
	// Constructeur
	//////////////////////////////////
	public PanelCreerPatient2(){
		
		this.setLayout(new GridLayout(0,2));
		
		this.add(new JLabel ("NIR (clé incluse) : "));
		this.add(this.jtx_saisieNIR);
		
		this.add(new JLabel ("Titre : "));
		this.add(this.jcb_saisieTitre);
		
		this.add(new JLabel ("Nom : "));
		this.add(this.jtx_saisieNom);
		
		this.add(new JLabel ("Prenom : "));
		this.add(this.jtx_saisiePrenom);
		
		this.add(new JLabel ("Date de naissance : "));
		this.add(this.jtx_saisieDate);
		
		this.add(new JLabel ("Telephone personnel : "));
		this.add(this.jtx_saisieTelPerso);
		
		this.add(new JLabel ("Telephone portable : "));
		this.add(this.jtx_saisieTelPortable);
		
		this.add(new JLabel ("Mail personnel : "));
		this.add(this.jtx_saisieMailPerso);
		
		
		this.add(new JLabel ("Numero : "));
		this.add(this.jtx_saisieAdresseNumero);
		
		this.add(new JLabel ("Rue : "));
		this.add(this.jtx_saisieAdresseRue);
		
		this.add(new JLabel ("Voie : "));
		this.add(this.jtx_saisieAdresseVoie);
		
		this.add(new JLabel ("Batiment : "));
		this.add(this.jtx_saisieAdresseBatiment);
		
		this.add(new JLabel ("Code Postal : "));
		this.add(this.jtx_saisieAdresseCodePostal);
		
		this.add(new JLabel ("Ville : "));
		this.add(this.jtx_saisieAdresseVille);
		
		this.add(new JLabel ("Pays : "));
		this.add(this.jtx_saisieAdressePays);
	
			
		this.add(new JLabel ("Médecin Traitant (Nom et Prénom à saisir) : "));
		this.add(this.jtx_saisieMedecin);
		
		
		this.add(jb_Valider);
		this.add(jb_Quitter);
		
			
		
} // fin constructeur

	
	public static void main(String args[])
	{
		JFrame fenetreTest = new JFrame();
		JPanel mainPanel = new PanelCreerPatient2();
		
		fenetreTest.setTitle("Test avec PanelCreerPatient simplifie ...");
		fenetreTest.getContentPane().add(mainPanel);
		fenetreTest.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenetreTest.setSize(500,500);
		fenetreTest.setVisible(true);
	}


	


}
