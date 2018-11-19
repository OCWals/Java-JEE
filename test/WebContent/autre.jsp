<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Session</title>
	</head>
	<body>
		<%@ include file = "WEB-INF/menu.jsp" %>
		<p>Vous être sur une autre page :</p>
		<c:if test="${!empty sessionScope.prenom && !empty sessionScope.pseudo}">
			<p>
				WELCOME ${prenom} (${pseudo}) !
			</p>
		</c:if>	
	</body>
</html>