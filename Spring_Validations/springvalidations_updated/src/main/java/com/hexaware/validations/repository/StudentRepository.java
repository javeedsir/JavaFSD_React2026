package com.hexaware.validations.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hexaware.validations.entity.Student;

@Repository
public interface StudentRepository extends  JpaRepository<Student, Long> {

}
