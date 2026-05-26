package com.hexaware.springdatajpa.mappings.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.springdatajpa.mappings.entities.Department;
import com.hexaware.springdatajpa.mappings.repository.DepartmentRepository;

@RestController
@RequestMapping("/api/department")
public class DeptRestController {
	
		
		@Autowired
		DepartmentRepository deptRepo;
	
	
		@PostMapping("/insert")
		public Department   insertDept(@RequestBody  Department dept) {
			
			return deptRepo.save(dept);
			
		}
		
		@GetMapping("/getall")
		public List<Department>  getAll(){
			
			 return deptRepo.findAll();
			
		}
		
		
		
	
	

}
