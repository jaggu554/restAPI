package com.example.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetRest {

	@GetMapping("/")
	public String getMsg() {
		return "JagguBhai";
	}
}
