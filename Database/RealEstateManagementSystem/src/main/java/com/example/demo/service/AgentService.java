package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Agent;

public interface AgentService {
	
	
	String addAgent(Agent agent);
	
	Agent updateAgent(Agent agent);
	
	List<Agent> getAllAgents();
	
	Agent getAgent(int agentId);
	
	String deleteAgent(int agentId);
	
	String deleteAllAgents();

}
