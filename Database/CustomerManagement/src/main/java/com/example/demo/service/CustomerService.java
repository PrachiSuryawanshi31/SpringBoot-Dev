package com.example.demo.service;

import com.example.demo.entity.Customer;


public interface CustomerService {
	
	void addCustomer(Customer customer);

	void deleteCustomer(int id );
	
    Customer getCustomer(int id);
}
