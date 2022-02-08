package com.src.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
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
	public customer getCustomersID(@PathVariable long customer_id) {
		
		return this.customer_service.getCustomersID(customer_id);
	}
	
	
	
	@PostMapping("/add_customer")
	public customer addCustomer(@RequestBody customer cust) {
		return this.customer_service.addCustomer(cust);
	}
	
	@DeleteMapping("get_all_customers/{customer_id}") 
	 public ResponseEntity<HttpStatus>deleteCustomer(@PathVariable long customer_id){ 
		 try {
			 this.customer_service.deleteCustomer(customer_id); 
			 return new ResponseEntity<>(HttpStatus.OK); }
		 catch (Exception e ) {
			 return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR); } }
	

}
