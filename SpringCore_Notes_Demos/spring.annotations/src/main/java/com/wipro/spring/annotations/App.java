package com.wipro.spring.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.wipro.spring.annotations.beans.Address;
import com.wipro.spring.annotations.beans.Employee;

/**
 * Hello world!
 *
 */

@Configuration
@ComponentScan(basePackages = "com.wipro.spring.annotations.beans")
public class App {
	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(App.class);

		Employee emp = context.getBean(Employee.class);

		emp.setEid(111);
		emp.setEname("scott");

		System.out.println(emp);
		
		
		Employee e1 =  context.getBean("e1" , Employee.class);
		
		
		System.out.println(e1);
		
		System.out.println(e1.getT1());
		
		
		System.out.println(emp.getAddress());

		Address address = context.getBean(Address.class);

		address.setCity("Hyderabad");

		System.out.println(address);
		
		Address a1 = (Address)			context.getBean("a1");
		
			System.out.println(a1);
		
		

	}
	
	
	
	
	
		@Bean("t1")
		@Scope("prototype")
		public Thread   getThreadObj() {
			
			
			
			 return new Thread();
			
			
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
