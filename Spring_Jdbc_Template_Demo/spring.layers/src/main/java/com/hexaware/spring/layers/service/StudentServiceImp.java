package com.hexaware.spring.layers.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.spring.layers.beans.Student;
import com.hexaware.spring.layers.repository.IStudentRepository;

@Service
public class StudentServiceImp implements IStudentService {

	IStudentRepository repo;

	@Autowired
	public StudentServiceImp(IStudentRepository repo) {
		super();
		this.repo = repo;
	}

	@Override
	public int addStudent(Student student) {
		
			System.out.println("From Service ,  Student record process by Service Layer");

			return repo.addStudent(student);

	}

	@Override
	public List<Student> getAllStudents() {
		
		return repo.getAllStudents();
	}

}
