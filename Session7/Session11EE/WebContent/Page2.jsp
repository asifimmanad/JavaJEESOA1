<%@page import="com.asif.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%@ include file="Header.html"%>
	
	<jsp:include page="Header.html"/>
	<%
		
		String name = pageContext.getAttribute("name", PageContext.SESSION_SCOPE).toString();
		out.print("<h1> Welcome: " + name + "</h1>");
		
		Student s = new Student();
		
		s.setName("Vijay");
		s.setRoll(999);
	%>
	
	<%= s.getName() + s.getRoll() %>
		
		<jsp:useBean id="st" class="com.asif.Student"/>
		<jsp:setProperty property="roll" name="st" value="987"/>
		<jsp:setProperty property="name" name="st" value="Ashwini"/>
		

		<jsp:getProperty property="roll" name="st"/>
		<jsp:getProperty property="name" name="st"/>

	<%@ include file="Footer.html"%>
</body>
</html>