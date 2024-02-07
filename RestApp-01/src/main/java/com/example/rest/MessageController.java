package com.example.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

	@GetMapping("/greet")
	public String greet() {
		return "Welcome to the RestAPI";
	}
	
	@PostMapping("/msg")
	public ResponseEntity<String> save(){
		String str="Data Saved Successfully";
		return new ResponseEntity<String>(str,HttpStatus.CREATED);
	}
}
