package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

	@GetMapping("/")
	public String getWelcome() {
		return "Hello,Welcome to the browser";
	}
}
