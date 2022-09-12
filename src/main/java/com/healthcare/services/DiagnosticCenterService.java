package com.healthcare.services;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.healthcare.models.Appointment;
import com.healthcare.models.DiagnosticCenter;
import com.healthcare.models.DiagnosticTest;
import com.healthcare.repository.DiagnosticCenterRepository;

@Service
public class DiagnosticCenterService implements IDiagnosticCenterService {
	
	@Autowired private DiagnosticCenterRepository repo;

	@Override
	public DiagnosticCenter addDiagnosticCenter(DiagnosticCenter diagnosticCenter) {
		// TODO Auto-generated method stub
		return repo.save(diagnosticCenter);
	}

	@Override
	public DiagnosticCenter updateDiagnosticCenter(DiagnosticCenter diagnosticCenter) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DiagnosticCenter removeDiagnosticCenter(DiagnosticCenter diagnosticCenter) {
		// TODO Auto-generated method stub
		repo.delete(diagnosticCenter);
		return diagnosticCenter;
	}

	@Override
	public DiagnosticCenter getDiagnosticCenter(int centerId) {
		// TODO Auto-generated method stub
		return repo.getById(centerId);
	}

	@Override
	public List<DiagnosticCenter> getAllDiagnosticCenters() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public void addTestToDiagnosticCenter(int diagnosticCenterId, DiagnosticTest test) {
		// TODO Auto-generated method stub
		DiagnosticCenter dc=repo.getById(diagnosticCenterId);
		Set<DiagnosticTest> tests=dc.getTests();
		tests.add(test);
		dc.setTests(tests);
		repo.save(dc);
	}

	@Override
	public void removeTestFromDiagnosticCenter(int centerId, DiagnosticTest test) {
		// TODO Auto-generated method stub
		DiagnosticCenter dc=repo.getById(centerId);
		Set<DiagnosticTest> tests=dc.getTests();
		tests.remove(test);
		dc.setTests(tests);
		repo.save(dc);
	}

	@Override
	public List<Appointment> getListOfAppointments(int centerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<DiagnosticCenter> getDiagnosticCentersFromTest(int testId) {
		// TODO Auto-generated method stub
		return repo.findByTests_id(testId);
	}

}
