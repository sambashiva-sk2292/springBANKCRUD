package com.src.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/*import javax.persistence.Entity;
import javax.persistence.Id;*/

@Entity
public class customer {
	
	@Id
	private long customer_id;
	private String customer_name;
	private long balance;
	private long phone_num;
	
	
	public long getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(long cutomer_id) {
		this.customer_id = cutomer_id;
	}
	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
	public long getPhone_num() {
		return phone_num;
	}
	public void setPhone_num(long phone_num) {
		this.phone_num = phone_num;
	}
	public customer(long customer_id, String customer_name, long balance, long phone_num) {
		super();
		this.customer_id = customer_id;
		this.customer_name = customer_name;
		this.balance = balance;
		this.phone_num = phone_num;
	}
	public customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "customer [customer_id=" + customer_id + ", customer_name=" + customer_name + ", balance=" + balance
				+ ", phone_num=" + phone_num + "]";
	}
	
	

}
