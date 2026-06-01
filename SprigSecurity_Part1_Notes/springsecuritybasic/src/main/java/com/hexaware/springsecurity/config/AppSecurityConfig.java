package com.hexaware.springsecurity.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;


@Configuration
@EnableWebSecurity
public class AppSecurityConfig {
	
	
	
	@Bean
	public  UserDetailsService  getUserDetailsService() {
		
		
		List<UserDetails>  userList = new ArrayList<UserDetails>();
		
		userList.add(User.withDefaultPasswordEncoder().username("spiderman").password("web").roles("USER").build());
		
		userList.add(User.withDefaultPasswordEncoder().username("javeed").password("tiger").roles("ADMIN").build());
		
		return  new  InMemoryUserDetailsManager(userList);
		
	}
	

}
