package com.wipro.hibernate;

import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.NativeQuery;

import com.wipro.hibernate.entity.Employee;

public class SqlNativeQueriesDemo {

	public static void main(String[] args) {


		SessionFactory  sessionFactory =		HibernateUtil.getSessionFactory();
		
		Session session =			sessionFactory.openSession();
			
		String nativeQuery = "select * from Emp_Table";
		
			NativeQuery<Employee>	nq =	session.createNativeQuery(nativeQuery, Employee.class);
		
			List<Employee>  list  =	nq.getResultList();
			
				list.forEach(System.out::println);
				
		String  sqlQuery =  "select * from Emp_Table order by salary";	
		
		NativeQuery  sql =	session.createNativeQuery(sqlQuery, Employee.class);
		
			List<Employee>  list2 =	sql.getResultList();
			
				list2.forEach(System.out::println);
			
	}

}
