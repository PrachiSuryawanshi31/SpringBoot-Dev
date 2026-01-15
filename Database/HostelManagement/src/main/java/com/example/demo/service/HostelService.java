package com.example.demo.service;

import com.example.demo.entity.Hostel;

public interface HostelService {
	
	void addHostelStudent(Hostel hostel);

	void deleteHostelStudent(int id);
	
	Hostel getHostelStudent(int id);

	
}
