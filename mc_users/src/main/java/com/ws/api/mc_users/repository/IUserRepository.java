package com.ws.api.mc_users.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ws.api.mc_users.domain.User;

@Repository
public interface IUserRepository extends JpaRepository<User, Long>{}
