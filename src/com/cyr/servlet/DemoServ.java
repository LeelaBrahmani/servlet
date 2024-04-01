package com.cyr.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/my")
public class DemoServ extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse res) 
	throws ServletException,IOException{
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
		String name =req.getParameter("name");
		pw.println("welcome"+name);
		pw.close();
		
		
	}

}
