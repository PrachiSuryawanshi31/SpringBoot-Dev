package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Receiver;

public interface ReceiverService {
	
	void addReceiver(Receiver receiver);
	
	Receiver updateReceiver(Receiver receiver);
	
	List<Receiver> getAllReceivers();
	
	Receiver getReceiver(int receiverId);
	
	String deleteReceiver(int receiverId);
	
	String deleteAllReceivers();
}
