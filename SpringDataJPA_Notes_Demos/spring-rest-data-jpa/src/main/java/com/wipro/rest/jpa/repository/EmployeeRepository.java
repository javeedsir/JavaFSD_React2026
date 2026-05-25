package com.wipro.rest.jpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.rest.jpa.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	Employee findByEname(String ename);

	List<Employee> findBySalaryGreaterThanOrderByEnameAsc(double sal);
	
	
			
	
					

}
