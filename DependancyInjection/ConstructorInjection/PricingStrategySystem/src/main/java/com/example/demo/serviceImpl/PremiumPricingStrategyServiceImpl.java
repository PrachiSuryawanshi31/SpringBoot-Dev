package com.example.demo.serviceImpl;

import org.springframework.stereotype.Service;

import com.example.demo.constants.MessageConstants;
import com.example.demo.service.PricingStrategyService;

@Service
public class PremiumPricingStrategyServiceImpl implements PricingStrategyService{

	@Override
	public String calculatePrice() {
		// TODO Auto-generated method stub
		return MessageConstants.PREMIUM_CALCULATE;
	}

	@Override
	public String getDiscountDetails() {
		// TODO Auto-generated method stub
		return MessageConstants.PREMIUM_DISCOUNT;
	}

	@Override
	public String getFinalAmount() {
		// TODO Auto-generated method stub
		return MessageConstants.PREMIUM_FINAL;
	}

}
