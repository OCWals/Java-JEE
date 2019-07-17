<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>
	<%@ include file = "menu.jsp" %>
	<h3>WELCOME ON JEE APP :</h3>
	<ul>
		<li>
			${noms[0]}
			<ol>${author.nom} ${author.prenom}</ol>
			<ol>${author.actif ? "Actif" : "Non actif"}</ol>
		</li>
		<li>
			${noms[1]}
		</li>
		<li>
			${noms[2]}
		</li>
	</ul>
</body>
</html>