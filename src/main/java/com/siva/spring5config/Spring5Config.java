package com.siva.spring5config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.siva.beans.Customer;
import com.siva.beans.User;

@Configuration
public class Spring5Config {
	
	@Bean
	public User user() {
		return new User(200,"royala");
	}
	
	@Bean
	public Customer customer() {
		return new Customer(100,"siva");
	}
	
	

}
