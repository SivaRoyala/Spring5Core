package com.siva.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.siva.beans.Customer;

public class Spring5CoreMain {

	public static void main(String[] args) {
		
		try(AbstractApplicationContext ctx = new AnnotationConfigApplicationContext("com.siva.spring5config")){
			
			Customer c = (Customer)ctx.getBean(Customer.class);
			
			System.out.println(c.getCustomerId()+" "+c.getCustomName());
		}
		
	}

}
