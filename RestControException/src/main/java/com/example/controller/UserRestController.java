package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class UserRestController {
	
	@GetMapping("/user/{id}")
	public String userGetId(@PathVariable("id") Integer id) throws Exception  {

		if (id == 100) {
			return "Jagadesh";
		} else if (id == 101) {
			return "Smith";
		} else {
			throw new Exception("User Not Found");
		}
	}
}