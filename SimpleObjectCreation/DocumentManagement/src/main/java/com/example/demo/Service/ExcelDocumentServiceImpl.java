package com.example.demo.Service;

public class ExcelDocumentServiceImpl implements DocumentService {

	@Override
	public void readData() {
		// TODO Auto-generated method stub
		System.out.println("Read data form database");
		
	}

	@Override
	public void processData() {
		// TODO Auto-generated method stub
		System.out.println("Process data for the pdf");
		
	}

	@Override
	public String printData() {
		// TODO Auto-generated method stub
		return "Excel";
	}

}
