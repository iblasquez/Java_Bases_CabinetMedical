package com.iut.tutoJackson.metier;


import java.util.List;

public class Mot {

	private String mot;
	private List<Definition> definitions;

	public String getMot() {
		return mot;
	}

	public void setMot(String mot) {
		this.mot = mot;
	}

	public List<Definition> getDefinitions() {
		return definitions;
	}

	public void setDefinitions(List<Definition> definitions) {
		this.definitions = definitions;
	}
	
	@Override
	public String toString() {
	String resu = mot + "\n";
	for (Definition def : definitions)
		{
		resu = resu + def + "\n \n";
		}
	return resu;
}

}
