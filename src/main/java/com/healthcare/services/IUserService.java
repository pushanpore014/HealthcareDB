package com.healthcare.services;

import com.healthcare.models.User;

public interface IUserService {

	User validateUser(String username,String password);
	User addUser(User user);
	User removeUser(User user);
	
}
