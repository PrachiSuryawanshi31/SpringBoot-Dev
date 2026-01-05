package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Customer;
import com.example.demo.repository.CustomerRepository;

@RestController
@RequestMapping("customer")
public class CustomerController {
	
	@Autowired
	CustomerRepository customerRepository;

	@PostMapping("add")
	public String addCustomer( Customer customer)
	{
		customerRepository.save(  customer);
		return "Customer is added";
	}
	
	@DeleteMapping("{id}")
	public String deleteCustomer(@RequestBody int id)
	{
		customerRepository.deleteById(id);
		return "Customer delete from the database";
		
	}
	
	@GetMapping("{id}")
	Customer  getCustomer(@RequestBody int id)
	{
		return customerRepository.findById(id).get();
	}
	
}
