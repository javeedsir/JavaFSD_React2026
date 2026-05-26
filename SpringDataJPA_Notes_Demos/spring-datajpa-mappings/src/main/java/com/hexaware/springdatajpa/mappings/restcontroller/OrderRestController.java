package com.hexaware.springdatajpa.mappings.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.springdatajpa.mappings.entities.Order;
import com.hexaware.springdatajpa.mappings.repository.OrderRepository;

@RestController
@RequestMapping("/api/orders")
public class OrderRestController {

	
		@Autowired
		OrderRepository  orderRepo;
	
		@PostMapping("/insert")
		public   Order  insertOrder(@RequestBody  Order order){
			
				return orderRepo.save(order);
			
			
		}
	
	
	
}
