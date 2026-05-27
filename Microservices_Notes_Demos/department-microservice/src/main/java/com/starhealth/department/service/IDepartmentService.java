package com.starhealth.department.service;

import com.starhealth.department.entity.Department;

public interface IDepartmentService {
	
	public   Department       addDepartment(Department dept);
	
	public  Department  getDeptById(Long id);
	
	

}
