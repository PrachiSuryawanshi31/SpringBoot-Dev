package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Owner;
import com.example.demo.repository.OwnerRepository;
import com.example.demo.service.OwnerService;

@Service
public class OwnerServiceImpl implements OwnerService {
	
	@Autowired
	OwnerRepository ownerRepository;

	@Override
	public void addOwner(Owner owner) {
		// TODO Auto-generated method stub
		ownerRepository.save(owner);
	}

	@Override
	public void updateOwner(Owner owner) {
		// TODO Auto-generated method stub
		ownerRepository.save(owner);
		
	}

	@Override
	public List<Owner> getAllOwner(Owner owner) {
		// TODO Auto-generated method stub
		return ownerRepository.findAll();
	}

	@Override
	public Owner getOwner(int ownerId) {
		// TODO Auto-generated method stub
		return ownerRepository.findById(ownerId).get();
	}

	@Override
	public void deleteAllOwner() {
		// TODO Auto-generated method stub
		ownerRepository.deleteAll();
		
	}

	@Override
	public void deleteOwner(int ownerId) {
		// TODO Auto-generated method stub
		ownerRepository.deleteById(ownerId);
		
	}

}
