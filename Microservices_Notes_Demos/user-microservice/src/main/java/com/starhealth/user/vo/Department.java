package com.starhealth.user.vo;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data

public class Department { //pojo or 	VO Class  but not entity
	
	
	private Long  departmentId;
	private String departmentName;
	private String departmentAddress;
	private String departmentCode;

}
