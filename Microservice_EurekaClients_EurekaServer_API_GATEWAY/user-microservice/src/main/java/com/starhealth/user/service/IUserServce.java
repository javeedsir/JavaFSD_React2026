package com.starhealth.user.service;

import com.starhealth.user.entity.User;
import com.starhealth.user.vo.UserDepartmentVO;

public interface IUserServce {
	
	  
	
		public User  addUser(User user);
		public User   getUserById(Long userId);
		
		public UserDepartmentVO  getUserWithDept(Long userId);

}
