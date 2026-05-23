package com.hexaware.orm.crud;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hexaware.orm.crud.entity.Employee;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

		Session session = sessionFactory.openSession();

		Transaction tr = session.beginTransaction();

		 Employee emp = new Employee(101,"javeed",30000);
		 Serializable ser = session.save(emp);

		// System.out.println(ser.toString());

		Employee emp1 = session.get(Employee.class, 101);

		emp1.setSalary(70000);

		//session.save(emp);   // insert or update 
		
		session.saveOrUpdate(emp1);   // insert or update

		System.out.println(emp1);
		
		//session.delete(emp);
		
			//System.out.println("After delete "+emp);

		tr.commit();

	}
}
