package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.PricingStrategySystemApplication;
import com.example.demo.service.PricingStrategyService;
import com.example.demo.serviceImpl.FestivalPricingStrategyServiceImpl;
import com.example.demo.serviceImpl.PremiumPricingStrategyServiceImpl;
import com.example.demo.serviceImpl.RegularPricingStrategyServiceImpl;

@RestController
@RequestMapping("price")
public class PriceStrategyController {

    private final PricingStrategySystemApplication pricingStrategySystemApplication;

	
	private FestivalPricingStrategyServiceImpl festivelService;
	private PremiumPricingStrategyServiceImpl premiunService;
	private RegularPricingStrategyServiceImpl regularService;

	
	//Constructor Injection
	public PriceStrategyController(FestivalPricingStrategyServiceImpl festivalservice, 
									PremiumPricingStrategyServiceImpl premiunService,
									RegularPricingStrategyServiceImpl regularService, PricingStrategySystemApplication pricingStrategySystemApplication) {
		// TODO Auto-generated constructor stub
		this.festivelService =festivalservice;
		this.premiunService =premiunService;
		this.regularService =regularService;
		this.pricingStrategySystemApplication = pricingStrategySystemApplication;
		
	}
	
	@GetMapping("{type}")
	public String priceManagement(@PathVariable String type)
	{
		 PricingStrategyService priceService;
		
		 
		 switch(type)
		 {
		 case "festival":
			 priceService = festivelService;
			 break;
			 
		 case "regular":
			 priceService = regularService;
			 break;
			 
		 case "premium":
			 priceService = premiunService;
			 break;
			 
			 default:
				 return "Invalid " +type;
		 }
		 
		return priceService.calculatePrice()+ "------"+priceService.getDiscountDetails()
											 +"---"+priceService.getFinalAmount();
		
	}
	
	
}
