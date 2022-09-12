package com.healthcare.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class DiagnosticCenter {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String contactNo;
	private String address;
	private String contactEmail;
	@ElementCollection
	private List<String> servicesOffered=new ArrayList<>();
	@ManyToMany
	private Set<DiagnosticTest> tests;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContactEmail() {
		return contactEmail;
	}
	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}
	public List<String> getServicesOffered() {
		return servicesOffered;
	}
	public void setServicesOffered(List<String> servicesOffered) {
		this.servicesOffered = servicesOffered;
	}
	public Set<DiagnosticTest> getTests() {
		return tests;
	}
	public void setTests(Set<DiagnosticTest> tests) {
		this.tests = tests;
	}
	@Override
	public String toString() {
		return "DiagnosticCenter [id=" + id + ", name=" + name + ", contactNo=" + contactNo + ", address=" + address
				+ ", contactEmail=" + contactEmail + ", servicesOffered=" + servicesOffered + ", tests=" + tests + "]";
	}
	
	
}
