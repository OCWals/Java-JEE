<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Première page JSP</title>
</head>
<body>
	<%@ include file = "menu.jsp" %>
	<p>
		<c:out value="Holaaa ${empty name ? '' : name } !" />
	</p>
	
	<p>
		<form method="POST" action="bonjour">
			<label for="name">Nom :</label>
			<input type="text" id="name" name="name" placeholder="${empty name ? '' : name}">
			<input type="submit" value="Go !">
		</form>
	</p>
	
	<p>
		<%
			String variable = (String) request.getAttribute("message");
			for (int i = 5; i<16; i++) {
				if (i<10) {
					out.println("0" + i + ". " + variable + "<br>");
				} else {
					out.println(i + ". " + variable + "<br>");
				}
			}
		%>
	</p>
</body>
</html>