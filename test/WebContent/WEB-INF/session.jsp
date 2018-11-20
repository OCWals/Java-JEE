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
		<h3>Variables de session :</h3>
		<c:if test="${!empty sessionScope.prenom && !empty sessionScope.pseudo}">
			<p>
				WELCOME ${prenom} (${pseudo}) !
			</p>
		</c:if>
		<form method="post" action="session">
			<input type="text" name="pseudo" id="pseudo" placeholder="Pseudo">
			<input type="text" name="prenom" id="prenom" placeholder="Prenom">
			<input type="submit" value="Créer une nouvelle variable !">
		</form>
		<br>
		<h3>SQL Acces :</h3>
		<c:forEach var="utilisateur" items="${utilisateurs}">
			<li>
				<c:out value="${utilisateur.prenom}"/> (<c:out value="${utilisateur.nom}"/>) - <c:out value="${utilisateur.age}"/> ans.
			</li>
		</c:forEach>
		<p>
			<form method="post" action="session">
				<input type="text" name="nuPrenom" id="nuPrenom" placeholder="Nom">
				<input type="text" name="nuNom" id="nuNom" placeholder="Prenom">
				<input type="number" name="nuAge" id="nuAge" placeholder="Age">
				<input type="submit" value="Nouvel utilisateur !">
			</form>
		</p>
	</body>
</html>