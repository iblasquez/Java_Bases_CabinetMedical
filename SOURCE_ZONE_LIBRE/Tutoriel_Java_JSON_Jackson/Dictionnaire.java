package com.iut.tutoJackson.metier;


import java.util.ArrayList;
import java.util.List;

public class Dictionnaire {

	private List<Lettre> lettres = new ArrayList<Lettre>();

	public List<Lettre> getLettres() {
		return lettres;
	}

	public void setLettres(List<Lettre> lettres) {
		this.lettres = lettres;
	}
	@Override
	public String toString() {
		String resu = " ";
		for (Lettre lettre : lettres)
			{
			resu = resu + "lettre : " + lettre;
			resu = resu + "--------------------";
			}
		return resu;
	}

}
