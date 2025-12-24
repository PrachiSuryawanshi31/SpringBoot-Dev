package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.ChatService;
import com.example.demo.serviceImpl.InstaChatService;
import com.example.demo.serviceImpl.TelegramChatService;
import com.example.demo.serviceImpl.WhatsAppChatServiceImpl;

@RestController
@RequestMapping("chat")
public class ChatController {
	
	
	//Feild Injection
	
	@Autowired
	InstaChatService instaChatService;
	
	@Autowired
	TelegramChatService telegramChatService;
	
	@Autowired
	WhatsAppChatServiceImpl whatsAppChatService;
	
	@Autowired
	ChatService chatService;
	
	@GetMapping("{type}")
	public String ChatHandler(@PathVariable String type)
	{
		
		switch(type)
		{
		case "insta":
			chatService = instaChatService;
			break;
			
		case "whatsapp":
			chatService = whatsAppChatService;
			break;
			
		case "telegram":
			chatService = telegramChatService;
		}
		
		return chatService.sendMessage()+"-----" + chatService.receiveMessage()
				                        +"-------"+chatService.deleteMessage();
		
	}

}
