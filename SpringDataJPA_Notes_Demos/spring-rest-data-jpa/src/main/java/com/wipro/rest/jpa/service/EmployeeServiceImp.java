package com.wipro.rest.jpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.rest.jpa.entity.Employee;
import com.wipro.rest.jpa.repository.EmployeeRepository;

@Service
public class EmployeeServiceImp implements IEmployeeService {

	@Autowired
	EmployeeRepository repo;

	@Override
	public Employee addEmployee(Employee emp) {
		return repo.save(emp);
	}

	@Override
	public Employee updateEmployee(Employee emp) {
		return repo.save(emp);
	}

	@Override
	public Employee getByEid(int eid) {
		return repo.findById(eid).orElse(null);
	}

	@Override
	public void deleteByEid(int eid) {

		repo.deleteById(eid);

	}

	@Override
	public List<Employee> getAllEmployees() {

		return repo.findAll();
	}

}
