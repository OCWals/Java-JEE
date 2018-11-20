package com.OCWals.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.OCWals.bdd.Noms;
import com.OCWals.beans.Utilisateur;

@WebServlet("/Session")
public class Session extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Session() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Noms tableNoms = new Noms();
		request.setAttribute("utilisateurs", tableNoms.recupUsers());
		this.getServletContext().getRequestDispatcher("/WEB-INF/session.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pseudo = request.getParameter("pseudo");
		String prenom = request.getParameter("prenom");
		
		HttpSession session = request.getSession();
		session.setAttribute("pseudo", pseudo);
		session.setAttribute("prenom", prenom);
				
		int age = Integer.parseInt(request.getParameter("nuAge"));
		Utilisateur user = new Utilisateur();
		user.setPrenom(request.getParameter("nuPrenom"));
		user.setNom(request.getParameter("nuNom"));
		user.setAge(age);
		
		Noms tableNoms = new Noms();
		tableNoms.addUser(user);
		request.setAttribute("utilisateurs", tableNoms.recupUsers());
		
		
		doGet(request, response);
	}
}