package com.healthcare.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.healthcare.models.User;
import com.healthcare.repository.UserRepository;

@Service
public class UserService implements IUserService {
	
	@Autowired private UserRepository repo;

	@Override
	public User validateUser(String userid, String password) {
		// TODO Auto-generated method stub
		System.out.println(userid);
		User user=repo.findByUserid(userid);
		System.out.println("Found "+user);
		if(user!=null && user.getPassword().equals(password)) {
			return user;
		}
		return null;
	}

	@Override
	public User addUser(User user) {
		// TODO Auto-generated method stub
		return repo.save(user);
	}

	@Override
	public User removeUser(User user) {
		// TODO Auto-generated method stub
		repo.delete(user);
		return user;
	}

}
