package com.hexaware.mvc.service;

import java.util.List;

import com.hexaware.mvc.dao.EmployeeDaoImp;
import com.hexaware.mvc.dao.IEmployeeDao;
import com.hexaware.mvc.pojo.Employee;

public class EmployeeServiceImp  implements IEmployeeService {
	
	
	
	IEmployeeDao dao = new EmployeeDaoImp();
	

	@Override
	public int addEmployee(Employee emp) {
		
		return  dao.addEmployee(emp);
	}

	@Override
	public List<Employee> displayAllEmployees() {
		
		return  dao.displayAllEmployees();
	}

	/*
	 * @Override public int updateEmployee(Employee emp) {
	 * 
	 * return dao.updateEmployee(emp); }
	 * 
	 * @Override public Employee selectByEid(int eid) {
	 * 
	 * return dao.selectByEid(eid); }
	 * 
	 * @Override public int deleteByEid(int eid) {
	 * 
	 * return dao.deleteByEid(eid); }
	 */

}
