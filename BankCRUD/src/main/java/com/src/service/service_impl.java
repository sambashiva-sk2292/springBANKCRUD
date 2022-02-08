package com.src.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.src.doa.customer_doa;
import com.src.model.customer;

@Service
public class service_impl implements Cust_service{

	@Autowired
	private customer_doa cust_doa;
	
	public List<customer> getCustomers(){
		return cust_doa.findAll();
	}

	@Override
	public String home() {
		// TODO Auto-generated method stub
		return "Home page ";
	}

	@Override
	public customer addCustomer(customer cust) {
		// TODO Auto-generated method stub
		return cust_doa.save(cust);
	}

	@Override
	public customer getCustomersID(long cutomer_id) {
		// TODO Auto-generated method stub
		return cust_doa.findById(cutomer_id).get();
	}
}
