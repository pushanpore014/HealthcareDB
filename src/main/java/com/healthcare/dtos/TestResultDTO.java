package com.healthcare.dtos;

public class TestResultDTO {

	private int appointmentId;
	private double testReading;
	private String conditions;

	public double getTestReading() {
		return testReading;
	}

	public void setTestReading(double testReading) {
		this.testReading = testReading;
	}

	public String getConditions() {
		return conditions;
	}

	public void setConditions(String conditions) {
		this.conditions = conditions;
	}

	public int getAppointmentId() {
		return appointmentId;
	}

	public void setAppointmentId(int appointmentId) {
		this.appointmentId = appointmentId;
	}

	@Override
	public String toString() {
		return "TestResultDTO [appointmentId=" + appointmentId + ", testReading=" + testReading + ", conditions="
				+ conditions + "]";
	}
	
	
	
}
