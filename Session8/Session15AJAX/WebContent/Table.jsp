<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<% 
		String number = request.getParameter("number");
	try{
		
		int num = Integer.parseInt(number);
		
		for(int i = 1; i<=10; i++){
			
			out.print(num*i+"<br>");
		}
		
	}catch(Exception e){
		out.print("Enter Correct Number!!! Error!!!");
	}
	%>
</body>
</html>