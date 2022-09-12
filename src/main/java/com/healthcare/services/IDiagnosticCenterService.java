package com.healthcare.services;

import java.util.List;

import com.healthcare.models.Appointment;
import com.healthcare.models.DiagnosticCenter;
import com.healthcare.models.DiagnosticTest;

public interface IDiagnosticCenterService {

	DiagnosticCenter addDiagnosticCenter(DiagnosticCenter diagnosticCenter);
	DiagnosticCenter updateDiagnosticCenter(DiagnosticCenter diagnosticCenter);
	DiagnosticCenter removeDiagnosticCenter(DiagnosticCenter diagnosticCenter);
	DiagnosticCenter getDiagnosticCenter(int centerId);
	List<DiagnosticCenter> getAllDiagnosticCenters();
	
	List<DiagnosticCenter> getDiagnosticCentersFromTest(int testId);
	
	void addTestToDiagnosticCenter(int diagnosticCenterId,DiagnosticTest test);
	void removeTestFromDiagnosticCenter(int centerId,DiagnosticTest test);
	
	List<Appointment> getListOfAppointments(int centerId);
}
