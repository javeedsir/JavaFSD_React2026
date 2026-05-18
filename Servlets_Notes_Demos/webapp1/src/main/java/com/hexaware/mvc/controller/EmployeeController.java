package com.hexaware.mvc.controller;

import java.io.IOException;
import java.io.PrintWriter;

import com.hexaware.mvc.pojo.Employee;
import com.hexaware.mvc.service.EmployeeServiceImp;
import com.hexaware.mvc.service.IEmployeeService;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EmployeeController
 */
@WebServlet("/EmployeeController")
public class EmployeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	IEmployeeService  service = new EmployeeServiceImp();
	
	
	

    /**
     * Default constructor. 
     */
    public EmployeeController() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		PrintWriter  out =	response.getWriter();
		
		response.setContentType("text/html");
	
				
		out.print("<h1>Welcome to Employee Controller</h1>");
		
		
			int eid  =  Integer.parseInt(request.getParameter("eid"));  // "101"
			
			String  ename =	request.getParameter("ename");
			
			double salary  = Double.parseDouble(request.getParameter("salary"));
			
			
			Employee  emp = new Employee(eid, ename, salary);
			
			
			out.print("<br>");
			out.print(eid +"  "+  ename + "  "+salary);
			out.print("<br>");
			out.print(emp);
				
				// service.addEmp(emp); ---> // dao.addEmp(emp); ---> jdbc code ---> database table
		
		int count =	service.addEmployee(emp);
		
			out.print("<br>"+count +"Record  inserted..");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
