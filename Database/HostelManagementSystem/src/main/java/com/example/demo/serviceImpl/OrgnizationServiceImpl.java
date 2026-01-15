package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Organization;
import com.example.demo.repository.OrganizationRepository;
import com.example.demo.service.OrganizationService;

@Service
public class OrgnizationServiceImpl implements OrganizationService{
	
	@Autowired
	OrganizationRepository organizationRepository;
	
	@Override
	public void saveOrganization(Organization organization) {
		// TODO Auto-generated method stub
		
		organizationRepository.save(organization);
		
	}

	@Override
	public Organization getOrganization(int id) {
		// TODO Auto-generated method stub
		
		return organizationRepository.findById(id).get();
	}

	
	@Override
	public Organization updateOrganization(Organization organization) {
		// TODO Auto-generated method stub
		
		return organizationRepository.save(organization);
	}

	
	@Override
	public void deleteOrganizaltion(int id) {
		// TODO Auto-generated method stub
		
		organizationRepository.deleteById(id);
		
	}
	

	@Override
	public List<Organization> getAllOrganization(Organization organization) {
		// TODO Auto-generated method stub
		return organizationRepository.findAll();
	}

	

}
