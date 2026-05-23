package com.hexaware.orm.crud;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;

import com.hexaware.orm.crud.entity.Employee;

public class NativeQueriesDemo {

	public static void main(String[] args) {


		SessionFactory  sessionFactory = HibernateUtil.getSessionFactory();
		

		Session session =sessionFactory.openSession();
		
		
		
				String  sqlQuery = "select * from Emp_Table";
				
				
			NativeQuery<Employee>	nativeQuery =	session.createNativeQuery(sqlQuery,Employee.class);
			
					List<Employee>  list =			nativeQuery.getResultList();
					
						list.stream().forEach(System.out::println);
					
		
						
				Transaction  tr =		session.beginTransaction();

				String   insertSqlQuery = "insert into  Emp_Table values(?1,?2,?3)";
				
				NativeQuery   nativeQuery2 =	session.createNativeQuery(insertSqlQuery);
						
								nativeQuery2.setParameter(1, 107);
								nativeQuery2.setParameter(2, "Akash");
								nativeQuery2.setParameter(3, 45000);
				
				
							int  count =		nativeQuery2.executeUpdate();
							
							tr.commit();

							System.out.println(count +" record inserted...");
							
}
	
}
