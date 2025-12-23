package com.example.demo.serviceImpl;

import org.springframework.stereotype.Service;

import com.example.demo.constants.MessageConstants;
import com.example.demo.service.BikeService;

@Service
public class ShineBikeServiceImpl implements BikeService{

	@Override
	public String startBike() {
		// TODO Auto-generated method stub
		return MessageConstants.SHINE_START;
	}

	@Override
	public String driveBike() {
		// TODO Auto-generated method stub
		return MessageConstants.SHINE_DRIVE;
	}

	@Override
	public String stopBike() {
		// TODO Auto-generated method stub
		return MessageConstants.SHINE_STOP;
	}

}
