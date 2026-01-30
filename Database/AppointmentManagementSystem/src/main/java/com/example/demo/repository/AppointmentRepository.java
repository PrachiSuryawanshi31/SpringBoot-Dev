package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Appointment;

public interface AppointmentRepository extends JpaRepository<Appointment, Long>{

	List<Appointment> findByUserId(int userId);
	List<Appointment> findByProviderId(int providerId);
	
}
