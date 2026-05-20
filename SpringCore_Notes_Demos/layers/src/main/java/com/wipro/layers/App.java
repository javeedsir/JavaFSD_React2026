package com.wipro.layers;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.wipro.layers.bean.Customer;
import com.wipro.layers.config.AppConfig;
import com.wipro.layers.service.IService;
import com.wipro.layers.service.ServiceImp;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        
        ApplicationContext  context =  new AnnotationConfigApplicationContext(AppConfig.class);
        
     Customer customer =   	context.getBean(Customer.class);
     
     System.out.println(customer);
     
     		IService  service=				context.getBean(ServiceImp.class);
     		
     		System.out.println(service);
     		
     				service.getData();
        
        
        
    }
}
