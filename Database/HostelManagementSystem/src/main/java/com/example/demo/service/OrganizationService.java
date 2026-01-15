package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Organization;

public interface OrganizationService {
	
	void saveOrganization(Organization organization);
	
	
	Organization getOrganization(int id);
	
	
	Organization updateOrganization(Organization organization);
	
	
	List<Organization> getAllOrganization(Organization organization);
	
	
	void deleteOrganizaltion(int id);
	
	

}
