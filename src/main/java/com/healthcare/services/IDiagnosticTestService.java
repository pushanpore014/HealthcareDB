package com.healthcare.services;

import java.util.List;

import com.healthcare.models.DiagnosticTest;

public interface IDiagnosticTestService {

	DiagnosticTest addTest(DiagnosticTest test);
	DiagnosticTest updateTest(DiagnosticTest test);
	DiagnosticTest removeTest(DiagnosticTest test);
	DiagnosticTest viewById(int testId);
	List<DiagnosticTest> getAllTests();
	List<DiagnosticTest> getTestsOfDiagnosticCenters(int centerId);
	List<DiagnosticTest> viewAllTest(String criteria);	

	
}
