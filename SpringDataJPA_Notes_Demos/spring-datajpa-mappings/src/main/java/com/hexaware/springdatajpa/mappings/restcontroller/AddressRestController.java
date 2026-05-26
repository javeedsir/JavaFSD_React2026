package com.hexaware.springdatajpa.mappings.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.springdatajpa.mappings.entities.Address;
import com.hexaware.springdatajpa.mappings.entities.Student;
import com.hexaware.springdatajpa.mappings.repository.AddressRepository;

@RestController
@RequestMapping("/api/address")
public class AddressRestController {
	
	
	@Autowired
	AddressRepository  addressRepo;
	
		
	@PostMapping("/insert")
	public Address  insertAddress(@RequestBody Address address) {
		
		return    addressRepo.save(address);
		
	}
	
	@GetMapping("/getall")
	public List<Address>  getAllAddresses(){
		
		
		return addressRepo.findAll();
		
	}
	

}
