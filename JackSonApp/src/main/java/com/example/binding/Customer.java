package com.example.binding;

import lombok.Data;

@Data
public class Customer {

	private Integer cid;
	
	private String customerName;
	
	private String customerMobile;
	
	private String customerDelivery;
	
	private Address address;
	
}
