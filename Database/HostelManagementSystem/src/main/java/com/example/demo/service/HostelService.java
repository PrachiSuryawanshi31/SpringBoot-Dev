package com.example.demo.service;

import java.util.List;


import com.example.demo.entity.Hostel;

public interface HostelService {
	
	void saveHostel(Hostel hostel);
	
	Hostel getHostel(int id);
	
	 List<Hostel> getHostel(Hostel hostel);
	
	Hostel updateHostel(Hostel hostel);
	
	void deleteHostel(int id);
	
	String deleteAllHostel(Hostel hostel);
}
