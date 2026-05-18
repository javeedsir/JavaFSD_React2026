package com.hexaware.mvc.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import com.hexaware.mvc.pojo.Employee;
import com.hexaware.mvc.service.EmployeeServiceImp;
import com.hexaware.mvc.service.IEmployeeService;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class DisplayController
 */
@WebServlet("/DisplayController")
public class DisplayController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	IEmployeeService  service = new EmployeeServiceImp();
	
	/**
	 * Default constructor.
	 */
	public DisplayController() {

	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter out = response.getWriter();

		response.setContentType("text/html");
		
				out.print("<h1>Welcome to DisplayController</h1> <br>");
		
				
			List<Employee>  list =	service.displayAllEmployees();
			
			
			//out.print(list);
			
				HttpSession session =	request.getSession();
				
						session.setAttribute("empList",list);
				
			
			RequestDispatcher rd =		request.getRequestDispatcher("/views/displayAll.jsp");
			
					rd.forward(request, response);
			
					//rd.include(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
