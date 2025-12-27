package com.example.demo.service;


import com.example.demo.entity.Doctor;

public interface DoctorService {

	void addDoctor(Doctor doctor);
	
	void deleteDoctor(int id);

	Doctor getDoctor( int id);
	
	
}
