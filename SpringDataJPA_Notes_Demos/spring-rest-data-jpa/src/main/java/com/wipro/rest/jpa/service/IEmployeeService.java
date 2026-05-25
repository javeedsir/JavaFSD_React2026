package com.wipro.rest.jpa.service;

import java.util.List;

import com.wipro.rest.jpa.entity.Employee;

public interface IEmployeeService {
	
	
		public  Employee  addEmployee(Employee emp);
		public  Employee  updateEmployee(Employee emp);
		
		
		public    Employee   getByEid(int eid);
		public   void    deleteByEid(int eid);
		
		
		public  List<Employee>    getAllEmployees();
		
		
	

}
