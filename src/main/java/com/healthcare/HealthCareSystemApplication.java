package com.healthcare;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.healthcare.services.IAdminService;

@SpringBootApplication
public class HealthCareSystemApplication {
	
	private static final Logger log = LoggerFactory.getLogger(HealthCareSystemApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(HealthCareSystemApplication.class, args);
	}
	
}
