package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.BikeService;
import com.example.demo.serviceImpl.RoyalInFeildBikeServiceImpl;
import com.example.demo.serviceImpl.ShineBikeServiceImpl;
import com.example.demo.serviceImpl.SplendorBikeServiceImpl;
import com.example.demo.serviceImpl.UnicornBikeServiceImpl;

@RestController
@RequestMapping("bike")
public class BikeController {

   
	private UnicornBikeServiceImpl unicornService;
	private ShineBikeServiceImpl shineService;
	private RoyalInFeildBikeServiceImpl royalInFeildService;
	private SplendorBikeServiceImpl splendorService;

	/**Constructor Dependency Injection (DI)* is a way to provide dependencies to a class using its constructor.
	Spring injects required objects at the time of object creation.
	It ensures dependencies are mandatory and available from the start.
	Constructor DI improves code readability, immutability, and testability.
	It is the *recommended approach* in Spring applications.*/
	
	
	BikeController(UnicornBikeServiceImpl unicornService ,
					ShineBikeServiceImpl shineService,
					SplendorBikeServiceImpl splendorService,
					RoyalInFeildBikeServiceImpl royalInFeildService)
	{
		
		this.unicornService = unicornService;
		this.shineService = shineService;
		this.royalInFeildService = royalInFeildService;
		this.splendorService = splendorService;
	}
	
	
	
	
	
	@GetMapping("{type}")
	public String showBikePhases(@PathVariable String type)
	{
		BikeService bikeService = null ;
		
		switch(type)
		{
		case "unicorn":
			bikeService = unicornService;
			break;
			
		case "shine":
			bikeService = shineService;
			break;
		
		case "splendor":
			bikeService = splendorService;
			break;
			
		case "royalinfeild" :
			bikeService = royalInFeildService;
			break;
			
			default:
				return "Invalid "+type;
					
		}

		return bikeService.startBike() + " --------->>>>" + bikeService.driveBike() + " --------->>>>"  + bikeService.stopBike();
		
	}
}
