package com.src.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/*import javax.persistence.Entity;
import javax.persistence.Id;*/

@Entity
public class customer {
	
	@Id
	private long cutomer_id;
	private String customer_name;
	private long balance;
	private long phone_num;
	
	
	public long getCutomer_id() {
		return cutomer_id;
	}
	public void setCutomer_id(long cutomer_id) {
		this.cutomer_id = cutomer_id;
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
	public customer(long cutomer_id, String customer_name, long balance, long phone_num) {
		super();
		this.cutomer_id = cutomer_id;
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
		return "customer [cutomer_id=" + cutomer_id + ", customer_name=" + customer_name + ", balance=" + balance
				+ ", phone_num=" + phone_num + "]";
	}
	
	

}
