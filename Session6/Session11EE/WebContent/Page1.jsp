<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ page import="java.util.*" errorPage="error.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ include file="Header.html" %>
	<%
		int result, a = 10, b = 2;

		result = a / b;
		
		Date d = new Date();

		String name = request.getParameter("name");
		out.print("<h1> Welcome: " + name + "</h1> <br>");
		out.print("<h2> Today's Date is:" + d + "</h2> <br>");
		out.print("<h2> Result is:" + result + "</h2> <br>");

		pageContext.setAttribute("name", name, PageContext.SESSION_SCOPE);
	%>
	<br>
	<h2>
	${param.name}
	<h2>
	<br>
	<a href="Page2.jsp"> Next Page</a>
	
<%@ include file="Footer.html" %>
</body>
</html>