package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Room;

public interface RoomService {
	
	void saveRoom(Room room);
	
	Room getRoom(int id);
	
	List<Room> getAllRoom(Room room);
	
	String deleteRoom(int id);

	String deleteAllRoom(Room room);
}
