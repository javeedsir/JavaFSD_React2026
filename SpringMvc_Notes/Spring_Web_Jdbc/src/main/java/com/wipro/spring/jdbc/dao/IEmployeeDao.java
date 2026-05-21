package com.wipro.spring.jdbc.dao;

import java.util.List;

import com.wipro.spring.jdbc.pojo.Employee;

public interface IEmployeeDao {

	int addEmp(Employee emp);

	int updateEmployee(Employee emp);

	int deleteByEid(int eid);

	Employee getByEid(int eid);

	List<Employee> getAllEmployees();

}
