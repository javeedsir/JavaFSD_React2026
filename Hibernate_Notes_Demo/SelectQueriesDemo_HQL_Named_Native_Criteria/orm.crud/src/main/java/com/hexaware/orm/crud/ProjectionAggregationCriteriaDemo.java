package com.hexaware.orm.crud;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projections;

import com.hexaware.orm.crud.entity.Employee;

public class ProjectionAggregationCriteriaDemo {

	public static void main(String[] args) {


		
		SessionFactory  sessionFactory = HibernateUtil.getSessionFactory();
		

		Session session =sessionFactory.openSession();
	
		Criteria  cr =session.createCriteria(Employee.class);
		
		
					cr.setProjection(Projections.rowCount());
					
					System.out.println(cr.list());
					
					cr.setProjection(Projections.max("salary"));
					
					System.out.println(cr.list());
		

	}

}
