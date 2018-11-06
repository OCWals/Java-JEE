package com.OCWals.forms;

import javax.servlet.http.HttpServletRequest;

public class Coform {
	private String result;

	public void verifCo (HttpServletRequest request) {
		String pseudo = request.getParameter("pseudo");
		String pass = request.getParameter("pass");
		
		if (pass.equals(pseudo + "123")) {
			this.result = "GOOD, WELCOME !";
		} else {
			this.result = "WRONG PASSWORD !";
		}
	}
	
	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}
}
