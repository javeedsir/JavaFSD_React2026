package com.wipro.spring.jdbc.service;

import java.util.List;

import com.wipro.spring.jdbc.exceptions.EmployeeNotFoundException;
import com.wipro.spring.jdbc.pojo.Employee;

public interface IEmployeeService {
	
		
			int  addEmp(Employee emp);
			
			int updateEmployee(Employee emp);
			
			int  deleteByEid(int eid); // throws EmployeeNotFoundException;
			
			Employee      getByEid(int eid) throws EmployeeNotFoundException;
			
			List<Employee>     getAllEmployees();
	
	

}
