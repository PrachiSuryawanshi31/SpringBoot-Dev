package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.DeliverySystemApplication;
import com.example.demo.service.DeliveryService;
import com.example.demo.serviceImpl.ExpressDeliveryServiceImpl;
import com.example.demo.serviceImpl.LocalDeliveryServiceImpl;
import com.example.demo.serviceImpl.ThirdPartyDeliveryServiceImpl;

@RestController
@RequestMapping("delivery")
public class DeliveryController {

    
	
	private DeliveryService deliveryService;
	private LocalDeliveryServiceImpl localDeliveryService;
	private ThirdPartyDeliveryServiceImpl thirdPartyDeliveryService;
	private ExpressDeliveryServiceImpl expreeDeliveryService;

	//Setter Injection

	@Autowired
	void setDeliveryService(DeliveryService deliveryService)
	{
		this.deliveryService = deliveryService;
	}

	@Autowired
	void setLocalDelivery(LocalDeliveryServiceImpl localDeliveryService)
	{
		this.localDeliveryService = localDeliveryService; 
	}
	
	@Autowired
	void setThirdParty(ThirdPartyDeliveryServiceImpl thirdPartyDeliveryService)
	{
		this.thirdPartyDeliveryService = thirdPartyDeliveryService;
	}
	
	@Autowired
	void setExpressDelivery(ExpressDeliveryServiceImpl expressDeliveryService)
	{
		this.expreeDeliveryService = expressDeliveryService;
	}

	
	@GetMapping("{type}")
	public String handleDeliveryAction(@PathVariable String type)
	{
		
		switch(type)
		{
		case "express":
			deliveryService = expreeDeliveryService;
			break;
			
		case "local":
			deliveryService = localDeliveryService;
			break;
			
		case "thirdparty":
			deliveryService = thirdPartyDeliveryService;
			break;
			
			default:
				return "Invalid   "+type;
		}
		
		return deliveryService.assignPattner() + "------>"+deliveryService.trackDelivery() 
												+ "------>" +deliveryService.cancelDelivery();
		
	}
	
	
}
