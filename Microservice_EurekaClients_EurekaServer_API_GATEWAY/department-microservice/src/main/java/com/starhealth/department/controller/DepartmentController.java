package com.starhealth.department.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.starhealth.department.entity.Department;
import com.starhealth.department.service.IDepartmentService;

@RestController
@RequestMapping("/api/department")
public class DepartmentController {

	@Autowired
	IDepartmentService service;

	@PostMapping("/add")
	public Department addDepartment(@RequestBody Department dept) {

		return service.addDepartment(dept);

	}

	@GetMapping("/get/{id}")
	public Department getDeptById(@PathVariable  Long id) {

		
			return service.getDeptById(id);
		
	}

}
