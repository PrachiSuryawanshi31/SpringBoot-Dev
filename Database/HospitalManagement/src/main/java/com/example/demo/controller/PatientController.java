package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Patient;
import com.example.demo.service.PatientService;

@RestController
@RequestMapping("patient")
public class PatientController {
	
	@Autowired
	PatientService patientService;

	@PostMapping("/add")
	public String addPatient(@RequestBody Patient patient)
	{
		patientService.addPatient(patient);
		return "Patient added in Database";
		
	}
	
	
	@DeleteMapping("{id}")
	public String deletePatient(@PathVariable int id)
	{
		patientService.deletePatient(id);
		return "Patient deleted  from Database";
		
	}
	
	@GetMapping("{id}")
	public Patient getPatient(@PathVariable int id)
	{
		return patientService.getPatient(id);
		
	}
	
}
