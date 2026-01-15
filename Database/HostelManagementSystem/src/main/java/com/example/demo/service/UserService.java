package com.example.demo.service;

import java.util.List;


import com.example.demo.entity.User;

public interface UserService {

	void saveUser(User user);
	
	User getUser(int id);
	
	List<User> getAll(User user);
	
	void deleteUser(int id);
	
	void deleteAll(User user);
}
