package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.constants.MessageConstant;
import com.example.demo.entity.Appointment;
import com.example.demo.service.AppointmentService;

@RestController
@RequestMapping("appointment")
public class AppointmentController {
	
	@Autowired
	AppointmentService appointmentService;
	
	@PostMapping("add")
	public String saveAppointment(@RequestBody Appointment appointment)
	{
		 appointmentService.createAppointment(appointment);
		 return MessageConstant.ADD_APPOINTMENT;                                           
	}
	
	@GetMapping("get")
	public List<Appointment> getAllAppointments()
	{
		return appointmentService.getAllAppointment();
	}
	
	@GetMapping("get/{userId}")
	public List<Appointment> getAppoinmentByUser(@PathVariable int userId)
	{
		return appointmentService.getAppointmentByUser(userId);
	}
	
	@GetMapping("get/{provider}")
	public List<Appointment> getAppointmentByProvider(@PathVariable int providerId)
	{
		return appointmentService.getAppointmentByProvider(providerId);
	}
	
	@DeleteMapping("cancle/appointmentId")
	public String cancleAppointment(@PathVariable long appointmentId)
	{
		 appointmentService.cancleAppointment(appointmentId);
		 return MessageConstant.CANCLE_APPOINTMENT;
	}
	

}
