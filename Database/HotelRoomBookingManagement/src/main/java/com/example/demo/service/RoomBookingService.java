package com.example.demo.service;

import com.example.demo.entity.RoomBooking;

public interface RoomBookingService {

    void addBooking(RoomBooking booking);

    RoomBooking getBooking(int id);


    void deleteBooking(int id);
}
