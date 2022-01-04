package com.ws.api.mc_users.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.ws.api.mc_users.domain.User;
import com.ws.api.mc_users.domain.UserDTO;
import com.ws.api.mc_users.repository.IUserRepository;
import com.ws.api.mc_users.service.IUserService;

@Transactional
@Service
public class UserServiceImpl implements IUserService{
		
	/* Repositorio que nos permite realizar consulas de SQL */
	@Autowired
	IUserRepository repository;

	@Override
	public User createUser(UserDTO user) {
		User entity = new User();
		entity.setEmail(user.getEmail());
		entity.setName(user.getName());
		entity.setSurnames(user.getSurnames());
		entity.setPassword(user.getPassword());
		entity.setSurnames(entity.getSurnames());
		repository.save(entity);
		return entity;
	}

	@Override
	public User findUserByEmail(String email) {
		return null;
	}

	@Override
	public User updateUser(UserDTO user) {
	
		return null;
	}

	@Override
	public List<User> getUsers() {
		return repository.findAll();
	}
	
}
