package com.healthcare.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.healthcare.models.Appointment;
import com.healthcare.models.Patient;
import com.healthcare.models.TestResult;
import com.healthcare.repository.TestResultRepository;

@Service
public class TestResultService implements ITestResultService {
	
	@Autowired private TestResultRepository repo;
	@Autowired private AppointmentService aservice;

	@Override
	public TestResult addTestResult(TestResult testResult) {
		return repo.saveAndFlush(testResult);
	}

	@Override
	public TestResult updateTestResult(TestResult testResult) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TestResult removeTestResult(TestResult testResult) {
		// TODO Auto-generated method stub
		repo.delete(testResult);
		return testResult;
	}

	@Override
	public List<TestResult> viewResultsByPatient(Patient patient) {
		// TODO Auto-generated method stub
		return null;
	}

}
