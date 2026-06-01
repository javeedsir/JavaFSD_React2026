package com.hexaware.springsecurity.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;


@Configuration
@EnableWebSecurity
public class AppSecurityConfig {
	
	
			@Autowired
			UserDetailsService   userDetailsService;
	
	
	/*
	 * @Bean public UserDetailsService getUserDetailsService() {
	 * 
	 * 
	 * List<UserDetails> userList = new ArrayList<UserDetails>();
	 * 
	 * userList.add(User.withDefaultPasswordEncoder().username("spiderman").password
	 * ("web").roles("USER").build());
	 * 
	 * userList.add(User.withDefaultPasswordEncoder().username("javeed").password(
	 * "tiger").roles("ADMIN").build());
	 * 
	 * return new InMemoryUserDetailsManager(userList);
	 * 
	 * }
	 */
	

			
				@Bean
			public     AuthenticationProvider   getAuthProvider() {
				
				
				DaoAuthenticationProvider dao = new DaoAuthenticationProvider();
				
				dao.setUserDetailsService(userDetailsService);
				dao.setPasswordEncoder(NoOpPasswordEncoder.getInstance());
				
				//dao.setPasswordEncoder(new BCryptPasswordEncoder());
				return  dao;
				
			}
			
			
			
			
			
			
			
			
			
			
			
			
}
