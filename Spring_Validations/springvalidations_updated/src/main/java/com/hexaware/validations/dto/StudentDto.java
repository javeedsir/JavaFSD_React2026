package com.hexaware.validations.dto;

import java.time.LocalDate;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data  // lombok @Data annotation to add setters,getters ,toString and constructors
public class StudentDto {   // DTO or VO  or POJO
	
	
	
	//@Min(value = 101)
	//@Max(value = 999)
	private long  studentId;
	
	
	@NotNull
	@NotBlank
	private  String studentName;
	
	@Size(min = 4 , max = 10)
	private  String course;
	
	@PastOrPresent(message = "Start date must be in the present or past date")
	private  LocalDate  dob;
	
	@Email
	private   String email;
	
	@Min(5000)
	private   double  fee;
	
	@Pattern(regexp = "[A-Z][a-z]{4,10}" )
	private    String  collegeName;


}
