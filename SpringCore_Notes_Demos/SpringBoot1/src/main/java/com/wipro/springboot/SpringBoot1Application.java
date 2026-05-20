package com.wipro.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.wipro.springboot.bean.Employee;

@SpringBootApplication
public class SpringBoot1Application {

	public static void main(String[] args) {
	
		
		ApplicationContext context =  SpringApplication.run(SpringBoot1Application.class, args);
		
			Employee e1 =	context.getBean(Employee.class);	
			
			System.out.println(e1);
	}
	
	
	@Bean
	public String getString() {
		
		return "message from Bean annotations";
		
	}

}
