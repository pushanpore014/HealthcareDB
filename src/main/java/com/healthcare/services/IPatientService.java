package com.healthcare.services;

import java.util.List;

import com.healthcare.models.Patient;
import com.healthcare.models.TestResult;

public interface IPatientService {

	Patient registerPatient(Patient patient);
	Patient updatePatientDetails(Patient patient);
	Patient viewPatient(int patientId);
	Patient viewPatientProfile(String emailId);
	List<TestResult> getAllTestResult(int patientId);
	TestResult viewTestResult(int testResultId);
	List<Patient> allPatients();
	
}
