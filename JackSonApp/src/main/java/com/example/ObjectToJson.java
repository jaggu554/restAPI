package com.example;

import java.io.File;

import com.example.binding.Address;
import com.example.binding.Customer;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ObjectToJson {

	public static void main(String[] args) throws Exception{
		
		Customer c=new Customer();
		c.setCid(101);
		c.setCustomerDelivery("Pamidi");
		c.setCustomerName("Jagadeeswar Reddy");
		c.setCustomerMobile("9381218722");
		
		
		Address ad=new Address();
		ad.setCity("ATP");
		ad.setPincode(515775);
		ad.setStreet("OC-colony");
		
		c.setAddress(ad);
		
		ObjectMapper mapper=new ObjectMapper();
		mapper.writeValue(new File("customer.json"), c);
		System.out.println("Json Created");
		
		
		
	}
}
