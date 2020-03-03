package com.asif.session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Shoes")
public class Shoes extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
	
		PrintWriter pw = response.getWriter();

		pw.write("<HTML><BODY>");

		String name = request.getParameter("name");
		
		HttpSession session = request.getSession();
		session.setAttribute("Name", name);
		
	//	Cookie c1 = new Cookie("Name", name);
	//	response.addCookie(c1);
		
		pw.write("<h2>Welcome" + name +"</h2>");
		
		pw.write("<form action=Jeans >");
		pw.write("Shoes: <input type=text name = shoes> <br>");
		pw.write("<input type=submit value=Next>");
		pw.write("</form>");
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
