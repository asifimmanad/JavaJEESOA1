<%@page import="java.io.PrintWriter"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	
	<form action="Page1.jsp">
	
		UserName: <input type="text" name="name"> <br><br>
		<!-- Enter 1st Number: <input type="text" name="a"> <br><br>
		Enter 2nd Number: <input type="text" name="b"> <br><br> -->
		
		Addition: <input type="submit" value="ADD"> <br><br>
	</form>

		<%-- <%!int sum = 0;

		int add(int a, int b) {
			sum = a + b;
			return a + b;
		}
	
		%>

		<%
			
			if(request.getParameter("a")!=null){
				int a = Integer.parseInt(request.getParameter("a"));
				int b = Integer.parseInt(request.getParameter("b"));
				sum = add(a,b);
				out.print("Hello From JSP"+sum);
			}
			
		%>
	<br>
	<br>
		<%="This statement is in expression tag" + sum%> --%>
	
</body>
</html>