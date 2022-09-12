package com.healthcare.services;

import java.util.List;

import com.healthcare.models.Patient;
import com.healthcare.models.TestResult;

public interface ITestResultService {

	TestResult addTestResult(TestResult testResult);
	TestResult updateTestResult(TestResult testResult);
	TestResult removeTestResult(TestResult testResult);
	List<TestResult> viewResultsByPatient(Patient patient);
	
}
