package com.healthcare.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.healthcare.models.DiagnosticTest;
import com.healthcare.repository.DiagnosticTestRepository;

@Service
public class DiagnosticTestService implements IDiagnosticTestService {
	
	@Autowired private DiagnosticTestRepository repo;

	@Override
	public DiagnosticTest addTest(DiagnosticTest test) {
		// TODO Auto-generated method stub
		return repo.save(test);
	}

	@Override
	public DiagnosticTest updateTest(DiagnosticTest test) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DiagnosticTest removeTest(DiagnosticTest test) {
		// TODO Auto-generated method stub
		repo.delete(test);
		return test;
	}

	@Override
	public List<DiagnosticTest> getAllTests() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public List<DiagnosticTest> getTestsOfDiagnosticCenters(int centerId) {
		// TODO Auto-generated method stub
		return repo.findByDiagnosticCenters_id(centerId);
	}

	@Override
	public List<DiagnosticTest> viewAllTest(String criteria) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DiagnosticTest viewById(int testId) {
		// TODO Auto-generated method stub
		return repo.getById(testId);
	}
	
	

}
