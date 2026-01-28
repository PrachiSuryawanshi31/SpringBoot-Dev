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
import com.example.demo.entity.Agent;
import com.example.demo.service.AgentService;

@RestController
@RequestMapping("agent")
public class AgentController {

	@Autowired
	AgentService agentService;
	
	@PostMapping("add")
	public String addAgent(@RequestBody Agent agent)
	{
		agentService.addAgent(agent);
		return MessageConstant.AGENT_ADDED;
		
	}
	
	@PutMapping("update")
	public Agent updateAgent(@RequestBody Agent agent)
	{
		return agentService.updateAgent(agent);
	}
	
	@GetMapping("get")
	public List<Agent> getAllAgents(@RequestBody Agent agent)
	{
		return agentService.getAllAgents();
		
	}
	
	@GetMapping("get/{agentId}")
	public Agent getAgent(@PathVariable int agentId)
	{
		return agentService.getAgent(agentId);
	}
	
	@DeleteMapping("delete")
	public String deleteAllAgents(@RequestBody Agent agent)
	{
		 agentService.deleteAllAgents();
		 return MessageConstant.AGENT_DELETED;
	}
	
	@DeleteMapping("delete/{agentId}")
	public String deleteAgent(@PathVariable int agentId)
	{
		agentService.deleteAgent(agentId);
		return MessageConstant.AGENT_DELETED;
	}
}
