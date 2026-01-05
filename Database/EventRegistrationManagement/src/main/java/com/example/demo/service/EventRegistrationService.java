package com.example.demo.service;



import com.example.demo.entity.EventRegistration;

public interface EventRegistrationService {

	
	void addRegistration( EventRegistration eventRegistration);

    EventRegistration getRegistration(int id);


    void deleteRegistration(int id);
}
