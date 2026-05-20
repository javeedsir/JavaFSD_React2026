package com.wipro.layers.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.wipro.layers.bean.Customer;

@Repository
public class RepositoryImp implements IRepository {
	
	@Autowired
	Customer customer;
	

	@Override
	public void getData() {


		System.out.println("getData() from Repository using customer obj "+customer);
	}

}
