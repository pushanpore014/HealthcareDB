package com.healthcare.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.healthcare.models.Appointment;
import com.healthcare.repository.AppointmentRepository;

@Service
public class AppointmentService implements IAppointmentService {

	@Autowired private AppointmentRepository repo;
	@Autowired private PatientService psrv;
	
	@Override
	public Appointment addAppointment(Appointment appointment) {
		// TODO Auto-generated method stub
		return repo.save(appointment);
	}

	@Override
	public List<Appointment> viewAppointments(int patientId) {
		// TODO Auto-generated method stub
		return repo.findByPatient(psrv.viewPatient(patientId));
	}

	@Override
	public Appointment viewAppointment(int appointmentId) {
		// TODO Auto-generated method stub
		return repo.getById(appointmentId);
	}

	@Override
	public Appointment updateAppointment(Appointment appointment) {
		// TODO Auto-generated method stub
		return repo.save(appointment);
	}

	@Override
	public Appointment removeAppointment(Appointment appointment) {
		// TODO Auto-generated method stub
		repo.delete(appointment);
		return null;
	}

	@Override
	public List<Appointment> viewAllAppointments() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

}
