package com.example.demo.serviceImpl;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.example.demo.constants.MessageConstants;
import com.example.demo.service.PricingStrategyService;

@Service
@Primary
public class RegularPricingStrategyServiceImpl implements PricingStrategyService {

	@Override
	public String calculatePrice() {
		// TODO Auto-generated method stub
		return MessageConstants.REGULAR_CALCULATE;
	}

	@Override
	public String getDiscountDetails() {
		// TODO Auto-generated method stub
		return MessageConstants.REGULAR_DISCOUNT;
	}

	@Override
	public String getFinalAmount() {
		// TODO Auto-generated method stub
		return MessageConstants.REGULAR_FINAL;
	}

}
