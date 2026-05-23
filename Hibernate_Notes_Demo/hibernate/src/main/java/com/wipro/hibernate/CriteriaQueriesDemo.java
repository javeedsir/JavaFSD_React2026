package com.wipro.hibernate;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.wipro.hibernate.entity.Employee;

public class CriteriaQueriesDemo {

	public static void main(String[] args) {

		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

		Session session = sessionFactory.openSession();

		CriteriaBuilder cb = session.getCriteriaBuilder();

		CriteriaQuery<Employee> cq = cb.createQuery(Employee.class);

		Root<Employee> root = cq.from(Employee.class);

		cq.select(root);

		Query query = session.createQuery(cq);

		List<Employee> list = query.getResultList();

		list.forEach(System.out::println);

	}

}
