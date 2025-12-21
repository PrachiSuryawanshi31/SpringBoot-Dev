package com.example.demo.factory;

import com.example.demo.service.MediaService;
import com.example.demo.serviceImpl.AudioMediaServiceImpl;
import com.example.demo.serviceImpl.LiveStreamMediaServiceImpl;
import com.example.demo.serviceImpl.VedioMediaServiceImpl;

public class MediaFactory {

	public static MediaService createObject(String type)
	{
		if(type.equals("vedio"))
		{
			return new VedioMediaServiceImpl();
		}
		
		if(type.equals("audio"))
		{
			return new AudioMediaServiceImpl();
		}
		
		if(type.equals("live"))
		{
			return new LiveStreamMediaServiceImpl();
		}
		
		return null;
		
	}
}
