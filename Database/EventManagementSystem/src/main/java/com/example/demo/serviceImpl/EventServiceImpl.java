package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.EventRepository;
import com.example.demo.entity.Event;
import com.example.demo.service.EventService;

@Service
public class EventServiceImpl implements EventService{

	@Autowired
	EventRepository eventRepository;	
	
	@Override
	public String createEvent(Event event) {
		// TODO Auto-generated method stub
		eventRepository.save(event);
		return null;
		
	}

	@Override
	public Event updateEvent(Event event) {
		// TODO Auto-generated method stub
		return eventRepository.save(event);
	}

	@Override
	public List<Event> getAllEvent(Event event) {
		// TODO Auto-generated method stub
		return eventRepository.findAll();
	}

	@Override
	public Event getEvent(long eventId) {
		// TODO Auto-generated method stub
		return eventRepository.findById(eventId).get();
	}

	@Override
	public String deleteEvent(long eventId) {
		// TODO Auto-generated method stub
		 eventRepository.deleteById(eventId);
		 return null;
	}

	@Override
	public String deleteAll(Event event) {
		// TODO Auto-generated method stub
		eventRepository.deleteAll();
		return null;
	}
	
	

	

}
