package com.iut.cabinet.presentation;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;



public class PanelListerPatients extends JPanel {
	
	public PanelListerPatients()
	{
	// Choix d'un gestionnaire
	// La grille est le seul composant du panel
	// le gestionnaire lui permet d'occuper tout le panel..
	// .. essayez sans et vous verrez la différence !!!
	this.setLayout(new GridLayout(1,0));
	
	
	//////////////////////////////////////////////////
	// Mise en place du Modèle de données à afficher
	/////////////////////////////////////////////////
	Object[][] data={
			{"DUPONT","Julie","21/05/1960","26005870012367",false},
			{"DUPONT","Toto","25/12/1991","26005870012367",true},
			{"MARTIN","Jean","7/10/1968","168072B12345652",false},
			};
	
	String[] columnNames={"Nom","Prénom","Date de Naissance","NIR","Ascendant"};
	
	
	//////////////////////////////////////////////////////////
	// Affichage la JTable
	// que l'on doit placer au préalable dans un conteneur de type JScrollPane 
	/////////////////////////////////////////////////////////
	JTable maTable =new JTable(data,columnNames);
	JScrollPane monScrollPane = new JScrollPane(maTable);
	add(monScrollPane);
	}
	
	
	public static void main(String args[])
	{
		JFrame fenetreTest = new JFrame();
		JPanel mainPanel = new PanelListerPatients();
		
		fenetreTest.setTitle("Test");
		fenetreTest.getContentPane().add(mainPanel);
		fenetreTest.setSize(500,500);
		fenetreTest.setVisible(true);
	}

}
