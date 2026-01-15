package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Room;
import com.example.demo.repository.RoomRepository;
import com.example.demo.service.RoomService;

@Service
public class RoomServiceImpl implements RoomService{
	
	@Autowired
	RoomRepository roomRepository;

	@Override
	public void saveRoom(Room room) {
		// TODO Auto-generated method stub
		roomRepository.save(room);
		
	}

	@Override
	public Room getRoom(int id) {
		// TODO Auto-generated method stub
		return roomRepository.findById(id).get();
	}

	@Override
	public List<Room> getAllRoom(Room room) {
		// TODO Auto-generated method stub
		return roomRepository.findAll();
	}

	@Override
	public String deleteRoom(int id) {
		// TODO Auto-generated method stub
		roomRepository.deleteById(id);
		return null;
		
	}


	@Override
	public String deleteAllRoom(Room room) {
		// TODO Auto-generated method stub
		roomRepository.deleteAll();
		return null;
	}

	
}
