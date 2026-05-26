package com.hexaware.springdatajpa.mappings.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hexaware.springdatajpa.mappings.entities.Address;

public interface AddressRepository extends JpaRepository<Address, Integer> {

}
