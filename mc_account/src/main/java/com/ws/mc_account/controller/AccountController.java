package com.ws.mc_account.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
public class AccountController {

	@GetMapping("/{id}")
	public String resetPassword(@PathVariable(value = "id") String id) {
		return "Get user by id: " + id;
	}
	
	

	
}
