package com.hexaware.springdatajpa.mappings.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hexaware.springdatajpa.mappings.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
