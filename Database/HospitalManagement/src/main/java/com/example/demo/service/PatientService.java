package com.example.demo.service;

import com.example.demo.entity.Patient;

public interface PatientService {
	
	void addPatient(Patient patient);
	
	void deletePatient(int id);
	
	Patient getPatient(int id);
	
	

}
