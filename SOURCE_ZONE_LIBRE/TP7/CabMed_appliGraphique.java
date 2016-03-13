package com.iut.cabinet.essai;

import javax.swing.JFrame;

import com.iut.cabinet.presentation.CabMedMainFrame;

public class CabMed_appliGraphique {

	public static void main(String[] args) {
		CabMedMainFrame fenetre = new CabMedMainFrame();
		fenetre.setTitle("Cabinet Medical PIC'OUZ");
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenetre.setSize(500,500);
		fenetre.setVisible(true);
	}
}
