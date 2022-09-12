package com.healthcare.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.healthcare.services.PatientService;

@CrossOrigin
@RestController
@RequestMapping("/api/patients")
public class PatientController {
	
	@Autowired private PatientService pservice;
	
	@GetMapping
	public ResponseEntity<?> allPatients(){
		return ResponseEntity.ok(pservice.allPatients());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> getPatientDetails(@PathVariable("id") int id){
		return ResponseEntity.ok(pservice.viewPatient(id));
	}
	
//	@GetMapping("/profile")
//	public ResponseEntity<?> getPatientDetails(String emailId){
//		return ResponseEntity.ok(pservice.viewPatientProfile(emailId));
//	}
}
