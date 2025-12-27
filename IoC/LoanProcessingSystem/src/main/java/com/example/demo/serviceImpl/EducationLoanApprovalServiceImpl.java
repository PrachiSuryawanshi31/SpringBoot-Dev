package com.example.demo.serviceImpl;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.example.demo.constants.MessageConstant;
import com.example.demo.service.LoanApprovalService;

@Service
@Primary
public class EducationLoanApprovalServiceImpl implements LoanApprovalService{

	@Override
	public String approveLoan() {
		// TODO Auto-generated method stub
		return MessageConstant.EDU_LOAN_APPROVE;
	}

	@Override
	public String verifyDocuments() {
		// TODO Auto-generated method stub
		return MessageConstant.EDU_LOAN_VERIFIED;
	}

	@Override
	public String rejectLoan() {
		// TODO Auto-generated method stub
		return MessageConstant.EDU_LOAN_REJECTED;
	}

}
