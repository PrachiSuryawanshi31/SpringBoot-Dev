package com.example.demo.serviceImpl;

import org.springframework.stereotype.Service;

import com.example.demo.constants.MessageConstant;
import com.example.demo.service.LoanApprovalService;

@Service
public class HomeLoanApprovalServiceImpl implements LoanApprovalService {

	@Override
	public String approveLoan() {
		// TODO Auto-generated method stub
		return MessageConstant.HOME_LOAN_APPROVE;
	}

	@Override
	public String verifyDocuments() {
		// TODO Auto-generated method stub
		return MessageConstant.HOME_LOAN_VERIFIED;
	}

	@Override
	public String rejectLoan() {
		// TODO Auto-generated method stub
		return MessageConstant.HOME_LOAN_REJECTED;
	}

}
