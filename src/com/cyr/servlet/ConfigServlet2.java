package com.cyr.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class ConfigServlet2 extends HttpServlet {
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	resp.setContentType("text/html");
	PrintWriter out =resp.getWriter();
	ServletConfig config = getServletConfig();

	Enumeration<String> e=config.getInitParameterNames();  
   
    String str="";  
   while(e.hasMoreElements()){  
    str=e.nextElement();  
   out.print("<br>Name: "+str);  
    out.print(" value: "+config.getInitParameter(str));  
   }  
          
  out.close();  
}
}
