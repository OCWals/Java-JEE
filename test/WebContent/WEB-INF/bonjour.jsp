<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Première page JSP</title>
</head>
<body>
	<%@ include file = "menu.jsp" %>
	<p>
		Holaaa ${empty name ? '' : name } !
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