package com.wipro.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.wipro.springmvc.bean.Employee;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/api/employees")
public class EmployeeController {
	
		
		@RequestMapping(value="/hello", method=RequestMethod.GET)
		public  String  hello() {
			
			return  "hello";
			
		}
		
		@RequestMapping(value="/add", method=RequestMethod.POST)
		public String  addEmp(@ModelAttribute  Employee emp , HttpSession session) {
			
				session.setAttribute("emp", emp);
				
				
				return  "success";   
			
			
		}
		
	
		
	
	

}
