package com.starhealth.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.starhealth.user.entity.User;
import com.starhealth.user.service.IUserServce;
import com.starhealth.user.vo.UserDepartmentVO;

@RestController
@RequestMapping("/api/users")
public class UserController {
	
	
	@Autowired
	IUserServce service;
	
	@PostMapping("/add")
	public User  addUser(@RequestBody User user) {
		
		return service.addUser(user);
	}
	
	@GetMapping("/get/{userId}")
	public User   getUserById(@PathVariable Long userId) {
		
		return service.getUserById(userId);
	}
	
	@GetMapping("/get/user-dept/{userId}")
	public UserDepartmentVO  getUserWithDept(@PathVariable Long userId) {
		
		return service.getUserWithDept(userId);
		
	}
	

}
