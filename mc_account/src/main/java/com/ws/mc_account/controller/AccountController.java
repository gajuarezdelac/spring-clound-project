package com.ws.mc_account.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ws.mc_account.domain.Account;
import com.ws.mc_account.service.IAccountService;

@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    IAccountService service;
    	
	@GetMapping("/{id}")
	public String resetPassword(@PathVariable(value = "id") String id) {
		return "Get user by id: " + id;
	}
	
	@PostMapping("/add")
	public ResponseEntity<List<Account>> addMultipleAccounts() {
		List<Account> response = service.addAccounts();
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
	
	@GetMapping("/list")
	public ResponseEntity<List<Account>> getAccounts() {
		List<Account> response = service.getAccounts();
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
	
	
}
