package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JavaToJsonController {

	@GetMapping("/")
	public Customer getWelcome() {
		
		Customer c=new Customer();
		c.setCid(101);
		c.setCustomerDelivery("Pamidi");
		c.setCustomerName("Jagadeeswar Reddy");
		c.setCustomerMobile("9381218722");
		
		return c;
	}
}
