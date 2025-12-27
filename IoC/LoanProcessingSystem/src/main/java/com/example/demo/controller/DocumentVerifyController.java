package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.LoanApprovalService;
import com.example.demo.serviceImpl.EducationLoanApprovalServiceImpl;
import com.example.demo.serviceImpl.HomeLoanApprovalServiceImpl;
import com.example.demo.serviceImpl.PersonalLoanApprovalServiceImpl;

@RestController
@RequestMapping("loan/verify")
public class DocumentVerifyController {

	@Autowired
	ApplicationContext applicationContext;
	
	@Autowired
	LoanApprovalService loanService;

	@GetMapping("{type}")
	public String VerifyDocument(@PathVariable String type)
	{
		if(type.equals("education"))
		{
			loanService= (LoanApprovalService) applicationContext.getBean(EducationLoanApprovalServiceImpl.class);
		}
		
		else if(type.equals("home"))
		{
			loanService = (LoanApprovalService) applicationContext.getBean(HomeLoanApprovalServiceImpl.class);
		}
		
		else if(type.equals("personal"))
		{
			loanService= (LoanApprovalService) applicationContext.getBean(PersonalLoanApprovalServiceImpl.class);
		}
		
		else
		{
			return "Invalid Loan";
		}
		
		return loanService.verifyDocuments();
		
	}
}
