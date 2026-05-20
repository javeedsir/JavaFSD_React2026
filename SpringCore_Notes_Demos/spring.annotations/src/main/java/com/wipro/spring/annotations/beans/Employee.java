package com.wipro.spring.annotations.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Component("e1")
@Scope("prototype")
public class Employee {
	
		private int eid;
		private String  ename;
		
		
		@Autowired
		private Address address;
		
		
		@Autowired
		private Thread t1;
		
		
		public Employee() {
			
			
		}
		
		
		
		
		public Employee(int eid, String ename, Address address) {
			super();
			this.eid = eid;
			this.ename = ename;
			this.address = address;
		}

		
		


		//@Autowired
		public Employee(Thread t1) {
			super();
			this.t1 = t1;
		}




		public Thread getT1() {
			return t1;
		}



		//@Autowired
		public void setT1(Thread t1) {
			this.t1 = t1;
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




		public Address getAddress() {
			return address;
		}




		public void setAddress(Address address) {
			this.address = address;
		}
		
		
		
		
		
	

}
