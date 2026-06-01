package com.hexaware.springsecurity.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.springsecurity.entity.UserEntity;
import com.hexaware.springsecurity.repository.UserRepository;

@RestController
@RequestMapping("/api/users")
public class UserRestController {
	
				
			
			@Autowired
			UserRepository repo;
	
	
				@GetMapping("/create-user/{username}/{password}")
				public  UserEntity   registerUser(@PathVariable String username , @PathVariable  String password) {
					
							UserEntity user = new UserEntity();
								user.setUsername(username);
								user.setPassword(password);
					
						return	repo.save(user);
					
					
				}
		

				@GetMapping("/getallusers")
				public   List<UserEntity>  getAllUsers(){
					
					
							return repo.findAll(Sort.by("username"));
					
				}	
				
}
