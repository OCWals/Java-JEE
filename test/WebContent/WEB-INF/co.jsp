<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
	<meta charset="ISO-8859-1">
	<title>Connexion</title>
	</head>
	<body>
		<%@ include file = "menu.jsp" %>
		
		<form method="POST" action="co">
			<label for="pseudo">Pseudo : </label>
			<input type="text" id="pseudo" name="pseudo">
			<label for="pass">Password : </label>
			<input type="password" id=pass" name="pass">
			<br>
			<input type="submit" value="Go !">
		</form>
		<p>
			<c:if test="${result}">
				<c:out value="${result}" />
			</c:if>
			${empty result ? "VIDE" : result }
		</p>
	</body>
</html>