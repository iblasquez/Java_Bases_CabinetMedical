package com.iut.tutoJackson.metier;


import java.util.List;

public class Lettre {

	private String lettre;
	private List<Mot> mots;

	public String getLettre() {
		return lettre;
	}

	public void setLettre(String lettre) {
		this.lettre = lettre;
	}

	public List<Mot> getMots() {
		return mots;
	}

	public void setMots(List<Mot> mots) {
		this.mots = mots;
	}
	
	@Override
	public String toString() {
	String resu = lettre + "\n";
	for (Mot mot : mots)
		{
		resu = resu + "   --> " + mot + "\n";
		}
	return resu;
}

}
