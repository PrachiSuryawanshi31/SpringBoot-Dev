package com.example.demo.serviceImpl;

import org.springframework.stereotype.Service;

import com.example.demo.constant.MessageConstants;
import com.example.demo.service.ChatService;

@Service
public class WhatsAppChatServiceImpl implements ChatService{

	@Override
	public String sendMessage() {
		// TODO Auto-generated method stub
		return MessageConstants.WHATSAPP_SEND_MESSAGE;
	}

	@Override
	public String receiveMessage() {
		// TODO Auto-generated method stub
		return MessageConstants.WHATSAPP_RECEIVE_MESSAGE;
	}

	@Override
	public String deleteMessage() {
		// TODO Auto-generated method stub
		return MessageConstants.WHATSAPP_DELETE_MESSAGE;
	}

}
