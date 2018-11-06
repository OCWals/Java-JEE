package com.OCWals.beans;

public class Calc {
	
	private String nb1;
	private String nb2;
	private String operator;
	
	
	public String getNb1() {
		return nb1;
	}
	public void setNb1(String nb1) {
		this.nb1 = nb1;
	}
	public String getNb2() {
		return nb2;
	}
	public void setNb2(String nb2) {
		this.nb2 = nb2;
	}
	public String getOperator() {
		return operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}
	
	public int calcul(String nb1, String nb2, String operator) {
		int x = Integer.parseInt(nb1);
		int y = Integer.parseInt(nb2);
		int result = 0;
		
		switch (operator) {
			case "+":
				result = x+y;
				break;
			case "-":
				result = x-y;
				break;
			case "x":
				result = x*y;
				break;
			case "/":
				result = x/y;
				break;
			default:
				result = 999;
		}
		
		return result;
	}
}
