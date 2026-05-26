package com.wipro.rest.jpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.NativeQuery;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.wipro.rest.jpa.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	Employee findByEname(String ename);

	List<Employee> findBySalaryGreaterThanOrderByEnameAsc(double sal);

	@Query("select e from Employee e   order by e.salary")
	public List<Employee> findAllBySorted();

	// JPQL or HQL
	@Query("select  e  from Employee e where e.salary  between ?1  and  ?2") // here ?1 and ?2 positional parameters
	public List<Employee> findBySalaryRange(double min, double max);

	@Modifying
	@Query("update Employee e set e.salary = :sal  where eid = :id ") // here :sal and :id are bind variable or named
																		// parameters
	public int updateSalary(@Param("sal") double salary, @Param("id") int eid);

	// Native query or SQL query

	//@Query(value = "select * from Employees", nativeQuery = true)
	
	@NativeQuery("select * from Employees")
	public List<Employee> getAllBySQL();
	
	
	
	public double  sumOfSalary();

	
	
	
	
	
	

}
