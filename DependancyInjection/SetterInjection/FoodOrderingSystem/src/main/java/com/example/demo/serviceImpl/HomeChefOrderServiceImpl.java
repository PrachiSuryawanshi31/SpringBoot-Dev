package com.example.demo.serviceImpl;

import org.springframework.stereotype.Service;

import com.example.demo.constants.MessageConstant;
import com.example.demo.service.FoodOrderService;

@Service
public class HomeChefOrderServiceImpl  implements FoodOrderService{

	@Override
	public String placeOrder() {
		// TODO Auto-generated method stub
		return MessageConstant.HOMECHEF_PLACE;
	}

	@Override
	public String trackOrder() {
		// TODO Auto-generated method stub
		return MessageConstant.HOMECHEF_TRACK;
	}

	@Override
	public String cancelOrder() {
		// TODO Auto-generated method stub
		return MessageConstant.HOMECHEF_CANCEL;
	}

}
