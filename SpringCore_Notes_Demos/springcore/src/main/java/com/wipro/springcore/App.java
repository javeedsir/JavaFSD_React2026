package com.wipro.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wipro.springcore.beans.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Spring Core App using XML config" );
        
        
        ApplicationContext  context = new  ClassPathXmlApplicationContext("application.xml");
        
        
        	Employee emp = (Employee)			context.getBean("emp");
        	
        	
        	System.out.println(emp);
        	
        	
        Employee emp2 = 			context.getBean(Employee.class);
        
        	System.out.println(emp2);
        	
        	
        	System.out.println(emp2.getAddress());
        	
        	System.out.println(emp2.getEid()  +" "+emp2.getEname()+" "+emp.getAddress().getCity());
        	
        	
        	
        	
        
        
    }
}
