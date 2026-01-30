package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.ServiceProvider;

public interface ServiceProviderService {
	
	
	void saveServiceProvider(ServiceProvider serviceProvide);
	
	ServiceProvider getServiceProvider(int providerId);
	
	List<ServiceProvider> getServiceProvider(ServiceProvider serviceProvider);
	
	void deleteServiceProvider(int providerId);
	
	 void deleteAll(ServiceProvider serviceProvider);
	 
}
