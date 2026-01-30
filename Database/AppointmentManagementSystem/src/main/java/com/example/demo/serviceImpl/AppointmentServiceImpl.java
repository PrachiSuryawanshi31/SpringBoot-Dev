package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Appointment;
import com.example.demo.repository.AppointmentRepository;
import com.example.demo.service.AppointmentService;

@Service
public class AppointmentServiceImpl implements AppointmentService {

    @Autowired
    private AppointmentRepository appointmentRepository;

    @Override
    public Appointment createAppointment(Appointment appointment) {
        return appointmentRepository.save(appointment);
    }

    @Override
    public void cancleAppointment(Long appointmentId) {
        appointmentRepository.deleteById(appointmentId);
    }

    @Override
    public List<Appointment> getAllAppointment() {
        return appointmentRepository.findAll();
    }

    @Override
    public List<Appointment> getAppointmentByUser(int userId) {
        return appointmentRepository.findByUserId(userId);
    }

    @Override
    public List<Appointment> getAppointmentByProvider(int providerId) {
        return appointmentRepository.findByProviderId(providerId);
    }

	@Override
	public String cancleAppointment(long appointmentId) {
		// TODO Auto-generated method stub
		return null;
	}
}
