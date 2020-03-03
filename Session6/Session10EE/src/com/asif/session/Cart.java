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
 * Servlet implementation class Cart
 */
@WebServlet("/Cart")
public class Cart extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw = response.getWriter();

		pw.write("<HTML><BODY>");

	//	String name = request.getParameter("name");
	//	String shoes = request.getParameter("shoes");
		String jeans = request.getParameter("jeans");
		String shoes = null;
		String name = null;
//		Cookie c[] = request.getCookies();
		
//		for (Cookie cookie : c) {
//			if(cookie.getName().equals("Shoes")) {
//				shoes = cookie.getValue();
//			}
//			if(cookie.getName().equals("Name")) {
//				name = cookie.getValue();
//			}
//		}
		HttpSession session = request.getSession();
		
		name = session.getAttribute("Name").toString();
		
		shoes = session.getAttribute("Shoes").toString();
		
		pw.write("<h2>Welcome" + name +"</h2>");
		pw.write("Items in your Cart: <br>");
		pw.write("Jeans Session: "+ jeans +"<br>");
		pw.write("Shoes Session: "+ shoes +"<br>");
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
