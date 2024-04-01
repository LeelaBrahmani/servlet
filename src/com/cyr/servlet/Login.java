package com.cyr.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/Servlet1")
public class Login extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("text/html");	
	PrintWriter out = response.getWriter();
	String n = req.getParameter("username");
	String p = req.getParameter("userpass");
	if(p.equals("Servlet")){
		RequestDispatcher rd = req.getRequestDispatcher("Servlet2");
		rd.forward(req, response);
	}
	else{
		out.println("Sorry username password Error");
		RequestDispatcher rd = req.getRequestDispatcher("/index.html");
		rd.include(req, response);
	}

}
}