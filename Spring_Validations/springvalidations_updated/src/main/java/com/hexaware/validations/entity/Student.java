package com.hexaware.validations.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="student_table")
@Data
@NoArgsConstructor
/*
 * @AllArgsConstructor
 * 
 * @Getter
 * 
 * @Setter
 */
public class Student {  // Entity class
	
	@Id
	//@GeneratedValue(strategy = GenerationType.SEQUENCE)
	//@SequenceGenerator(name = "my_student_seq")
	//@GeneratedValue(strategy = GenerationType.TABLE)
	
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long  studentId;
	
	private  String studentName;
	
	private  String course;
	
	private  LocalDate  dob;
	
	private   String email;
	
	private   double  fee;

	private    String  collegeName;
	
}
