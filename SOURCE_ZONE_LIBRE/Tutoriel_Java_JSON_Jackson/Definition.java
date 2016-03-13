package com.iut.tutoJackson.metier;


public class Definition {

	private String content;
	private String rapporteur;
	

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getRapporteur() {
		return rapporteur;
	}

	public void setRapporteur(String rapporteur) {
		this.rapporteur = rapporteur;
	}

	@Override
	public String toString() {
		return "\t content : " + content + "\n \t" +
				" rapporteur : "+rapporteur;
	}
}
