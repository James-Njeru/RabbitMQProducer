package com.springbatch.model;

public class CustomerStatus {
	private Customer customer;
	
	public CustomerStatus() {
	}

	public CustomerStatus(Customer customer) {
		this.customer = customer;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "CustomerStatus [customer=" + customer + "]";
	}

}
