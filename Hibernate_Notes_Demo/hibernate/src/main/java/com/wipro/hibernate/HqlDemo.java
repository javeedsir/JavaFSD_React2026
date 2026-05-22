package com.wipro.hibernate;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.wipro.hibernate.entity.Employee;

public class HqlDemo {

	public static void main(String[] args) {


	SessionFactory  sessionFactory =		HibernateUtil.getSessionFactory();
	
	Session session =			sessionFactory.openSession();
		
					
	
			String  selectHQL = "select  e1 from  Employee  e1 ";
	
			Query  query =		session.createQuery(selectHQL);
			
				List<Employee>  list =		query.getResultList();

					list.forEach(System.out::println);
					
					
					
				String selectQuery = "select e1 from Employee e1  where e1.eid = ?1 and e1.ename = :empName";
				
				Query  query2 =		session.createQuery(selectQuery );
				
						query2.setParameter(1, 111);
						query2.setParameter("empName", "Javeed");
						
				Employee e1 =	(Employee)		query2.getSingleResult();
				
				
				System.out.println(e1);
				
				
					TypedQuery<Employee>  q1 =		session.createQuery(selectQuery, Employee.class);
								q1.setParameter(1, 112);
								
								q1.setParameter("empName","king");
					
							Employee e2 =		q1.getSingleResult();
							
							System.out.println(e2);
				
	}

}
