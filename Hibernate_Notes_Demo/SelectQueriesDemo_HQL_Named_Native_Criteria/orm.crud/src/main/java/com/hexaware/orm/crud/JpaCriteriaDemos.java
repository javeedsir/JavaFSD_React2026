package com.hexaware.orm.crud;


import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.hexaware.orm.crud.entity.Employee;

public class JpaCriteriaDemos {

	public static void main(String[] args) {


		

		SessionFactory  sessionFactory = HibernateUtil.getSessionFactory();
	

			Session session =sessionFactory.openSession();
			
				
			CriteriaBuilder  cb =		session.getCriteriaBuilder();
			
				CriteriaQuery<Employee>  cq  =		cb.createQuery(Employee.class);
				
				Root<Employee>  root  =		cq.from(Employee.class);
				
				 cq.select(root);
				 
				 
				Query<Employee>  query = 			session.createQuery(cq);
				
								List<Employee> list =		query.getResultList();
								
								System.out.println(list);
		
								
								Query<Employee>  query2 =		  session.createQuery(cq);
								
								query2.getResultStream().forEach(System.out::println);
								

	}

}
