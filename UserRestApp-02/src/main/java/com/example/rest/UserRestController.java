package com.example.rest;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.binding.User;

@RestController
public class UserRestController {

	Map<Integer, User> map = new HashMap<>();

	//Preprocessing happens here
	@PostMapping("/save")
	public ResponseEntity<String> save(@RequestBody User user) {
		//System.out.println(user);
		map.put(user.getId(), user);
		return new ResponseEntity<String>("User Saved", HttpStatus.CREATED);
	}
	
//	@GetMapping("/user")
//	public User getData(@RequestParam("id") Integer id) {
//		User user=map.get(id);
//		System.out.println(user);
//		return user;
//	}
	
	//postprocessing happens here
	@GetMapping("/user/{id}/data")
	public User getData(@PathVariable Integer id) {
		User user=map.get(id);
		return user;
	}
}
