package com.healthcare.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class TestResult {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private double testReading;
	private String conditions;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getTestReading() {
		return testReading;
	}
	public void setTestReading(double testReading) {
		this.testReading = testReading;
	}
	public String getConditions() {
		return conditions;
	}
	public void setConditions(String condition) {
		this.conditions = condition;
	}

	@Override
	public String toString() {
		return "TestResult [id=" + id + ", testReading=" + testReading + ", condition=" + conditions + ", appointment="
				 + "]";
	}
	
	
}
