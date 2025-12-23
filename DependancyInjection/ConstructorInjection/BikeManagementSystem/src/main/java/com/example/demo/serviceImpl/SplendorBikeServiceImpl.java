package com.example.demo.serviceImpl;

import org.springframework.stereotype.Service;

import com.example.demo.constants.MessageConstants;
import com.example.demo.service.BikeService;

@Service
public class SplendorBikeServiceImpl implements BikeService{

	@Override
	public String startBike() {
		// TODO Auto-generated method stub
		return MessageConstants.SPLENDOR_START;
	}

	@Override
	public String driveBike() {
		// TODO Auto-generated method stub
		return MessageConstants.SPLENDOR_DRIVE;
	}

	@Override
	public String stopBike() {
		// TODO Auto-generated method stub
		return MessageConstants.SPLENDOR_STOP;
	}

}
