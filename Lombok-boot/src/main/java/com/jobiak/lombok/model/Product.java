package com.jobiak.lombok.model;

import lombok.Builder;
import lombok.ToString;

@Builder
@ToString

public class Product {
	
	private int productId;
	private String description;
	private double price;
}
	

