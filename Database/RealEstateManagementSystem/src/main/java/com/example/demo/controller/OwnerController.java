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

import com.example.demo.constant.MessageConstant;
import com.example.demo.entity.Owner;
import com.example.demo.service.OwnerService;

@RestController
@RequestMapping("owner")
public class OwnerController {
	
	@Autowired
	OwnerService ownerService;
	
	@PostMapping("add")
	public String addOwner(@RequestBody Owner owner)
	{
		ownerService.addOwner(owner);
		return MessageConstant.OWNER_ADD;
	}
	
	@PutMapping("update")
	public Owner updateOwner(@RequestBody Owner owner)
	{
		 ownerService.updateOwner(owner);
		 return null;
	}
	
	@GetMapping("get")
	public List<Owner> getAllOwners(@RequestBody Owner owner)
	{
		return ownerService.getAllOwner(owner);
		 
	}
	
	@GetMapping("get/{ownerId}")
	public Owner getOwner(@PathVariable int ownerId)
	{
		return ownerService.getOwner(ownerId);
		
	}
	
	@DeleteMapping("delete")
	public String  deleteAllOwner(@RequestBody Owner owner)
	{
		ownerService.deleteAllOwner();
		return MessageConstant.OWNER_ALL_DELETED;
		
	}
	
	@DeleteMapping("delete/{ownerId}")
	public String deleteOwner(@PathVariable int ownerId)
	{
		ownerService.deleteOwner(ownerId);
		return MessageConstant.OWNER_ALL_DELETED;
		
	}

}
