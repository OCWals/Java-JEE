package com.OCWals.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Cookies")
public class Cookies extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public Cookies() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Cookie[] cookies = request.getCookies();
		
		if (cookies != null) {
			for (Cookie cookie : cookies) {
				if (cookie.getName().equals("prenom")) {
					request.setAttribute("prenom", cookie.getValue());
				}
			}
		}
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/cookies.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String prenom = request.getParameter("prenom");
		String pseudo = request.getParameter("pseudo");

		Cookie cookiePseudo = new Cookie("pseudo", pseudo);
		Cookie cookiePrenom =  new Cookie("prenom", prenom);
		
		cookiePseudo.setMaxAge(60*60*24*30);
		cookiePrenom.setMaxAge(60*60*24*7);
		
		response.addCookie(cookiePseudo);
		response.addCookie(cookiePrenom);
				
		doGet(request, response);
	}

}
