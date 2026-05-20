package com.wipro.layers.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.layers.repository.IRepository;

@Service
public class ServiceImp  implements IService{
	
	@Autowired
	IRepository repo;

	@Override
	public void getData() {


		repo.getData();
		
		System.out.println("getData() from Service");
	}

}
