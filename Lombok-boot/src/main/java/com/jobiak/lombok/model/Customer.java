package com.jobiak.lombok.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@NoArgsConstructor
@AllArgsConstructor
@ToString

  public class Customer {
	
	@Getter
	@Setter
	private long custId;
	@Getter
	@Setter
	private String name;
	@Getter
	@Setter
	private double balance;
}