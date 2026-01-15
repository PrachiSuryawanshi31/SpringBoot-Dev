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

import com.example.demo.constants.MessageConstants;
import com.example.demo.entity.Room;
import com.example.demo.service.RoomService;

@RestController
@RequestMapping("room")
public class RoomController {
	
	@Autowired
	RoomService roomService;

	@PostMapping("add")
	public String addRoom(@RequestBody Room room)
	{
		roomService.saveRoom(room);
		return MessageConstants.ADD_ROOM;
		
	}
	
	@GetMapping("get/{id}")
	public Room getRoom(@PathVariable int id)
	{
		return roomService.getRoom(id);
		
	}
	
	@GetMapping("getAll")
	public List<Room> getAllRoom(@RequestBody Room room)
	{
		return roomService.getAllRoom(room);
	}
	
	@DeleteMapping("delete/{id}")
	public String deleteRoom(@PathVariable int id)
	{
		roomService.deleteRoom(id);
		return MessageConstants.DELETE_ROOM;
		
	}
	
	@DeleteMapping("deleteAll")
	public String deleteAllBy(@RequestBody Room room)
	{
		roomService.deleteAllRoom(room);
		return MessageConstants.DELETE_ALL_ROOM;
	}
}
