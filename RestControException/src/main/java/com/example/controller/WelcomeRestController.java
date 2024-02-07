package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {

	@GetMapping("/")
	public String getWelcome() {
		
		int i=10/0;
		return "Welcome to the rest Controller";
	}
}
