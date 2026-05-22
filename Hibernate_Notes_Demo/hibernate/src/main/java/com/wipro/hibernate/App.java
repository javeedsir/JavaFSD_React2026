package com.wipro.hibernate;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.wipro.hibernate.entity.Employee;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Welcome to Hibernate");

		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

		Session session = sessionFactory.openSession();

		Transaction tx = session.beginTransaction();

		
		  Employee emp = new Employee(111, "Javeed", 80000);
		  
		  //Serializable ser = session.save(emp);
		  
		 // System.out.println(ser.toString() + " record inserted");
		  
		  
		  		//	session.saveOrUpdate(emp);
		  			
		  			session.persist(emp);
		
			//Employee emp =		session.get(Employee.class, 111);
			
			/*
			 * emp.setSalary(99000);
			 * 
			 * session.save(emp);
			 */
					
				//	session.delete(emp);
					
		

		tx.commit();

	}
}
