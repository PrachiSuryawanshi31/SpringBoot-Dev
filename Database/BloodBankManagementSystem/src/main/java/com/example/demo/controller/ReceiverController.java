package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.constant.MessageConstant;
import com.example.demo.entity.Receiver;
import com.example.demo.service.ReceiverService;

@RestController
@RequestMapping("receiver")
public class ReceiverController {
	
	@Autowired
	ReceiverService receiverService;
	
	@PostMapping("add")
	public String addReceiver(@RequestBody Receiver receiver)
	{
		receiverService.addReceiver(receiver);
		return MessageConstant.ALL_RECEIVER_DELETE;	
	}
	
	@PutMapping("update")
	public Receiver updateReceiver(@RequestBody Receiver receiver)
	{
		return receiverService.updateReceiver(receiver);
		
	}
	
	@GetMapping("get")
	public List<Receiver> getAllReceiver()
	{
		return receiverService.getAllReceivers();
		
	}
	
	@GetMapping("get/{receiverId}")
	public Receiver getReceiver(@PathVariable int receiverId)
	{
		return receiverService.getReceiver(receiverId);
		
	}
	
	@DeleteMapping("delete")
	public String deleteAllReceivers(@RequestBody Receiver receiver)
	{
		receiverService.deleteAllReceivers();
		return MessageConstant.ALL_RECEIVER_DELETE;	
	}
	
	@DeleteMapping("delete/{receiverId}")
	public String deleteReceiver(@PathVariable int receiverId)
	{
		receiverService.deleteReceiver(receiverId);
		return MessageConstant.RECEIVER_DELETE;
		
	}
}
