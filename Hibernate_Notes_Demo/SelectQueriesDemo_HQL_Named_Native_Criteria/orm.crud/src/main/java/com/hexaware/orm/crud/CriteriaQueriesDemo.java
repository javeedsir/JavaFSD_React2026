package com.hexaware.orm.crud;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import com.hexaware.orm.crud.entity.Employee;

public class CriteriaQueriesDemo {

	
		public static void main(String[] args) {
			

			SessionFactory  sessionFactory = HibernateUtil.getSessionFactory();
		

				Session session =sessionFactory.openSession();
			
				Criteria  cr =session.createCriteria(Employee.class);
				
						List<Employee>  list=			cr.list();
						
						list.stream().forEach(System.out::println);
						
					
						cr.add(Restrictions.between("salary", 30000.0, 70000.0));
									// select * from Emp_Table where salary between 30000.0 and 70000.0;
		
				List<Employee>   list2 =		cr.list();
				
					list2.stream().forEach(System.out::println);
					
					
								cr.add(Restrictions.gt("salary", 30000.0));
								cr.addOrder(Order.asc("ename"));
		
								System.out.println(cr.list());
								
		}
	
	
}
