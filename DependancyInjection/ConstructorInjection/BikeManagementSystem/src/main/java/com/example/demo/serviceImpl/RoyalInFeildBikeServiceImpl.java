package com.example.demo.serviceImpl;

import org.springframework.stereotype.Service;

import com.example.demo.constants.MessageConstants;
import com.example.demo.service.BikeService;

@Service
public class RoyalInFeildBikeServiceImpl implements BikeService{

	@Override
	public String startBike() {
		// TODO Auto-generated method stub
		return MessageConstants.ROYALINFEILD_START;
	}

	@Override
	public String driveBike() {
		// TODO Auto-generated method stub
		return MessageConstants.ROYALINFEILD__DRIVE;
	}

	@Override
	public String stopBike() {
		// TODO Auto-generated method stub
		return MessageConstants.ROYALINFEILD__STOP;
	}

}
