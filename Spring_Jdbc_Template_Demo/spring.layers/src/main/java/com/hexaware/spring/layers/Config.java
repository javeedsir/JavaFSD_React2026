package com.hexaware.spring.layers;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages = {"com.hexaware.spring"})
public class Config {
	
	
	
	
		@Bean
		public JdbcTemplate  getJbdcTemplate() {
			
			return new JdbcTemplate(getDataSource());
			
		}
	
	
	
	
		@Bean
		public  DataSource   getDataSource() {
			
			
				DriverManagerDataSource  dm  = new DriverManagerDataSource();
				
				dm.setDriverClassName("com.mysql.cj.jdbc.Driver");
				dm.setUrl("jdbc:mysql://localhost:3306/mydb");
				dm.setUsername("root");
				dm.setPassword("admin");
				
				
				return dm;
			
			
			
			
		}
	

}
