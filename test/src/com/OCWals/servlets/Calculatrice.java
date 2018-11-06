package com.OCWals.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.OCWals.beans.Calc;


@WebServlet("/Calculatrice")
public class Calculatrice extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Calculatrice() {
        super();
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/WEB-INF/calc.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nb1 = request.getParameter("firstN");
		String nb2 = request.getParameter("secN");
		String operator = request.getParameter("operator");
		
		request.setAttribute("firstN", nb1);
		request.setAttribute("secN", nb2);
		
		Calc calc = new Calc();
		int result = calc.calcul(nb1, nb2, operator);
		
		request.setAttribute("result", result);
		request.setAttribute("operator", operator);
		doGet(request, response);
	}

}
