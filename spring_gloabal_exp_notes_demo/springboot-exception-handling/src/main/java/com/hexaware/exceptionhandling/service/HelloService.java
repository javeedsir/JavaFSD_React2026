package com.hexaware.exceptionhandling.service;

import org.springframework.stereotype.Service;

@Service
public class HelloService {
	
	
	
		public  double div() {
			
			
			return 10/0;
			
		}
	

}
