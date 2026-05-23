package com.hexaware.mappings;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hexaware.mappings.entities.Address;
import com.hexaware.mappings.entities.Employee;

public class OneToOneMappingDemo {

	public static void main(String[] args) {

		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

		Session session = sessionFactory.openSession();

		// OneToOne Mapping using Uni-direction

		Transaction tr = session.beginTransaction();
		
		
		/*
		 * Address address = new Address(21, "Hyderabad");
		 * 
		 * Employee employee = new Employee(101, "King", 45000.0, address); //
		 * Constructor DI
		 * 
		 * 
		 * Serializable ser = session.save(employee); // here employee obj depends on
		 * //address , 1st address then employee records will be inserted
		 * 
		 * System.out.println("Record inserted for eid "+ser.toString());
		 * 
		 * Employee emp = session.get(Employee.class, 101);
		 * 
		 * System.out.println(emp);
		 * 
		 * System.out.println(emp.getAddress());
		 */
		 
		 

		// OneToOneMapping using Bi-direction

		
		
		  Address address = new Address();
		  
		  address.setAid(27); address.setCity("Banglore");
		  
		  Employee emp = new Employee(102, "Javeed", 35000.0, address);
		  
		  address.setEmployee(emp); // Setter DI
		  
		  
		  
		  session.persist(address);
		  
		  
		  
		 
		tr.commit();

	}

}
