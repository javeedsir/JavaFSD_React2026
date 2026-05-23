package com.hexaware.mappings.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Department {

	@Id
	private int departmentId;
	private String departmentName;
	
	
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "department")
	
	private  Set<Emp>  employees = new HashSet<Emp>();
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
	public Set<Emp> getEmployees() {
		return employees;
	}
	public void setEmployees(Set<Emp> employees) {
		this.employees = employees;
	}
	
	
	
public void   addEmployee(Emp emp) { // dept1.addEmployee(e1)
		
		emp.setDepartment(this);
// this means current dept obj where employee obj register
				
				
			Set<Emp>  set = getEmployees();
			
				set.add(emp);
				
				
	}
	
	
			
	
}
