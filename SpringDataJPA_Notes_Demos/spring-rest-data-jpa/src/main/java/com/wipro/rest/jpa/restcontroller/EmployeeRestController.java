package com.wipro.rest.jpa.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.rest.jpa.entity.Employee;
import com.wipro.rest.jpa.service.IEmployeeService;



@RestController
@RequestMapping("/api/employees")
class EmployeeRestController {
	
		@Autowired
		IEmployeeService service;
		
	
	
	@PostMapping(value="/add",consumes = "application/json")
	public  Employee    addEmp(@RequestBody  Employee emp) {
		
		
		return service.addEmployee(emp);
		
		
	}

	
	
	@PutMapping(value="/update",consumes = "application/json")
	public  Employee    updateEmp(@RequestBody  Employee emp) {
		
		
				return service.updateEmployee(emp);
		
	}
	
	@GetMapping(value="/getall",produces = "application/json")
	public   List<Employee> getAllEmployees(){
		
		return  service.getAllEmployees();
		
	}
	
	@GetMapping("/getbyeid/{eid}")
	public Employee  getByEid(@PathVariable int eid) {
		
		
			return service.getByEid(eid);
		
	}
	
	
	
	
	@DeleteMapping("/deletebyeid/{eid}")
	public    String   deleteByEid(@PathVariable int eid) {
		
		String  msg = "";
			   service.deleteByEid(eid);
			   
			Employee emp =   service.getByEid(eid);
			
			if(emp == null) {
				
				msg = "Record Deleted Successfully ";
			}	
		
		
			return msg;
	}
		
	
	
	
	
	
	

}
