package com.healthcare.dtos;

import com.healthcare.models.Appointment;

public class AppointmentDTO extends Appointment {

	private int centerId;
	private int testId;
	private int patientId;
	
	
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public int getCenterId() {
		return centerId;
	}
	public void setCenterId(int centerId) {
		this.centerId = centerId;
	}
	public int getTestId() {
		return testId;
	}
	public void setTestId(int testId) {
		this.testId = testId;
	}
	@Override
	public String toString() {
		return "AppointmentDTO [centerId=" + centerId + ", testId=" + testId + ", patientId=" + patientId + "]";
	}
	
	
}
