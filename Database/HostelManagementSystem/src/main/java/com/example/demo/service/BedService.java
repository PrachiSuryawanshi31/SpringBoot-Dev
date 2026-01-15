package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Bed;

public interface BedService {

	
	void saveBed(Bed bed);
	
	Bed getBed(int id);

	List<Bed> getAll(Bed bed);
	
	void deleteBed(int id);
	
	void deleteAll(Bed bed);
}