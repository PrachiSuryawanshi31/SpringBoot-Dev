package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Owner;

public interface OwnerService {

	void addOwner(Owner owner);
	
	void updateOwner(Owner owner);
	
	List<Owner> getAllOwner(Owner owner);
	
	Owner getOwner(int ownerId);
	
	void deleteAllOwner();
	
	void deleteOwner(int ownerId);
}
