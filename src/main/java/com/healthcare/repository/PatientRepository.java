package com.healthcare.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.healthcare.models.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Integer> {
	
	Patient findByEmailId(String emailId);

}
