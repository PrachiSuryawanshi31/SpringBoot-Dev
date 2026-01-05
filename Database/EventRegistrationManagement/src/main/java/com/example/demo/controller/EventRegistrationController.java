package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.EventRegistration;
import com.example.demo.service.EventRegistrationService;

@RestController
@RequestMapping("eventregistration")
public class EventRegistrationController {

	
    @Autowired
    EventRegistrationService eventRegistrationService;
    

    @PostMapping("/add")
    public String addRegistration(@RequestBody EventRegistration eventRegistration) {
        eventRegistrationService.addRegistration(eventRegistration);
        return "Registration Added in Database";
    }

   

    @DeleteMapping("/{id}")
    public String deleteRegistration(@PathVariable int id) {
        eventRegistrationService.deleteRegistration(id);
        return "Registration Deleted From Database";
    }
    
    
    @GetMapping("/{id}")
    public EventRegistration getRegistration(@PathVariable int id) {
        return eventRegistrationService.getRegistration(id);
    }
}
