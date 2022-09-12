package com.healthcare.controllers;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.healthcare.dtos.RegisterDTO;
import com.healthcare.models.Patient;
import com.healthcare.models.User;
import com.healthcare.services.PatientService;
import com.healthcare.services.UserService;

@CrossOrigin
@RestController
@RequestMapping("/api/users")
public class UserController {
	
	@Autowired private UserService uservice;
	@Autowired private PatientService pservice;
	
	@PostMapping("/validate")
	public ResponseEntity<?> validateUser(@RequestBody User dto) {
		System.out.println(dto);
		User user=uservice.validateUser(dto.getUserid(),dto.getPassword());
		if(user!=null)
			return ResponseEntity.ok(user);
		else
			return ResponseEntity.badRequest().body("Invalid username or password");
	}
	
	@PostMapping("/register")
	public ResponseEntity<?> registerUser(@RequestBody RegisterDTO dto) {
		Patient patient=new Patient();
		BeanUtils.copyProperties(dto, patient);
		pservice.registerPatient(patient);
		User user=new User();
		user.setUsername(dto.getName());
		user.setPassword(dto.getPassword());
		user.setUserid(dto.getEmailId());
		User response=uservice.addUser(user);
		return ResponseEntity.ok(response);
	}

}
