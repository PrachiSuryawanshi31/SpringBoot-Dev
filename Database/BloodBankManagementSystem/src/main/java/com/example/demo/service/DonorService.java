package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Donor;

public interface DonorService {
	
	void addDonor(Donor donor);
	
	Donor updateAllDonor(Donor donor);
	
	List<Donor> getAllDonors(Donor donor);
	
	Donor getDonor(int donorId);
	
	String deleteDonor(int donorId);
	
	String deleteAllDonors();

}
