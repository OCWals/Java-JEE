<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>
	<%@ include file = "menu.jsp" %>
	<h3>WELCOME ON DAO PAGE :</h3>
    <form method="post" action="dao">
        <p>
            <label for="nom">Nom : </label>
            <input type="text" name="nom" id="nom" />
        </p>
        <p>
            <label for="prenom">Prénom : </label>
            <input type="text" name="prenom" id="prenom" />
        </p>
        <p>
            <label for="age">Age : </label>
            <input type="number" name="age" id="age" />
        </p>
        
        <input type="submit" />
    </form>
    
    <ul>
        <c:forEach var="utilisateurs" items="${utilisateurs}">
            <li><c:out value="${ utilisateur.prenom }" /> <c:out value="${ utilisateur.nom }" /> - <c:out value="${ utilisateur.age }" /> ans</li>
        </c:forEach>
    </ul>
</body>
</html>