package com.healthcare.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.healthcare.models.Patient;
import com.healthcare.models.TestResult;
import com.healthcare.repository.PatientRepository;

@Service
public class PatientService implements IPatientService {
	
	@Autowired private PatientRepository repo;

	@Override
	public Patient registerPatient(Patient patient) {
		// TODO Auto-generated method stub
		return repo.save(patient);
	}

	@Override
	public Patient updatePatientDetails(Patient patient) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Patient viewPatient(int patientId) {
		// TODO Auto-generated method stub
		return repo.getById(patientId);
	}

	@Override
	public List<TestResult> getAllTestResult(int patientId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TestResult viewTestResult(int testResultId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Patient> allPatients() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Patient viewPatientProfile(String emailId) {
		// TODO Auto-generated method stub
		return repo.findByEmailId(emailId);
	}

}
