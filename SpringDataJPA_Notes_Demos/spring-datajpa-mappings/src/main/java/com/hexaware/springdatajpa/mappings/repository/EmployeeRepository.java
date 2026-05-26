package com.hexaware.springdatajpa.mappings.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hexaware.springdatajpa.mappings.entities.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
