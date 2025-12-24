package com.example.demo.serviceImpl;

import org.springframework.stereotype.Service;

import com.example.demo.constants.MessageConstant;
import com.example.demo.service.FoodOrderService;

@Service
public class CloudKitchenOrderServiceImpl implements FoodOrderService {

	@Override
	public String placeOrder() {
		// TODO Auto-generated method stub
		return MessageConstant.CLOUDKITCHEN_PLACE;
	}

	@Override
	public String trackOrder() {
		// TODO Auto-generated method stub
		return MessageConstant.CLOUDKITCHEN_TRACK;
	}

	@Override
	public String cancelOrder() {
		// TODO Auto-generated method stub
		return MessageConstant.CLOUDKITCHEN_CANCEL;
	}

}
