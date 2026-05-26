package com.wipro.rest.jpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.rest.jpa.entity.Employee;
import com.wipro.rest.jpa.repository.EmployeeRepository;

import jakarta.transaction.Transactional;

@Transactional
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

	@Override
	public Employee getByEname(String ename) {
		return  repo.findByEname(ename);
	}

	@Override
	public List<Employee> getBySalaryGT(double sal) {
		//return   repo.findBySalaryGreaterThan(sal);
		
		return repo.findBySalaryGreaterThanOrderByEnameAsc(sal);
	}

	@Override
	public List<Employee> findAllBySorted() {
		
		return repo.findAllBySorted();
	}

	@Override
	public int updateSalary(double salary, int eid) {
		
		return repo.updateSalary(salary, eid);
	}

}
