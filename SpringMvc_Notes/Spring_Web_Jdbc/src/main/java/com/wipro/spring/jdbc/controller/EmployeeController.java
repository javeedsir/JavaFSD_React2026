package com.wipro.spring.jdbc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wipro.spring.jdbc.pojo.Employee;
import com.wipro.spring.jdbc.service.IEmployeeService;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/api/employees")
public class EmployeeController {
	
			@Autowired
			IEmployeeService service;
			

			@RequestMapping(value="/add" , method = RequestMethod.POST)
			@ResponseBody
			public  String   addEmp(@ModelAttribute  Employee emp) {
				
				
					int count =	service.addEmp(emp);
					
					return   count +" record added to DB";
				
				
			}
	
	
			@RequestMapping(value="/getall" , method=RequestMethod.GET)
			public  String   getAllEmployees(HttpSession session) {
				
				List<Employee>  empList =	service.getAllEmployees();
				
					session.setAttribute("empList", empList);
					
					return "success";
				
			}
	
	
	
	
}
