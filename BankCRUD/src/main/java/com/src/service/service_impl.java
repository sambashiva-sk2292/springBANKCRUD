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
	public customer getCustomersID(long customer_id) {
		// TODO Auto-generated method stub
		return cust_doa.findById(customer_id).get();
	}

	@Override
	public void deleteCustomer(long customer_id) {
		// TODO Auto-generated method stub
		customer entity=cust_doa.getOne(customer_id);
		cust_doa.delete(entity);
	}

	
}
