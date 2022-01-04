package com.ws.mc_account.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ws.mc_account.domain.Account;
import com.ws.mc_account.repository.IAccountRepository;
import com.ws.mc_account.service.IAccountService;

@Service
@Transactional
public class AccountServiceImpl implements IAccountService{

	@Autowired
	IAccountRepository accountRepository;
	
	@Override
	public List<Account> addAccounts() {
		
		List<Account> list = new ArrayList<>();
		
		for(int i = 0; i <= 100; i++) {
			
			Account element = new Account();
			element.setTypeAccount(UUID.randomUUID() + "_" + i);
			element.setDescription("Descripción de apoyo " + i);
			list.add(element);
		}
		
		accountRepository.saveAll(list);
		return list;
	}

	@Override
	public List<Account> getAccounts() {
		return accountRepository.findAll();
	}
	
}
