<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>
	<%@ include file = "menu.jsp" %>
	<p>
		WELCOME ON JEE APP :
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
	</p>
</body>
</html>