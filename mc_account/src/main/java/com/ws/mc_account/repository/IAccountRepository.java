package com.ws.mc_account.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ws.mc_account.domain.Account;

@Repository
public interface IAccountRepository extends JpaRepository<Account, Long>  {}
