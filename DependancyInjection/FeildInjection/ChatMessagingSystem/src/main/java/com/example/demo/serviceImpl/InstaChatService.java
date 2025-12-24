package com.example.demo.serviceImpl;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.example.demo.constant.MessageConstants;
import com.example.demo.service.ChatService;

@Service
@Primary
public class InstaChatService implements ChatService {

	@Override
	public String sendMessage() {
		// TODO Auto-generated method stub
		return MessageConstants.INSTA_SEND_MESSAGE;
	}

	@Override
	public String receiveMessage() {
		// TODO Auto-generated method stub
		return MessageConstants.INSTA_RECEIVE_MESSAGE;
	}

	@Override
	public String deleteMessage() {
		// TODO Auto-generated method stub
		return MessageConstants.INSTA_DELETE_MESSAGE;
	}

}
