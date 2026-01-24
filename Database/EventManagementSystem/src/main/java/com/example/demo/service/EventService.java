package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Event;

public interface EventService {
	
	String  createEvent(Event event);
	
	Event updateEvent(Event event);
	
	List<Event> getAllEvent(Event event);
	
	Event getEvent(long eventId);
	
	String deleteEvent(long eventId);
	
	String deleteAll(Event event);
}
