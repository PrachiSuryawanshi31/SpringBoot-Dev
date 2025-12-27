package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Patient;
import com.example.demo.repository.PatientRepository;

@Service
public class PatientServiceImpl implements PatientService{

	@Autowired
	PatientRepository patientRepository;
	
	@Override
	public void addPatient(Patient patient) {
		// TODO Auto-generated method stub
		patientRepository.save(patient);
		
	}

	@Override
	public void deletePatient(int id) {
		// TODO Auto-generated method stub
		patientRepository.deleteById(id);
		
	}

	@Override
	public Patient getPatient(int id) {
		// TODO Auto-generated method stub
		return  patientRepository.findById(id).get();
		
		}

}
