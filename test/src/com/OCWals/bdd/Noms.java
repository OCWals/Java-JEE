package com.OCWals.bdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

import com.OCWals.beans.Utilisateur;

public class Noms {
	
	private Connection connexion;
	
	public List<Utilisateur> recupUsers() {
		List<Utilisateur> users = new ArrayList<Utilisateur>();
		
		loadDatabase();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("ERROR - Classe introuvable.");
		}
		
		Connection connexion = null;
		Statement statement = null;
		ResultSet result = null;
		
		try {
			connexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_ee", "root", "root");
			statement = connexion.createStatement();
			
			result = statement.executeQuery("SELECT nom, prenom, age FROM noms;");
		
			while (result.next()) {
				String nom = result.getString("nom");
				String prenom = result.getString("prenom");
				int age = result.getInt("age");
				
				Utilisateur userX = new Utilisateur();
				userX.setNom(nom);
				userX.setPrenom(prenom);
				userX.setAge(age);
				
				users.add(userX);
			}
		} catch (SQLException e) {
			System.out.println("ERROR - Le SQL a mal tourné.");
		} finally {
			try {
				if (result != null)
					result.close();
				if (statement != null)
					result.close();
				if (connexion != null)
					result.close();
			} catch (SQLException ignore) {
			}
			return users;
		}
	}
	
	private void loadDatabase() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
		}
		
		try {
			connexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_ee", "root", "root");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void addUser(Utilisateur user) {
		loadDatabase();
		try {
			PreparedStatement preparedStatement = connexion.prepareStatement("INSERT INTO noms (nom, prenom, age) VALUES (?, ?, ?);");
			preparedStatement.setString(1, user.getNom());
			preparedStatement.setString(2, user.getPrenom());
			preparedStatement.setInt(3, user.getAge());
			
			preparedStatement.executeUpdate();
		} catch (Exception e) {
			System.out.println("ERROR PREPARED STATEMENT !");
			e.printStackTrace();
		}
	}
}