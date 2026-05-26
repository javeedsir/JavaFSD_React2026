package com.hexaware.validations.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.validations.dto.StudentDto;
import com.hexaware.validations.entity.Student;
import com.hexaware.validations.repository.StudentRepository;
@Service
public class StudentServiceImp implements IStudentService {
	
	@Autowired
	StudentRepository repo;

	@Override
	public Student addStudent(StudentDto dto) {
		
		Student student = new Student();
		
			student.setStudentId(dto.getStudentId());
			student.setStudentName(dto.getStudentName());
			student.setCourse(dto.getCourse());
			student.setDob(dto.getDob());
			student.setEmail(dto.getEmail());
			student.setFee(dto.getFee());
			student.setCollegeName(dto.getCollegeName());
			
	
		return repo.save(student);
	}

	@Override
	public List<Student> getAllStudent() {
		
		return repo.findAll();
	}

	@Override
	public Student getBySid(long studentId) {
		
		return repo.findById(studentId).orElse(null);
	}

}
