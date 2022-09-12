package com.healthcare.dtos;

import com.healthcare.models.Patient;

public class RegisterDTO extends Patient {

	private String password;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
