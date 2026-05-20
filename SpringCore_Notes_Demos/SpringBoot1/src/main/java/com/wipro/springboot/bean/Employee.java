package com.wipro.springboot.bean;

import org.springframework.stereotype.Component;

@Component
public class Employee {
	
		private int eid;
		private String ename;
		private double salary;
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
		
		
		

}
