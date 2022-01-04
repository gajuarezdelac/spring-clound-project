package com.ws.mc_account.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.ws.mc_account.domain.Account;

@Component
public interface IAccountService {
 
	List<Account> addAccounts();

	List<Account> getAccounts();
	
}
