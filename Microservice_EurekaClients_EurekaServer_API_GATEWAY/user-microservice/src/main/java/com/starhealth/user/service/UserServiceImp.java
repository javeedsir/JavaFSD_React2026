package com.starhealth.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.starhealth.user.entity.User;
import com.starhealth.user.repository.UserRepository;
import com.starhealth.user.vo.Department;
import com.starhealth.user.vo.UserDepartmentVO;

@Service
public class UserServiceImp implements IUserServce {

	@Autowired
	RestTemplate restTemplate;
	
	
	@Autowired
	UserRepository repo;
	
	@Override
	public User addUser(User user) {
		// TODO Auto-generated method stub
		return repo.save(user);
	}

	@Override
	public User getUserById(Long userId) {
		// TODO Auto-generated method stub
		return repo.findById(userId).orElse(new User());
	}

	@Override
	public UserDepartmentVO getUserWithDept(Long userId) {


			User user =		getUserById(userId);
			
			Long deptId =  user.getDepartmentId();
			
			
Department department  =	restTemplate.getForObject("http://DEPARTMENT-SERVICE/api/department/get/"+deptId, Department.class);	
	
		//	Department department  =	restTemplate.getForObject("http://localhost:8181/api/department/get/"+deptId, Department.class);
			
			//Department department = (Department)	response.getBody();
		
			UserDepartmentVO  userDepart = new UserDepartmentVO(user, department);
			
		
		return userDepart;
	}
	
	
	

}
