package com.wipro.web;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class SecondServlet
 */
@WebServlet("/SecondServlet")
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public SecondServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();

		response.setContentType("text/html");

		out.print("Welcome to Second Servlet");
		
		
			out.print("request : "+  request.getAttribute("uname"));
			
			out.print("<br>");
			
			HttpSession session = request.getSession();
			
			
			out.print("session: "+ session.getAttribute("pwd"));
			
			
			ServletContext application = getServletContext();
			
			out.print("application "+ application.getAttribute("city"));
			
			
				request.removeAttribute("uname");
				
			
			
			
			RequestDispatcher rd =		request.getRequestDispatcher("success.jsp");
			
			rd.include(request, response);
			
			
			
			
			
				
			
			
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
