package com.src.service;

import java.util.List;

import com.src.model.customer;

public interface Cust_service {
	
	public String home();

	public List<customer> getCustomers();

	public customer addCustomer(customer cust);

	public customer getCustomersID(long cutomer_id);

}
