package com.hexaware.springdatajpa.mappings.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.springdatajpa.mappings.entities.Student;
import com.hexaware.springdatajpa.mappings.repository.StudentRepository;

@RestController
@RequestMapping("/api/students")
public class StudentRestController {
	
		@Autowired
		StudentRepository studentRepo;
	
	
		@PostMapping("/insert")
		public Student  insertStudent(@RequestBody Student student) {
			
			return  studentRepo.save(student);
			
		}
		
		@GetMapping("/getall")
		public List<Student>  getAllStudents(){
			
			
			return studentRepo.findAll();
			
		}
		
	

}
