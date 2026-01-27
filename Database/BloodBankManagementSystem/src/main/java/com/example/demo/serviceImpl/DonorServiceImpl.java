package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Donor;
import com.example.demo.repository.DonorRepository;
import com.example.demo.service.DonorService;

@Service
public class DonorServiceImpl  implements DonorService{

	@Autowired
	DonorRepository donorRepository;
	
	@Override
	public void addDonor(Donor donor) {
		// TODO Auto-generated method stub
		donorRepository.save(donor);
		
	}

	@Override
	public Donor updateAllDonor(Donor donor) {
		// TODO Auto-generated method stub
		return donorRepository.save(donor);
	}


	@Override
	public List<Donor> getAllDonors(Donor donor) {
		// TODO Auto-generated method stub
		return donorRepository.findAll();
	}

	@Override
	public Donor getDonor(int donorId) {
		// TODO Auto-generated method stub
		return donorRepository.findById(donorId).get();
	}

	@Override
	public String deleteDonor(int donorId) {
		// TODO Auto-generated method stub
		donorRepository.deleteById(donorId);
		return null;
	}

	@Override
	public String deleteAllDonors() {
		// TODO Auto-generated method stub
		donorRepository.deleteAll();
		return null;
		
	}
	

}
