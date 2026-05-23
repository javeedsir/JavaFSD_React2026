package com.hexaware.orm.crud.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.hexaware.orm.crud.HibernateUtil;
import com.hexaware.orm.crud.entity.Employee;

public class EmployeeDao {
	
	
	
	SessionFactory  sessionFactory = HibernateUtil.getSessionFactory();
	

	Session session =sessionFactory.openSession();
	
	
		public List<Employee>  getAllEmployees(){
			
			
				Query<Employee> query1 = session.createNamedQuery("getAllEmployees");
				
						query1.setParameter("amount", 40000.0);  // here amount is name parameter
				
				
				List<Employee>  list =	query1.getResultList();
			
			
			return list;
			
		}
	
		
		
		
		public   Double           getMaxSalary() {
			
			
				Query<Double>  query2 =	session.createNamedQuery("getMaxSalary");
				
					Double  maxSalary =			query2.getSingleResult();
					
					return maxSalary;
			
		}
		
		
		
		
		
		
		
		

}
