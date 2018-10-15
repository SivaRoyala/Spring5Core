package com.siva.beans;

public class Customer {
	
	private int customerId;
	private String customName;
	
	public Customer(int customerId, String customName) {
		this.customerId = customerId;
		this.customName = customName;
	}
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomName() {
		return customName;
	}
	public void setCustomName(String customName) {
		this.customName = customName;
	}
	
	

}
