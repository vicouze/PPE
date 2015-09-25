package Authentification;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class Connexion_BDD {
	
	private static Connection connection;
	
	public static void connection(){
		try{
			Class.forName("org.postgresql.Driver");
			System.out.println("Driver Ok");

			String url = "jdbc:postgresql://localhost:5432/BDD_FRANCESTADIUM";
			String user = "postgres";
			String passwd = "test";

			connection = DriverManager.getConnection(url, user, passwd);
			
			// Cr�ation d'un objet Statement
			Statement state = connection.createStatement();
			//L'objet ResultSet contient le r�sultat de la requ�te SQL
		    ResultSet result = state.executeQuery("SELECT * FROM users");
		    //On r�cup�re les MetaData
		    ResultSetMetaData resultMeta = result.getMetaData();
		    
		    result.close();
		    state.close();
			

		} catch (Exception e){
			e.printStackTrace();
		}
	}

	public static Connection getConnection() {
		return connection;
	}

	public static void setConnection(Connection connection) {
		Connexion_BDD.connection = connection;
	}
}

