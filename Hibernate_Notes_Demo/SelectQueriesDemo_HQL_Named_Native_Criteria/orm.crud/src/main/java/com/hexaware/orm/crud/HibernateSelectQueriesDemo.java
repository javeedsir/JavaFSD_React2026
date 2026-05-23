package com.hexaware.orm.crud;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.hexaware.orm.crud.entity.Employee;

public class HibernateSelectQueriesDemo {

	public static void main(String[] args) {


			SessionFactory  sessionFactory = HibernateUtil.getSessionFactory();
		

				Session session =sessionFactory.openSession();
				
				// HQL or JPQL with positional parameters
				
String  selectQuery = "select  e1  from  Employee  e1  where e1.eid = ?1  AND  e1.ename = ?2";
				
				Query<Employee>  query =	session.createQuery(selectQuery);
				
							query.setParameter(1, 101);
							query.setParameter(2, "Javeed");
							
						Employee emp =	 query.getSingleResult();
			
							System.out.println(emp);
							
					// HQL or JPQL		
							
	String selectAllQuery = "select  e1 from  Employee e1  where  e1.salary > ?1";
	
			
				Query<Employee>   query2 =	session.createQuery(selectAllQuery);
				
							query2.setParameter(1, 30000.0);
							
					List<Employee>  list =		query2.getResultList();
								
							list.stream().forEach(System.out::println);
							
							
				String  groupQuery = "select  sum(e.salary)   from Employee e";		
				
					Query<Double>  query3  = session.createQuery(groupQuery);
					
					Double  total =		query3.getSingleResult();
							
							System.out.println("Sum of salaries "+total);
							
							
							
					Transaction tr =		session.beginTransaction();
							
				String   updateQuery  = "update Employee e   set e.salary = ?1  where e.eid = ?2";	
				
					Query  dmlQuery =		session.createQuery(updateQuery);
					
									dmlQuery.setParameter(1, 80000.0);
									dmlQuery.setParameter(2, 107);
							
								int  count = dmlQuery.executeUpdate();
								
								tr.commit();
								
								System.out.println(count +" record updated...");
								
	}

}
