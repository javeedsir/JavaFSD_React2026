package com.wipro.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wipro.springboot.bean.Employee;

@Controller
@RequestMapping("/employees")
public class EmployeeController {
	
	@Autowired
	Employee emp;
	
		@RequestMapping("/hello")
		@ResponseBody
		public String  sayHello() {
			
			return "Hello friends "+emp;
			
		}
	
	

}
