package com.hexaware.validations.service;

import java.util.List;

import com.hexaware.validations.dto.StudentDto;
import com.hexaware.validations.entity.Student;

public interface IStudentService {
	
	
	
	public  Student   addStudent(StudentDto dto);
	
	public  Student  getBySid(long studentId);
	
	public  List<Student>   getAllStudent();

}
