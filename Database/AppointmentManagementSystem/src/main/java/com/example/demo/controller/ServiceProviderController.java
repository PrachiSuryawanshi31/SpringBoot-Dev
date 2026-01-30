package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.constants.MessageConstant;
import com.example.demo.entity.ServiceProvider;
import com.example.demo.service.ServiceProviderService;

@RestController
@RequestMapping("serviceprovider")
public class ServiceProviderController {
	
	@Autowired
	ServiceProviderService serviceProviderService;
	
	@PostMapping("add")
	public String addProvider(@RequestBody ServiceProvider serviceProvider)
	{
		serviceProviderService.saveServiceProvider(serviceProvider);
		return MessageConstant.ADD_SERVICE_PROVIDER;
		
	}
	
	@GetMapping("get/{providerId}")
	public ServiceProvider getProviderById(@PathVariable int providerId)
	{
		return serviceProviderService.getServiceProvider(providerId);
		
	}
	
	@GetMapping("getAll")
	public List<ServiceProvider>  getAllProvider(@RequestBody ServiceProvider serviceProvider)
	{
		return serviceProviderService.getServiceProvider(serviceProvider);
	}
	
	@DeleteMapping("delete/{providerId}")
	String deleteServiceProvider(@PathVariable int providerId)
	{
		serviceProviderService.deleteServiceProvider(providerId) ;
		return MessageConstant.DELETE_SERVICEPROVIDER;
		
	}
	
	@DeleteMapping("delete")
	String deleteAllServiceProvider(@RequestBody ServiceProvider serviceProvider)
	{
		serviceProviderService.deleteAll(serviceProvider);
		return MessageConstant.DELETE_ALL_SERVICEPROVIDER;
		
	}
	
}
