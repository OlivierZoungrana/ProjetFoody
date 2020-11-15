package connect_BDD;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import bDD_foody.Employe;


public class BDD {
	
	public List<Employe> recupererEmployes(){
		List<Employe>  employes = new ArrayList<Employe>();
		
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
		}catch (ClassNotFoundException e) {
			
			
		}
		
		Connection connexion = null;
		Statement statement = null;
		ResultSet resultat = null;
		
		try {
			
			connexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/Foody", "root", "Amour1988");
			
			statement = connexion.createStatement();
			resultat = statement.executeQuery("select nom, prenom from Employe;");
			
			while (resultat.next()) {
				
				String nom= resultat.getString("Nom");
				String prenom = resultat.getString("prenom");
				
				Employe employe = new Employe();
				employe.setNom(nom);
				employe.setNom(prenom);
				
				employes.add(employe);
				
			}
		} catch(SQLException e) {
			
		} finally {
			
			try {
				
				if(resultat!=null)
					resultat.close();
				if (statement!=null)
					statement.close();
				if(connexion!=null)
					connexion.close();
			} catch (SQLException ignore) {
				
			}
		}
		return employes;
	}
	

}
	
}
