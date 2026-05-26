package com.hexaware.validations.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="student_table")
@Data
@NoArgsConstructor
public class Student {  // Entity class
	
	@Id
	private long  studentId;
	
	private  String studentName;
	
	private  String course;
	
	private  LocalDate  dob;
	
	private   String email;
	
	private   double  fee;

	private    String  collegeName;
	
}
