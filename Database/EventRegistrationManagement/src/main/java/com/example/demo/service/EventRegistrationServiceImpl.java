package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.EventRegistration;
import com.example.demo.repository.EventRegistrationRepository;

@Service
public class EventRegistrationServiceImpl implements EventRegistrationService {
 
	@Autowired
	EventRegistrationRepository eventRegistrationRepository;
	
	@Override
	public void addRegistration(EventRegistration eventRegistration) {
		// TODO Auto-generated method stub
		eventRegistrationRepository.save(eventRegistration);
		
	}

	@Override
	public EventRegistration getRegistration(int id) {
		// TODO Auto-generated method stub
		return eventRegistrationRepository.findById(id).get();
	}

	@Override
	public void deleteRegistration(int id) {
		// TODO Auto-generated method stub
		eventRegistrationRepository.deleteById(id);
	}

}
