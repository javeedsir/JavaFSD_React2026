package com.hexaware.exceptionhandling.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.exceptionhandling.UserException;
import com.hexaware.exceptionhandling.service.HelloService;

@RestController
public class HelloRestController {
	
	
	@Autowired
	HelloService service;
	
	
		
		
			@GetMapping("/exp")
			public void   raiseExp()throws UserException {
				
				
				
					throw	new  UserException();
				
				
				
				
			}
	
	
	
			@GetMapping("/hello")
			public  ResponseEntity<String> hello() {
				
				return   new ResponseEntity<String>("Hello Friends",HttpStatus.FORBIDDEN);
				
			}
	
			
			@GetMapping("/div")
			public  double    div() {
				
				
					return  service.div();
				
			}
			
			
			
			@GetMapping("/get")
			public String    findLength() {
				
				String name = null;
				
					int len = name.length();
					
					return "The length of  name is "+len;
				
			}
			
			
			
			
			@ExceptionHandler(NullPointerException.class)
			@ResponseStatus(reason = "name is null cause null pointer exception",code = HttpStatus.BAD_REQUEST)
			public  void    handleNPExp() {
				
				
				
				
			}
			
			
			
			/*
			 * @ExceptionHandler(ArithmeticException.class)
			 * 
			 * @ResponseStatus(reason=" sorry you cannot divide number by zero" , code =
			 * HttpStatus.OK) public void handleArithmeticExp() {
			 * 
			 * 
			 * 
			 * 
			 * }
			 */
			
			
			
			
			
			
			
			
			
			
	

}
