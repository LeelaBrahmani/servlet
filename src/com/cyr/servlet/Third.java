package com.cyr.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Third extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse res) 
	throws ServletException,IOException  
	{ 
	res.setContentType("text/html");
	PrintWriter pw =res.getWriter();
	pw.println("<html><body>");
	pw.println("Welcome http servlet");
	pw.println("</body></html>");
	pw.close();
}
}