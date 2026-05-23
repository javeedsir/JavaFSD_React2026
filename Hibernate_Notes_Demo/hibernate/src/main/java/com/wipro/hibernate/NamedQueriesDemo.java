package com.wipro.hibernate;

import java.util.List;

import com.wipro.hibernate.entity.Employee;

public class NamedQueriesDemo {

	public static void main(String[] args) {

		EmployeeDao dao = new EmployeeDao();

		List<Employee> list = dao.getAll();

		list.forEach(System.out::println);
		
		

		List<Employee> list2 = dao.getBySalary();

		list2.forEach(System.out::println);

	}

}
