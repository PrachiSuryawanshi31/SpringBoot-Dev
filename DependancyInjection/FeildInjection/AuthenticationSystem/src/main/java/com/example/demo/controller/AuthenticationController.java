package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.AuthenticationService;
import com.example.demo.serviceImpl.OTPAuthServiceImpl;
import com.example.demo.serviceImpl.ThirdPartyAuthServiceImpl;
import com.example.demo.serviceImpl.UsernamePassAuthServiceImpl;

@RestController
@RequestMapping("authentication")
public class AuthenticationController {

   

	@Autowired
	OTPAuthServiceImpl otpService;
	
	@Autowired
	ThirdPartyAuthServiceImpl thirdPartyService;
	
	@Autowired
	UsernamePassAuthServiceImpl usernamePassService;

	@Autowired
    AuthenticationService authenticationService;
	
	@GetMapping("{type}")
	public String authenticationService(@PathVariable String type)
	{
		
		
		switch(type)
		{
		case "otp":
			authenticationService = otpService;
			break;
			
		case "usernamepassword":
			authenticationService = usernamePassService;
			break;
			
		case "thirdparty":
			authenticationService = thirdPartyService;
			break;
			
			default:
				return "Invalid !";
		}
		
		return authenticationService.login()+" ----> "+ authenticationService.validateUser()+ "------->"+ authenticationService.logout() ;
		
	}
}
