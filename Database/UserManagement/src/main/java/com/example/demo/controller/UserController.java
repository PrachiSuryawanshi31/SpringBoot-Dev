package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.constants.MessageConstant;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;

@RestController
@RequestMapping("user")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@PostMapping("add")
	public String addUser(@RequestBody User user)
	{
		userService.SaveUser(user);
		return MessageConstant.ADD_USER;
	}
	
	@GetMapping("get/{id}")
	User getUser(@PathVariable int id)
	{
		return userService.getUser(id);
		
	}
	
	@GetMapping("getAll")
	List<User> getAllUser(@RequestBody User user)
	{
		return userService.getAll(user);
	}
	
	@DeleteMapping("delete/{id}")
	String deleteUser(@PathVariable int id)
	{
		userService.deleteUser(id);
		return MessageConstant.DELETE_USER;
		
	}
	
	@DeleteMapping("deleteAll")
	String deleteAllUser(@RequestBody User user)
	{
		userService.deleteAll(user);
		return MessageConstant.DELETE_ALL_USER;
		
	}
}
