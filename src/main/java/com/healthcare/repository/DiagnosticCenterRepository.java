package com.healthcare.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.healthcare.models.DiagnosticCenter;

@Repository
public interface DiagnosticCenterRepository extends JpaRepository<DiagnosticCenter, Integer> {

	List<DiagnosticCenter> findByTests_id(int testId);
	
}
