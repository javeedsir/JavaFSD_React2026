package com.hexaware.springsecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hexaware.springsecurity.entity.UserEntity;

@Repository
public interface UserRepository  extends JpaRepository<UserEntity, Long> {
	
				public  UserEntity  findByUsername(String username);

}
