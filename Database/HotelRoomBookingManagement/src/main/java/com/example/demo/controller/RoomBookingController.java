package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.RoomBooking;
import com.example.demo.service.RoomBookingService;

@RestController
@RequestMapping("booking")
public class RoomBookingController {

    @Autowired
    RoomBookingService roomBookingService;

    @PostMapping("/add")
    public String addBooking(@RequestBody RoomBooking booking) {
        roomBookingService.addBooking(booking);
        return "Room Booking Added in DataBase";
    }

    @GetMapping("/{id}")
    public RoomBooking getBooking(@PathVariable int id) {
        return roomBookingService.getBooking(id);
    }

    @DeleteMapping("/{id}")
    public String deleteBooking(@PathVariable int id) {
        roomBookingService.deleteBooking(id);
        return "Booking Deleted from Database";
    }
}
