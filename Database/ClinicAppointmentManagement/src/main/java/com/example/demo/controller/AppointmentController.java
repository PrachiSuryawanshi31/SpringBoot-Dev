package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.Appointment;
import com.example.demo.service.AppointmentService;

@RestController
@RequestMapping("appointment")
public class AppointmentController {

    @Autowired
    AppointmentService appointmentService;

    @PostMapping("/add")
    public String addAppointment(@RequestBody Appointment appointment) {
        appointmentService.addAppointment(appointment);
        return "Appointment Added in database";
    }

    

    @DeleteMapping("/{id}")
    public String deleteAppointment(@PathVariable int id) {
        appointmentService.deleteAppointment(id);
        return "Appointment deleted from database";
    }
    
    @GetMapping("/{id}")
    public Appointment getAppointment(@PathVariable int id) {
        return appointmentService.getAppointment(id);
    }
}
