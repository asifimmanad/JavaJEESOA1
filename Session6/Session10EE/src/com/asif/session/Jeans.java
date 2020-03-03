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

/**
 * Servlet implementation class Jeans
 */
@WebServlet("/Jeans")
public class Jeans extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter pw = response.getWriter();

		pw.write("<HTML><BODY>");
//		Cookie c[] = request.getCookies();
		
		String name = null;

//		for (Cookie cookie : c) {
			
//			if(cookie.getName().equals("Name")) {
//				name = cookie.getValue();
//			}
//		}
		
		
		
		
		pw.write("<h2>Welcome" + name +"</h2>");

		String shoe= request.getParameter("shoes");
		
//		Cookie c1 = new Cookie("Shoes", shoe);
//		response.addCookie(c1);
		HttpSession session = request.getSession();
		session.setAttribute("Shoes", shoe);
		
		
		pw.write("<form action=Cart >");
		pw.write("Jeans: <input type=text name = jeans> <br>");
		pw.write("<input type=submit value=Next>");
		pw.write("</form>");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
