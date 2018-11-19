<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Session</title>
	</head>
	<body>
		<%@ include file = "menu.jsp" %>
		
		<c:if test="${!empty sessionScope.prenom && !empty sessionScope.pseudo}">
			<p>
				WELCOME ${prenom} (${pseudo}) !
			</p>
		</c:if>
		
		<form method="post" action="session">
			<p>
				<label for="pseudo">Pseudo :</label>
				<input type="text" name="pseudo" id="pseudo">
			</p>
			<p>
				<label for="prenom">Prenom :</label>
				<input type="text" name="prenom" id="prenom">
			</p>
			<input type="submit" value="Go !">
		</form>
	</body>
</html>