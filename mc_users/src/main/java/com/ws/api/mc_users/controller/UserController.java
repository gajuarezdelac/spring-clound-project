package com.ws.api.mc_users.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {

	
	@GetMapping
	public String getAllUsers(@RequestParam(value = "page", required = false, defaultValue = "1") int page, @RequestParam(value =  "limit", required = false, defaultValue = "1") int limit) {
		return "Get user was called the page is: " + page + " limit is: " + limit ;
	}
	
	@GetMapping("/{id}")
	public String getUserByID(@PathVariable(value = "id") String id) {
		return "Get user by id: " + id;
	}
	
	@PostMapping
	public String createUser() {
		return "Create new user";
	}
	
	@PutMapping
	public String updateUser() {
		return "Update user";
	}
	
	@DeleteMapping
	public String deleteUser() {
		return "Delete user";
	}
	
	
	
}
