package com.wipro.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wipro.springboot.bean.Employee;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

	@Autowired
	Employee emp;

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	@ResponseBody
	public String sayHello() {

		return "Hello friends " + emp;

	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	@ResponseBody
	public String addEmp(HttpServletRequest request, HttpServletResponse response, HttpSession session) {

		int eid = Integer.parseInt(request.getParameter("eid"));
		String ename = request.getParameter("ename");
		double salary = Double.parseDouble(request.getParameter("salary"));

		Employee emp = new Employee(eid, ename, salary);

		session.setAttribute("emp", emp);

		System.out.println("Session obj " + session.getAttribute("emp"));

		return "Employee Add " + emp;

	}

	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	@ResponseBody
	public String insertEmployee(@ModelAttribute Employee emp, HttpSession session) {

		return "Employee Added " + emp;

	}


}
