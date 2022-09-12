package com.healthcare.services;

import java.util.List;

import com.healthcare.models.Appointment;

public interface IAppointmentService {

	Appointment addAppointment(Appointment appointment);
	List<Appointment> viewAppointments(int patientId);
	Appointment viewAppointment(int appointmentId);
	Appointment updateAppointment(Appointment appointment);
	Appointment removeAppointment(Appointment appointment);
	List<Appointment> viewAllAppointments();
}
