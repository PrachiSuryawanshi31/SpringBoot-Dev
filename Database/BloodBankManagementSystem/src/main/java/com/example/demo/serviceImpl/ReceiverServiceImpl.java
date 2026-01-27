package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Receiver;
import com.example.demo.repository.ReceiverRepository;
import com.example.demo.service.ReceiverService;

@Service
public class ReceiverServiceImpl implements ReceiverService{
	
	@Autowired
	ReceiverRepository receiverRepository;

	@Override
	public void addReceiver(Receiver receiver) {
		// TODO Auto-generated method stub
		receiverRepository.save(receiver);
		
	}

	@Override
	public Receiver updateReceiver(Receiver receiver) {
		// TODO Auto-generated method stub
		return receiverRepository.save(receiver);
	}

	@Override
	public List<Receiver> getAllReceivers() {
		// TODO Auto-generated method stub
		return receiverRepository.findAll();
	}

	@Override
	public Receiver getReceiver(int receiverId) {
		// TODO Auto-generated method stub
		return receiverRepository.findById(receiverId).get();
	}

	@Override
	public String deleteReceiver(int receiverId) {
		// TODO Auto-generated method stub
		receiverRepository.deleteById(receiverId);
		return null;
	}

	@Override
	public String deleteAllReceivers() {
		// TODO Auto-generated method stub
		receiverRepository.deleteAll();
		return null;
	}
	
	
}
