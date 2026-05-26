package com.hexaware.springdatajpa.mappings.entities;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;


@Entity
@Table(name="product_master")
public class Product {
	
	@Id
	private int productId;
	private String productName;
	
	@ManyToMany(mappedBy = "products" ,fetch = FetchType.LAZY)
	private  Set<Order> orders  = new HashSet<Order>();


	public Product() {
		
		
	}
	
	

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}



	public Set<Order> getOrders() {
		return orders;
	}



	public void setOrders(Set<Order> orders) {
		this.orders = orders;
	}

	
	
	
	
	
	
	

}
