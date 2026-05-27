package com.starhealth.user.vo;

import com.starhealth.user.entity.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class UserDepartmentVO { // pojo or VO
	
	
	private User user;
	private Department depart;

}
