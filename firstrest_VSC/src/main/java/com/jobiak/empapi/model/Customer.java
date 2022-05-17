package com.jobiak.empapi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Customer {
	@Id
	@GeneratedValue//AUTO is Default
	//@Column(name="title")
	private Long custid;
	
	private String name;
	private double balance;
	
	public Customer() {
	
	}

	public Long getCustid() {
		return custid;
	}

	public void setCustid(long custid) {
		this.custid = custid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Customer [id=" + custid + ", name=" + name + ", balance=" + balance + "]";
	}
	
}	
