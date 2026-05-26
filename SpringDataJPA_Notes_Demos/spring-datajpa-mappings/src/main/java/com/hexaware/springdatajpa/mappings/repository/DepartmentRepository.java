package com.hexaware.springdatajpa.mappings.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hexaware.springdatajpa.mappings.entities.Department;

@Repository
public interface DepartmentRepository  extends JpaRepository<Department, Integer>{

}
