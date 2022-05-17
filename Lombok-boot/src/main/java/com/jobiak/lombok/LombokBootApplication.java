package com.jobiak.lombok;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jobiak.lombok.model.Customer;

@SpringBootApplication
public class LombokBootApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(LombokBootApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		Customer cust=new Customer();
		cust.setCustId(1);
		cust.setName("John Doe");
		cust.setBalance(2000);
		
		System.out.println(cust.getBalance());
		System.out.println(cust.getName());
		System.out.println(cust.getCustId());
		System.out.println(cust);
		//hexadecimal string type hashcode
	
		Customer cust2 = new Customer(2,"Jonas Doe",3000);
		System.out.println(cust2);
		
		boolean result= cust.equals(cust2);
		System.out.println(result);
}
}