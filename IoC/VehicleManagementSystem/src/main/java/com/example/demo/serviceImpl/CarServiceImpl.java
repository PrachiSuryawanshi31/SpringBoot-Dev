package com.example.demo.serviceImpl;

import org.springframework.stereotype.Service;

import com.example.demo.constants.MessageConstants;
import com.example.demo.service.VehicleService;

@Service
public class CarServiceImpl implements VehicleService{

	@Override
	public String startService() {
		// TODO Auto-generated method stub
		return MessageConstants.CAR_START;
	}

	@Override
	public String stopService() {
		// TODO Auto-generated method stub
		return MessageConstants.CAR_STOP;
	}

	@Override
	public String verifyVehicle() {
		// TODO Auto-generated method stub
		return MessageConstants.CAR_VERIFIED;
	}

}
