package com.OCWals.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.OCWals.beans.Utilisateur;
import com.OCWals.dao.DaoFactory;
import com.OCWals.dao.UtilisateurDao;

@WebServlet("/DAOTest")
public class DAOTest extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UtilisateurDao utilisateurDao;
	
    public void init() throws ServletException {
        DaoFactory daoFactory = DaoFactory.getInstance();
        this.utilisateurDao = daoFactory.getUtilisateurDao();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("utilisateurs", utilisateurDao.lister());
		this.getServletContext().getRequestDispatcher("/WEB-INF/dao.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Utilisateur utilisateur = new Utilisateur();
		utilisateur.setNom(request.getParameter("nom"));
		utilisateur.setPrenom(request.getParameter("prenom"));		
		utilisateur.setAge(Integer.parseInt(request.getParameter("age")));
		
		utilisateurDao.ajouter(utilisateur);
		
		request.setAttribute("utilisateurs", utilisateurDao.lister());
		doGet(request, response);
	}

}
