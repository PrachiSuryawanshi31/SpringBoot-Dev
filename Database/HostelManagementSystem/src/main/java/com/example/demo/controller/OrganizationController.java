package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.constants.MessageConstants;
import com.example.demo.entity.Organization;
import com.example.demo.service.OrganizationService;

@RestController
@RequestMapping("org")
public class OrganizationController {
	
	@Autowired
	OrganizationService organizationService;
	
	@PostMapping("add")
	public String addOrganization(@RequestBody Organization organization )
	{
		organizationService.saveOrganization(organization);
		return MessageConstants.ADD_ORGANIZATION;	
	}
	
	@GetMapping("get/{id}")
 	Organization getOrganization(@PathVariable int id)
	{
		return organizationService.getOrganization(id);
		
	}
	
	@PutMapping("update")
	Organization updateOrganization(@RequestBody Organization organization)
	{
		return organizationService.updateOrganization(organization);
		
	}
	
	@DeleteMapping("delete/{id}")
	public String deleteOrganization(@PathVariable int id)
	{
		organizationService.deleteOrganizaltion(id);
		return MessageConstants.DELETE_ORGANIZATION;
		
	}
	
	@GetMapping("getAll")
	public List<Organization> getAllOrganization(@RequestBody Organization organization)
	{
		return organizationService.getAllOrganization(organization);
		
	}

}
