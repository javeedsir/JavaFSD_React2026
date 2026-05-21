package com.hexaware.spring.layers.service;

import java.util.List;

import com.hexaware.spring.layers.beans.Student;

public interface IStudentService {
	
	
		public  int   addStudent(Student student);
		
		// Below 3 methods assignment
		
		//public  int   updateStudent(Student student);
		
		//public  Student   getStudentById(int sid);
		
		//public int  deleteStudentById(int sid);
		
		public  List<Student>  getAllStudents();
		
		

}
