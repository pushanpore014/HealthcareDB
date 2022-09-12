package com.healthcare.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.healthcare.dtos.TestResultDTO;
import com.healthcare.models.Appointment;
import com.healthcare.models.TestResult;
import com.healthcare.services.AppointmentService;
import com.healthcare.services.TestResultService;

@CrossOrigin
@RestController
@RequestMapping("/api/results")
public class TestResultController {
	
	@Autowired private TestResultService tservice;
	@Autowired private AppointmentService aservice;
	
	@PostMapping
	public ResponseEntity<?> saveTestResult(@RequestBody TestResultDTO dto) {
		TestResult tr=new TestResult();
		tr.setConditions(dto.getConditions());
		tr.setTestReading(dto.getTestReading());
		tr=tservice.addTestResult(tr);
		Appointment appointment=aservice.viewAppointment(dto.getAppointmentId());
		appointment.setApprovalStatus("Processed");
		appointment.setTestResult(tr);
		aservice.addAppointment(appointment);
		return ResponseEntity.ok(tr);
	}

}
