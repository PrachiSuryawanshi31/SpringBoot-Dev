package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Appointment;

@Service
public interface AppointmentService {
	
	Appointment createAppointment(Appointment appointment);
	
	String cancleAppointment(long appointmentId);
	
	List<Appointment> getAllAppointment();
	
	List<Appointment> getAppointmentByUser(int userId);
	
	List<Appointment> getAppointmentByProvider(int providerId);

	void cancleAppointment(Long appointmentId);
}
