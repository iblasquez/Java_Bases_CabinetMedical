package com.iut.cabinet.metier;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;

public class AdresseDAOJDBC {

	 private static final String reqAllAdresses = "select * from Adresse;";
	 private static final String reqFindAdresseByPk = "select * from Adresse where idAdresse = ?;";
	 private static final String reqInsertAdresse = "insert into Adresse (numero,rue,voie,batiment,codePostal,ville,pays,idPersonne) values (?,?,?,?,?,?,?,?);";
	 private static final String reqUpdateAdresse = "update  Adresse set numero =?,rue=?,voie=?,batiment=?,codePostal=?,ville=?,pays=?,idPersonne=? where idPersonne= ? and idAdresse=?;";
	 private static final  String reqFindAdresseByIdPersonne = "select * from Adresse where idPersonne = ?;";
	    
	
	public static boolean deleteAdresse(int idAdresse, Connection c) {
		// TODO Auto-generated method stub
		return false;
	}

	public static boolean existAdresse(Personne uneAdresse, Connection c) {
		// TODO Auto-generated method stub
		return false;
	}

	public static Collection<Adresse> findAllAdresse(Connection c) {
		// TODO Auto-generated method stub
		return null;
	}

	public static int storeAdresse(Adresse uneAdresse, Connection c) {
		// TODO Auto-generated method stub
		return 0;
	}

	public static boolean storeAllAdresses(Collection<Adresse> uneListe, Connection c) {
		// TODO Auto-generated method stub
		return false;
	}
	
	public static Adresse findAdresseByIdPersonne(Integer idPersonne, Connection c) throws CabinetTechniqueException 
	{
	    Adresse a = new Adresse();
	    PreparedStatement pst = null;
	    ResultSet rs = null;    
	    try{                
	        pst = c.prepareStatement(reqFindAdresseByIdPersonne);    
	        pst.setInt(1,idPersonne.intValue());
	        rs = pst.executeQuery();                
	        if (rs.next()){
	            a  = new Adresse(
	            rs.getString("numero"),
	            rs.getString("rue"),
	            rs.getString("voie"),
	            rs.getString("batiment"),
	            rs.getString("codePostal"),
	            rs.getString("ville"),
	            rs.getString("pays") );                    
	        a.setIdAdresse(new Integer(rs.getInt("idAdresse")));
	                
	        }
	    }catch(SQLException sqle){
	        System.out.println("sql");
	        sqle.printStackTrace();
	        throw new CabinetTechniqueException("Pb dans findAdresseByIdPersonne : "+ sqle.getMessage());
		}catch(Exception e){
	        System.out.println("e");
	        e.printStackTrace();
	        throw new CabinetTechniqueException("Pb dans findAdresseByIdPersonne : "+ e.getMessage());
	       }
	    
	    finally{
	        try {
	        if (rs!=null)   {   rs.close();}
	        if (pst!=null)    {  pst.close();}
	           }catch (Exception e){
	            e.printStackTrace();
	        }
	    }
	    return a;
	}

}
