package com.hexaware.orm.crud.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="Emp_Table")

// HQL named query with :amount  as a name parameter 
@NamedQueries({
	
	@NamedQuery(name ="getAllEmployees"  , query ="select e  from Employee  e  where e.salary > :amount") ,
	@NamedQuery(name="getMaxSalary" , query ="select  Max(e.salary)  from Employee e")
	
	
})
public class Employee {
	
	@Id
	private int eid;
	@Column(name="emp_name")
	private String ename;
	private  double salary;
	
	public Employee() {
		
		
	}
	
	
	public Employee(int eid, String ename, double salary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", salary=" + salary + "]";
	}
	
	

}
