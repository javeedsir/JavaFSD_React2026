package com.hexaware.springdatajpa.mappings.entities;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="order_master")
public class Order {
	
	@Id
	private int orderId;
	private LocalDate purchaseDate;
	
	@ManyToMany(cascade = CascadeType.ALL)
	
	@JoinTable(name="products_orders_table", 
			joinColumns = {@JoinColumn(name="order_id")} ,
			inverseJoinColumns = {@JoinColumn(name="product_id")}
				)
	private  Set<Product>  products = new HashSet<Product>();
	
	public Order() {
		
		
	}
	
	
	
	public Order(int orderId, LocalDate purchaseDate, Set<Product> products) {
		super();
		this.orderId = orderId;
		this.purchaseDate = purchaseDate;
		this.products = products;
	}


	public int getOrderId() {
		return orderId;
	}


	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}


	public LocalDate getPurchaseDate() {
		return purchaseDate;
	}


	public void setPurchaseDate(LocalDate purchaseDate) {
		this.purchaseDate = purchaseDate;
	}


	public Set<Product> getProducts() {
		return products;
	}


	public void setProducts(Set<Product> products) {
		this.products = products;
	}
	
	public void addProduct(Product p) {
		
		
		this.getProducts().add(p);
	
	
}
	
	
	

}
