package com.hexaware.mappings.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Address {
	
	
	@Id
	private int aid;    // aid is p.k  , its a parent
	private String city;
	
	@OneToOne(mappedBy = "address" , cascade = CascadeType.ALL)
	private Employee  employee;
	
	public Address() {
		
	}
	
	public Address(int aid, String city) {
		super();
		this.aid = aid;
		this.city = city;
	}
	
	
	
	
	
	public Address(int aid, String city, Employee employee) {
		super();
		this.aid = aid;
		this.city = city;
		this.employee = employee;
	}
	
	
	
	

	
	  public Employee getEmployee() { return employee; }
	  
	  public void setEmployee(Employee employee) { this.employee = employee; }
	 
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [aid=" + aid + ", city=" + city + ", employee=" + employee + "]";
	}

	
	
	
	
	

}
