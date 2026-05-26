package com.hexaware.springdatajpa.mappings.entities;

import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Department {
	
	@Id
	private int departmentId;
	private String departmentName;
	
	
	@JsonManagedReference
	@OneToMany(cascade = CascadeType.ALL , mappedBy = "department")
	//@JoinColumn(name="dno")   // dno is FK in Employee child table
	private  Set<Employee>  employeeSet = new HashSet<Employee>();  
	                     // collections types should be initialize always to avoid NullPointExp

	
	public Department() {
		
		
	}
	
	
	public Department(int departmentId, String departmentName, Set<Employee> employeeSet) {
		super();
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.employeeSet = employeeSet;
	}

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public Set<Employee> getEmployeeSet() {
		return employeeSet;
	}

	public void setEmployeeSet(Set<Employee> employeeSet) {
		this.employeeSet = employeeSet;
	}

	
	public void   addEmployee(Employee emp) { // dept1.addEmployee(e1)
		
		emp.setDepartment(this);// this means current dept obj where employee obj register
				
				
			Set<Employee>  set = getEmployeeSet();
			
				set.add(emp);
				
				
	}
	
	
	
	
	
	
}
