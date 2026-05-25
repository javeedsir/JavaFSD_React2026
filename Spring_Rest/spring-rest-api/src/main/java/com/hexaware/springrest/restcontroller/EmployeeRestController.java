package com.hexaware.springrest.restcontroller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.springrest.entity.Employee;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

	List<Employee> list = new ArrayList<Employee>();

	public EmployeeRestController() {

		list.add(new Employee(101, "king", 50000));
		list.add(new Employee(102, "scott", 40000));
		list.add(new Employee(103, "ford", 20000));
		list.add(new Employee(104, "ravi", 10000));

	}

	@GetMapping("/hello")
	public String hello() {

		return "Hello friends from REST API";

	}

	// resource or endpoint uri = http://localhost:8080/api/getall

	@GetMapping("/getall")
	public List<Employee> getEmployee() {

		return list;
	}

	@GetMapping("/getbyid/{eid}")
	public Employee getById(@PathVariable int eid) {

		Employee emp = null;

		for (Employee e1 : list) {

			if (e1.getEid() == eid) {

				emp = e1;

			}

		}

		return emp;
	}
	
	
	  @PostMapping(value="/add",consumes = "application/json",produces = "application/json")
	  public   Employee   addEmp(@RequestBody Employee emp) {
		  
		  
		  return emp;
		  
	  }		
	
	
	  @PutMapping("/update")
	  public   Employee   updateEmp(@RequestBody Employee emp) {
		  
		  
		  return emp;
		  
	  }		
	
	  @DeleteMapping("/delete/{eid}")
	  public String   deleteById(@PathVariable  int eid) {
		  
		  
		  return  "Record Deleted with Eid "+eid;
	  }
	
	

}
