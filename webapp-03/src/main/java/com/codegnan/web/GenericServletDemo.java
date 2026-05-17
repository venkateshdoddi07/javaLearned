package com.codegnan.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;


@WebServlet("/generic")
public class GenericServletDemo extends GenericServlet {
	
	private static final long serialVersionUID = 1L;

	
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<h1 style='color:red' align='center'>");
		out.println("hi this is the generic servlet program</h1>");
		
		out.println("</body>");
		
		out.println("</html>");
		
	}

}
