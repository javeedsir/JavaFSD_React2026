package com.hexaware.validations.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.validations.dto.StudentDto;
import com.hexaware.validations.entity.Student;
import com.hexaware.validations.service.IStudentService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/students")
public class StudentRestController {

	
		@Autowired
		IStudentService service;
	
	
			@PostMapping("/add")
		  public Student  addStudent(@RequestBody  @Valid StudentDto dto) {
			  
				return service.addStudent(dto);
			  
		  }
		
			@GetMapping("/getbyid/{sid}")
	 public   Student   getBySid(@PathVariable  long sid) {
		 
		 
				return service.getBySid(sid);
				
	 }		
			
			
			@GetMapping("/getall")
			public List<Student>   getAll(){
				
				
				return service.getAllStudent();
				
			}
			
			
			
			
	
}
