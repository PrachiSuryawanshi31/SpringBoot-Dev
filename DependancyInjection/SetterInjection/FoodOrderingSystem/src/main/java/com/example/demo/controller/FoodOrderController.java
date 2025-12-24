package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.FoodOrderService;
import com.example.demo.serviceImpl.CloudKitchenOrderServiceImpl;
import com.example.demo.serviceImpl.HomeChefOrderServiceImpl;
import com.example.demo.serviceImpl.RestaurantOrderServiceImpl;

@RestController
@RequestMapping("foodorder")
public class FoodOrderController {
	
	
	//CloudKitchenOrderServiceImpl cloudKitchenOrderServiceImpl;
	
	private CloudKitchenOrderServiceImpl cloudKitchenService;
	private HomeChefOrderServiceImpl homeChefService;
	private RestaurantOrderServiceImpl restaurantService;
	private FoodOrderService foodOrderService;
	
	
	@Autowired
	public void setFoodOrder(FoodOrderService foodOrderService)
	{
		this.foodOrderService = foodOrderService;
	}
	

	@Autowired
	public void setCloudKitcheService(CloudKitchenOrderServiceImpl cloudKitchenService)
	{
		this.cloudKitchenService =cloudKitchenService;
	}
	
	@Autowired
	public void setHomeChefService(HomeChefOrderServiceImpl homeChefService)
	{
		this.homeChefService=homeChefService;
	}
	
	@Autowired
	public void setRestaurantService(RestaurantOrderServiceImpl restaurantService)
	{
		this.restaurantService = restaurantService;
	}
	
	
	
	@GetMapping("{type}")
	public String orderPhases(@PathVariable String type)
	{
		
		switch(type)
		{
		
		case "restaurant":
			foodOrderService = restaurantService;
			break;
			
		case "homechef":
			foodOrderService = homeChefService;
			break;
			
		case "cloudkitchen":
			foodOrderService = cloudKitchenService;
		}
		
		return foodOrderService.placeOrder() +"----------------" + foodOrderService.trackOrder() + "-------------" +foodOrderService.cancelOrder();
		
	}

}
