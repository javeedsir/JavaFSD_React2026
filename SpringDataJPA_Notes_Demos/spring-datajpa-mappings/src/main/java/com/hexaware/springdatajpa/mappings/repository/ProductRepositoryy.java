package com.hexaware.springdatajpa.mappings.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hexaware.springdatajpa.mappings.entities.Product;

@Repository
public interface ProductRepositoryy extends JpaRepository<Product, Integer> {

}
