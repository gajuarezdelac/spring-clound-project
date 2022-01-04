package com.ws.api.mc_users.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.ws.api.mc_users.domain.User;
import com.ws.api.mc_users.domain.UserDTO;

@Component
public interface IUserService {

	User createUser(UserDTO user);
	
	User findUserByEmail(String email);
	
	User updateUser(UserDTO user);
	
	List<User> getUsers();
	
}
