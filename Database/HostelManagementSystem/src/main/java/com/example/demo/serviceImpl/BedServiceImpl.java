package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Bed;
import com.example.demo.repository.BedRepository;
import com.example.demo.service.BedService;


@Service
public class BedServiceImpl implements BedService{

	@Autowired
	BedRepository bedRepository;
	
	@Override
	public void saveBed(Bed bed) {
		// TODO Auto-generated method stub
		bedRepository.save(bed);
		
	}

	@Override
	public Bed getBed(int id) {
		// TODO Auto-generated method stub
		return bedRepository.findById(id).get();
	}

	@Override
	public List<Bed> getAll(Bed bed) {
		// TODO Auto-generated method stub
		return bedRepository.findAll();
	}

	@Override
	public void deleteBed(int id) {
		// TODO Auto-generated method stub
		bedRepository.deleteById(id);
	}

	@Override
	public void deleteAll(Bed bed) {
		// TODO Auto-generated method stub
		bedRepository.deleteAll();
		
	}

}