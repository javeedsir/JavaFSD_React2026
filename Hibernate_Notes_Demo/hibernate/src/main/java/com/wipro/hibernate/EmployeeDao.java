package com.wipro.hibernate;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.wipro.hibernate.entity.Employee;

public class EmployeeDao {

	private	  Session session;
		
		
			
	

	public EmployeeDao() {
		
			SessionFactory sessionFactory =	HibernateUtil.getSessionFactory();
			this.session =		sessionFactory.openSession();
				
		
	}





	public List<Employee> getAll() {
		
		Query  query =		session.createNamedQuery("getAll");
		
			List<Employee>  list =		query.getResultList();
		
				
				return list;
		

	}
	
	
	
	public  List<Employee>   getBySalary(){
		
				
				Query  query =			session.createNamedQuery("getBySalary");
					
						query.setParameter(1, 5000.0);
						query.setParameter("sal", 90000.0);
				
				
				return	query.getResultList();
		
		
	}	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
