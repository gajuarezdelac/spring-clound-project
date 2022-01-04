package com.ws.api.mc_users.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ws.api.mc_users.domain.User;
import com.ws.api.mc_users.domain.UserDTO;
import com.ws.api.mc_users.service.IUserService;

@RestController
@RequestMapping("user")
public class UserController {
	
	@Autowired
	IUserService service;

	@Autowired
	public Environment env;
	
	@GetMapping
	public String getAllUsers(@RequestParam(value = "page", required = false, defaultValue = "1") int page, @RequestParam(value =  "limit", required = false, defaultValue = "1") int limit) {
		return "User microservice user running in the port: " + env.getProperty("local.server.port");
	}
	
	@GetMapping("/list")
	public ResponseEntity<List<User>> getUsers(){
		List<User> response = service.getUsers();
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
	
	
	@GetMapping("/{id}")
	public String getUserByID(@PathVariable(value = "id") String id) {
		return "Get user by id: " + id;
	}
	
	@PostMapping
	public ResponseEntity<User> createUser(@RequestBody UserDTO user) {
		User response = service.createUser(user);
		return new ResponseEntity<>(response, HttpStatus.OK);
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
