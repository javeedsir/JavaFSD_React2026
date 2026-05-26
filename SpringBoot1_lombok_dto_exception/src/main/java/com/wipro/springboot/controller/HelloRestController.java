package com.wipro.springboot.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/exp")
public class HelloRestController {

	@GetMapping("/div/{a}/{b}")
	public ResponseEntity<String> divNumbers(@PathVariable int a, @PathVariable int b) {

		int result = a / b;
		
		String str = null;
		
		System.out.println(str.length());

		ResponseEntity<String> response = new ResponseEntity<String>("Result of 2 nums division " + result,
				HttpStatus.ACCEPTED);

		return response;

	}

	@ExceptionHandler(ArithmeticException.class)
	public ResponseEntity<String> handleExp(ArithmeticException ae) {

		ResponseEntity<String> response = new ResponseEntity<String>(ae.getMessage(), HttpStatus.NOT_ACCEPTABLE);

		return response;

	}
	
	
	@ExceptionHandler(NullPointerException.class)
	@ResponseStatus(reason = "some expception occur", code = HttpStatus.CONFLICT)
	public   void   handleNPExp(NullPointerException ne) {
		
		
		
	}
	
	
	
	
	
	

}
