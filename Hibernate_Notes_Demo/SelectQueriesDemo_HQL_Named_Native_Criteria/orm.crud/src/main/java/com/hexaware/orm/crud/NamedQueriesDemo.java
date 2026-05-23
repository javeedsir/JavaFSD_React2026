package com.hexaware.orm.crud;

import java.util.List;

import com.hexaware.orm.crud.dao.EmployeeDao;
import com.hexaware.orm.crud.entity.Employee;

public class NamedQueriesDemo {

	public static void main(String[] args) {


		EmployeeDao  dao = new EmployeeDao();
		
		List<Employee>  list = dao.getAllEmployees();
		
			list.stream().forEach((emp)->{System.out.println(emp);});
			
			
			System.out.println("Max Salary is : "+ dao.getMaxSalary());

	}

}
