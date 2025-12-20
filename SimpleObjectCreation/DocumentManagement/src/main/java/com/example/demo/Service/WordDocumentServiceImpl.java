package com.example.demo.Service;

public class WordDocumentServiceImpl implements DocumentService{

	@Override
	public void readData() {
		// TODO Auto-generated method stub
		System.out.println("read data form database ");
		
	}

	@Override
	public void processData() {
		// TODO Auto-generated method stub
		System.out.println("Process data for pdf");
		
	}

	@Override
	public String printData() {
		// TODO Auto-generated method stub
		return "Word";
	}

}
