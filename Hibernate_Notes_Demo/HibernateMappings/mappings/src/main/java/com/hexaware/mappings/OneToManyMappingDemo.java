package com.hexaware.mappings;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hexaware.mappings.entities.Department;
import com.hexaware.mappings.entities.Emp;

public class OneToManyMappingDemo {

	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

		Session session = sessionFactory.openSession();

		Transaction txn = session.beginTransaction();

		Emp e1 = new Emp(101, "King", 55000);
		Emp e2 = new Emp(102, "Smith", 30000);
		Emp e3 = new Emp(103, "Ford", 40000);
		Emp e4 = new Emp(104, "Ravi", 25000);

		Department dept1 = new Department();
		dept1.setDepartmentId(10);
		dept1.setDepartmentName("Development");

		dept1.addEmployee(e1);
		dept1.addEmployee(e2);
		dept1.addEmployee(e3);
		dept1.addEmployee(e4);

		session.persist(dept1);
		
		
		

		txn.commit();
	}

}
