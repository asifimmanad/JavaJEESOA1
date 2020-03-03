package com.asif;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		
		
		PrintWriter pw = response.getWriter();

		pw.write("<HTML><BODY>");

		String name = "sayani"; // assume retrived from DB

		String pass = "sayani123"; // assume retrived from DB

		String nameHtml = request.getParameter("name");
		String passHtml = request.getParameter("pass");

		if (name.equals(nameHtml) && pass.equals(passHtml)) {

			RequestDispatcher rd = request.getRequestDispatcher("welcome");
			rd.forward(request, response);
			
		} else {
			pw.write("<h2>Username/Password in invalid</h2> <br>");
			//RequestDispatcher rd = request.getRequestDispatcher("Login.html");
			//rd.include(request, response);
			
			response.sendRedirect("http://www.amazon.in");
			
		}

		pw.write("</HTML></BODY>");
	}

}
