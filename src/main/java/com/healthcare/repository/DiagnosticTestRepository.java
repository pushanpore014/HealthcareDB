package com.healthcare.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.healthcare.models.DiagnosticTest;

@Repository
public interface DiagnosticTestRepository extends JpaRepository<DiagnosticTest, Integer> {

	List<DiagnosticTest> findByDiagnosticCenters_id(int centerId);
}
