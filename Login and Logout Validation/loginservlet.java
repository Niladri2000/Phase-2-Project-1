package com.simplilearn.demo;

import java.io.IOException;

import java.io.PrintWriter;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/loginservlet")
public class loginservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out= response.getWriter();
		response.setContentType("text/html");
		
		
		
		
		String name= request.getParameter("name");
		String Password=request.getParameter("password");
		
		if(Password.equals("12345")) {
			out.print("welcome "+name);
			HttpSession session=request.getSession();
			session.setAttribute("name",name);
			request.getRequestDispatcher("link.html").forward(request, response);
		}
		
		
		else
		{ 
			out.print("sorry,username or password error");
			request.getRequestDispatcher("login.html").include(request, response);
			
			
		}
		
		
		 
		
		
		

	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
