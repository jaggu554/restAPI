package com.example;

import org.springframework.boot.autoconfigure.amqp.RabbitConnectionDetails.Address;

import lombok.Data;

@Data
public class Customer {

	private Integer cid;
	
	private String customerName;
	
	private String customerMobile;
	
	private String customerDelivery;
	
	
	
}
