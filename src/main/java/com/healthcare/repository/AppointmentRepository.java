package com.healthcare.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.healthcare.models.Appointment;
import com.healthcare.models.DiagnosticCenter;
import com.healthcare.models.Patient;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, Integer> {
	List<Appointment> findByPatient(Patient patient);
	List<Appointment> findByapprovalStatus(String status);
	List<Appointment> findByDiagnosticCenter(DiagnosticCenter center);
}
