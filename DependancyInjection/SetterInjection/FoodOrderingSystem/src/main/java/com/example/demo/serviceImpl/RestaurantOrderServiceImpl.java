package com.example.demo.serviceImpl;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.example.demo.constants.MessageConstant;
import com.example.demo.service.FoodOrderService;

@Service
@Primary
public class RestaurantOrderServiceImpl implements FoodOrderService {

	@Override
	public String placeOrder() {
		// TODO Auto-generated method stub
		return MessageConstant.RESTAURANT_PLACE;
	}

	@Override
	public String trackOrder() {
		// TODO Auto-generated method stub
		return MessageConstant.RESTAURANT_TRACK;
	}

	@Override
	public String cancelOrder() {
		// TODO Auto-generated method stub
		return MessageConstant.RESTAURANT_CANCEL;
	}

}
