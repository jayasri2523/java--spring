package com.jobiak.empapi.resources;

import java.util.ArrayList;
import java.util.List;

import javax.websocket.server.PathParam;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


//import com.jobiak.empapi.Model;
import com.jobiak.empapi.model.Customer;
import com.jobiak.empapi.service.CustomerService;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/customers")
public class CustomerResource {

	@Autowired
	CustomerService service;
	
	
	@GetMapping(value="/display",produces=MediaType.APPLICATION_JSON_VALUE)
    public List<Customer>showAll(){
		return service.getAll();
	}
	
	
	
	
	
	
	@GetMapping(value="/mobile",produces=MediaType.APPLICATION_JSON_VALUE)
	public Customer showCatalog()
	{
		Customer customer=new Customer();
		customer.setCustid(101L);
		customer.setName("abc");
		customer.setBalance(49999);
	return customer;
	}
	
	
	@GetMapping("/intro")
	public String introduction() {
		return new String("The #1 Manfacture of Digital Mobiles in Asia");
	}
	
	@GetMapping("/search/{modelId}/brand/{brand}")
	public String searchModel(@PathVariable(value="modelId")String modelId,@PathVariable(value="brand")String brand) {
		return new String(modelId+brand+"currently not available for your location");
	}
	
	@PostMapping(value="/create",consumes =MediaType.APPLICATION_JSON_VALUE,
			produces=MediaType.APPLICATION_JSON_VALUE)
	public Customer addProduct(@RequestBody Customer customer) {
		
		
		//System.out.println(mobile);
		//repo.save(mobile);
		Customer ref= service.addCustomer(customer);
		return ref;
	}
	
	@PutMapping(value="/modify",consumes =MediaType.APPLICATION_JSON_VALUE,
			produces=MediaType.APPLICATION_JSON_VALUE)
	public Customer modifyProduct(@RequestBody Customer customer) {
		Customer ref =service.modifyMobile(customer);
		return ref;
	}
	
	@DeleteMapping(value="/delete/{cid}")
	public void removeCustomer(@PathVariable(value="cid")Long cid) {

		System.out.println(cid);
		service.removeCustomer(cid);
		
	}
}