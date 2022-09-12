package com.healthcare.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.healthcare.models.User;
import com.healthcare.repository.UserRepository;

@Service
public class AdminService implements IAdminService {
	
	@Autowired private UserRepository repo;

	@Override
	public void registerAdmin(String userid,String username, String password) {
		// TODO Auto-generated method stub
		if(repo.findByUserid(userid)==null) {
			User user=new User();
			user.setUserid(userid);
			user.setUsername(username);
			user.setPassword(password);
			user.setRole("Admin");		
			repo.save(user);
		}
	}

}
