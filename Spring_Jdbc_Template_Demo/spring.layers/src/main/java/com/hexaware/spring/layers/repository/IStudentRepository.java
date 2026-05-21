package com.hexaware.spring.layers.repository;

import java.util.List;

import com.hexaware.spring.layers.beans.Student;

public interface IStudentRepository {
	

	public  int   addStudent(Student student);

	
	public  List<Student>  getAllStudents();
}
