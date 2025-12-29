package com.example.demo.serviceImpl;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.example.demo.constants.MessageConstants;
import com.example.demo.service.VehicleService;

@Service
@Primary
public class JeepServiceImpl implements VehicleService{

	@Override
	public String startService() {
		// TODO Auto-generated method stub
		return MessageConstants.JEEP_START;
	}

	@Override
	public String stopService() {
		// TODO Auto-generated method stub
		return MessageConstants.JEEP_STOP;
	}

	@Override
	public String verifyVehicle() {
		// TODO Auto-generated method stub
		return MessageConstants.JEEP_VERIFIED;
	}

}
