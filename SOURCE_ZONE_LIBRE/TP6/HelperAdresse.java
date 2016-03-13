package com.iut.cabinet.application;

import com.iut.cabinet.metier.Adresse;
import com.iut.cabinet.user.AdresseDTO;

public class HelperAdresse {

	public static AdresseDTO toAdresseDTO (Adresse uneAdresse) throws HelperException
	{
		if (uneAdresse==null)throw new HelperException("HelperAdresse : Impossible de traiter dans une adresse null");
		
		AdresseDTO adDTO = new AdresseDTO ();
		
		adDTO.setNumero ( uneAdresse.getNumero ());
		adDTO.setRue ( uneAdresse.getRue ());
		adDTO.setVoie ( uneAdresse.getVoie ());
		adDTO.setBatiment ( uneAdresse.getBatiment ());
		adDTO.setCodePostal ( uneAdresse.getCodePostal ());
		adDTO.setVille ( uneAdresse.getVille());
		adDTO.setPays ( uneAdresse.getPays ());
		
		return  adDTO;
	}
	
	
	public static Adresse toAdresse (AdresseDTO uneAdresseDTO) throws HelperException 
	{
		if (uneAdresseDTO==null)throw new HelperException("HelperAdresse : Impossible de traiter dans une adresseDTO null");
		
		Adresse ad = new Adresse ();
		
		ad.setNumero ( uneAdresseDTO.getNumero ());
		ad.setRue ( uneAdresseDTO.getRue ());
		ad.setVoie ( uneAdresseDTO.getVoie ());
		ad.setBatiment ( uneAdresseDTO.getBatiment ());
		ad.setCodePostal ( uneAdresseDTO.getCodePostal ());
		ad.setVille ( uneAdresseDTO.getVille ());
		ad.setPays ( uneAdresseDTO.getPays ());
		
		return  ad;
	}

}
