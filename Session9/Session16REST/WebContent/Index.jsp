<%@page import="javax.ws.rs.core.MediaType"%>
<%@page import="javax.ws.rs.client.WebTarget"%>
<%@page import="javax.ws.rs.core.UriBuilder"%>
<%@page import="javax.ws.rs.client.ClientBuilder"%>
<%@page import="javax.ws.rs.client.Client"%>
<%@page import="org.glassfish.jersey.client.ClientConfig"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	Hey ...Welcome What's wrong with you!!!

	<%
	ClientConfig con = new ClientConfig();

	Client c = ClientBuilder.newClient(con);

	WebTarget target = c.target(UriBuilder.fromUri("http://localhost:8087/ResetDemo"));

	String str = target.path("rest").path("hello").request().accept(MediaType.TEXT_PLAIN).get(String.class);
	String str1 = target.path("rest").path("hello").request().accept(MediaType.APPLICATION_JSON).get(String.class);


	out.print("<br>"+str);
	out.print("<br>"+str1);

%>
</body>
</html>