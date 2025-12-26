package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.RoomBooking;
import com.example.demo.repository.RoomBookingRepository;

@Service
public class RoomBookingServiceImpl implements RoomBookingService {

    @Autowired
    RoomBookingRepository roomBookingRepository;

    @Override
    public void addBooking(RoomBooking booking) {
        roomBookingRepository.save(booking);
    }

    @Override
    public RoomBooking getBooking(int id) {
        return roomBookingRepository.findById(id).get();
    }

 

    @Override
    public void deleteBooking(int id) {
        roomBookingRepository.deleteById(id);
    }
}
