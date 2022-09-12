package com.healthcare.models;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class DiagnosticTest {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(unique = true)
	private String testName;
	private double testPrice;
	private String normalValue;
	private String units;
	@ManyToMany
	private Set<DiagnosticCenter> diagnosticCenters;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTestName() {
		return testName;
	}
	public void setTestName(String testName) {
		this.testName = testName;
	}
	public double getTestPrice() {
		return testPrice;
	}
	public void setTestPrice(double testPrice) {
		this.testPrice = testPrice;
	}
	public String getNormalValue() {
		return normalValue;
	}
	public void setNormalValue(String normalValue) {
		this.normalValue = normalValue;
	}
	public String getUnits() {
		return units;
	}
	public void setUnits(String units) {
		this.units = units;
	}
	public Set<DiagnosticCenter> getDiagnosticCenters() {
		return diagnosticCenters;
	}
	public void setDiagnosticCenters(Set<DiagnosticCenter> diagnosticCenters) {
		this.diagnosticCenters = diagnosticCenters;
	}
	
	
}
