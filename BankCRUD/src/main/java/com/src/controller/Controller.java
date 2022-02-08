package com.src.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.src.model.customer;
import com.src.service.Cust_service;


@RestController
public class Controller {
 
	@Autowired 
	private Cust_service customer_service;
	
	@GetMapping("/home")
	public String home() {
		return "Welcome to home page";

	}

	@GetMapping("/get_all_customers")
	public List<customer> getCustomers() {
		
		return this.customer_service.getCustomers();

	}
	
	@GetMapping("/get_all_customers/{customer_id}")
	public customer getCustomersID(@PathVariable long cutomer_id) {
		
		return this.customer_service.getCustomersID(cutomer_id);
	}
	
	@PostMapping("/add_customer")
	public customer addCustomer(@RequestBody customer cust) {
		return this.customer_service.addCustomer(cust);
	}

}
