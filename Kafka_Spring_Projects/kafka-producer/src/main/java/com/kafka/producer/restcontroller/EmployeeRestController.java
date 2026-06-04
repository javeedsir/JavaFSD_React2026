package com.kafka.producer.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kafka.producer.pojo.Employee;

@RestController
public class EmployeeRestController { // kafka-producer app

		@Autowired
		KafkaTemplate<String,Employee> kafkaTemplate;
	
		public static final String TOPIC = "NessTopic";
		
	
		/*
		 * @GetMapping("/publish/{message}") public String getMessage(@PathVariable String
		 * message) {
		 * 
		 * 
		 * kafkaTemplate.send(TOPIC,message);
		 * 
		 * return "Message Published Successfully ";
		 * 
		 * }
		 */
		
		@PostMapping("/publish")
		public String    publishMessages(@RequestBody Employee employee) {
			
			
			kafkaTemplate.send(TOPIC,employee);
			
			return "Message Published by Producer";
			
			
		}
	
	
	
	
}
