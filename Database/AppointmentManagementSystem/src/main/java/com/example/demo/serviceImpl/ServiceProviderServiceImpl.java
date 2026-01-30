package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.ServiceProvider;
import com.example.demo.repository.ServiceProviderRepository;
import com.example.demo.service.ServiceProviderService;

@Service
public class ServiceProviderServiceImpl  implements ServiceProviderService{
	
	@Autowired
	ServiceProviderRepository serviceProviderRepository;

	@Override
	public void saveServiceProvider(ServiceProvider serviceProvide) {
		// TODO Auto-generated method stub
		serviceProviderRepository.save(serviceProvide);
	}

	@Override
	public ServiceProvider getServiceProvider(int providerId) {
		// TODO Auto-generated method stub
		return serviceProviderRepository.findById(providerId).get();
	}

	@Override
	public List<ServiceProvider> getServiceProvider(ServiceProvider serviceProvider) {
		// TODO Auto-generated method stub
		return serviceProviderRepository.findAll();
	}
	
	@Override
	public void deleteServiceProvider(int providerId) {
		// TODO Auto-generated method stub
		serviceProviderRepository.deleteById(providerId);
		
	}

	@Override
	public void deleteAll(ServiceProvider serviceProvider) {
		// TODO Auto-generated method stub
		serviceProviderRepository.deleteAll();
	}

	
}
