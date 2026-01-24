package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.constant.MessageConstant;
import com.example.demo.entity.Event;
import com.example.demo.service.EventService;

@RestController
@RequestMapping("event")
public class EventController {

	@Autowired
	EventService eventService;
	
	@PostMapping("add")
	public String addEvent(@RequestBody Event event)
	{
		eventService.createEvent(event);
		return MessageConstant.CREATE_EVENT;
		
	}
	
	@PutMapping("update")
	public Event updateEvent(@RequestBody Event event)
	{
		return eventService.updateEvent(event);
		 
	}
	
	
	@GetMapping("getAll")
	public List<Event> getAllEvent(@RequestBody Event event )
	{
		return eventService.getAllEvent(event);
	}
	
	
	@GetMapping("get/{eventId}")
	public Event getEvent(@PathVariable long eventId)
	{
		return eventService.getEvent(eventId);
	}
	
	
	@DeleteMapping("delete/{eventId}")
	public String deleteEvent(@PathVariable long eventId)
	{
		eventService.deleteEvent(eventId);
		return MessageConstant.DELETE_EVENT;
	}
	
	
	@DeleteMapping("deleteAll")
	public String deleteAllEvent(@RequestBody Event event)
	{
		eventService.deleteAll(event);
		return MessageConstant.DELETE_ALL_EVENT;
	}
}
