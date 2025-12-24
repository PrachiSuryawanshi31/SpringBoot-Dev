package com.example.demo.serviceImpl;

import org.springframework.stereotype.Service;

import com.example.demo.constants.MessageConstants;
import com.example.demo.service.DeliveryService;

@Service
public class ThirdPartyDeliveryServiceImpl implements DeliveryService{

	@Override
	public String assignPattner() {
		// TODO Auto-generated method stub
		return MessageConstants.THIRD_PARTY_ASSIGN;
	}

	@Override
	public String trackDelivery() {
		// TODO Auto-generated method stub
		return MessageConstants.THIRD_PARTY_TRACK;
	}

	@Override
	public String cancelDelivery() {
		// TODO Auto-generated method stub
		return MessageConstants.THIRD_PARTY_CANCEL;
	}

}
