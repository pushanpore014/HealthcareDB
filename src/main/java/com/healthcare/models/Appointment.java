package com.healthcare.models;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Appointment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private LocalDate appointmentDate;
	private String approvalStatus;
	@ManyToOne
	@JoinColumn(name="test_id")
	private DiagnosticTest diagnosticTest;
	@ManyToOne
	@JoinColumn(name="patient_id")
	private Patient patient;
	@ManyToOne
	@JoinColumn(name="diagnostic_center_id")
	private DiagnosticCenter diagnosticCenter;
	@ManyToOne
	@JoinColumn(name="result_id")
	private TestResult testResult;
	
	public Appointment() {
		this.approvalStatus="Pending";
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public LocalDate getAppointmentDate() {
		return appointmentDate;
	}
	public void setAppointmentDate(LocalDate appointmentDate) {
		this.appointmentDate = appointmentDate;
	}
	public String getApprovalStatus() {
		return approvalStatus;
	}
	public void setApprovalStatus(String approvalStatus) {
		this.approvalStatus = approvalStatus;
	}
	public Patient getPatient() {
		return patient;
	}
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	public DiagnosticCenter getDiagnosticCenter() {
		return diagnosticCenter;
	}
	public void setDiagnosticCenter(DiagnosticCenter diagnosticCenter) {
		this.diagnosticCenter = diagnosticCenter;
	}

	public DiagnosticTest getDiagnosticTest() {
		return diagnosticTest;
	}

	public void setDiagnosticTest(DiagnosticTest diagnosticTest) {
		this.diagnosticTest = diagnosticTest;
	}

	public TestResult getTestResult() {
		return testResult;
	}

	public void setTestResult(TestResult testResult) {
		this.testResult = testResult;
	}
}