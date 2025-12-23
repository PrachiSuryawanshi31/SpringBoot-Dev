package com.example.demo.serviceImpl;

import org.springframework.stereotype.Service;

import com.example.demo.constants.MessageConstants;
import com.example.demo.service.BikeService;

@Service
public class UnicornBikeServiceImpl implements BikeService{

	@Override
	public String startBike() {
		// TODO Auto-generated method stub
		return MessageConstants.UNICORN_START;
	}

	@Override
	public String driveBike() {
		// TODO Auto-generated method stub
		return MessageConstants.UNICORN_DRIVE;
	}

	@Override
	public String stopBike() {
		// TODO Auto-generated method stub
		return MessageConstants.UNICORN_STOP;
	}

}
