package com.example;

import java.io.File;
import java.io.IOException;

import com.example.binding.Customer;
import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonToJava {

	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		
		File f=new File("customer.json");
		
		ObjectMapper map=new ObjectMapper();
		Customer c=map.readValue(f,Customer.class);
		System.out.println(c);
		
	}
}
