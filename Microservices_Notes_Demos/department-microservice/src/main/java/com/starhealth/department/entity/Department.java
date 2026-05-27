package com.starhealth.department.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString

@Data

@Entity
public class Department {
	
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long  departmentId;
	private String departmentName;
	private String departmentAddress;
	private String departmentCode;
	

}
