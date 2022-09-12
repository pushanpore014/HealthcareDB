package com.healthcare.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.healthcare.dtos.AppointmentDTO;
import com.healthcare.models.Appointment;
import com.healthcare.services.AppointmentService;
import com.healthcare.services.DiagnosticCenterService;
import com.healthcare.services.DiagnosticTestService;
import com.healthcare.services.PatientService;

@CrossOrigin
@RestController
@RequestMapping("/api/appointments")
public class AppointmentController {
	@Autowired private AppointmentService aservice;
	@Autowired private PatientService pservice;
	@Autowired private DiagnosticTestService dtservice;
	@Autowired private DiagnosticCenterService dcservice;
	
	@PostMapping
	public ResponseEntity<?> bookAppointment(@RequestBody AppointmentDTO test) {
		System.out.println(test);
		Appointment apt=new Appointment();
		apt.setPatient(pservice.viewPatient(test.getPatientId()));
		apt.setAppointmentDate(test.getAppointmentDate());
		apt.setDiagnosticCenter(dcservice.getDiagnosticCenter(test.getCenterId()));
		apt.setDiagnosticTest(dtservice.viewById(test.getTestId()));
		aservice.addAppointment(apt);
		return ResponseEntity.ok(test);
	}
	
	@PutMapping("{id}")
	public ResponseEntity<?> updateStatus(@PathVariable("id") int appointmentId,@RequestBody String status){
		Appointment appointment=aservice.viewAppointment(appointmentId);
		appointment.setApprovalStatus(status);
		return ResponseEntity.ok(aservice.updateAppointment(appointment));
	} 
	
	@GetMapping
	public ResponseEntity<?> listAll(){
		return ResponseEntity.ok(aservice.viewAllAppointments());
	}
	
	@GetMapping("{id}")
	public ResponseEntity<?> findById(@PathVariable("id") int appointmentId){
		return ResponseEntity.ok(aservice.viewAppointment(appointmentId));
	}
	
	@GetMapping("patient/{id}")
	public ResponseEntity<?> findAllBypatientId(@PathVariable("id") int patientId){
		return ResponseEntity.ok(aservice.viewAppointments(patientId));
	}
}
