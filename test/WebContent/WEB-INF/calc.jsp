<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
	<meta charset="ISO-8859-1">
	<title>Calculatrice</title>
	</head>
	<body>
		<%@ include file = "menu.jsp" %>
		<h3>
			Calculatrice :
		</h3>
		<form method="POST" action="/test/calc">
			<input type="number" name="firstN" value="${empty firstN ? '' : firstN}">
			<select name="operator" id="operator">
				<option value="+" ${!(operator=='+') ? '' : "selected='selected'"}>+</option>
				<option value="-" ${!(operator=='-') ? '' : "selected='selected'"}>-</option>
				<option value="x" ${!(operator=='x') ? '' : "selected='selected'"}>x</option>
				<option value="/" ${!(operator=='/') ? '' : "selected='selected'"}>/</option>
			</select>
			<input type="number" name="secN" value="${empty secN ? '' : secN}">
			<input type="submit" value="Resultat !">
		</form>
		<p>
			Resultat : 
			${empty firstN ? '' : firstN}
			${empty operator ? '' : operator}
			${empty secN ? '' : secN}
			${empty operator ? '' : ' = '}
			${empty result ? '' : result}
		<p>
	</body>
</html>