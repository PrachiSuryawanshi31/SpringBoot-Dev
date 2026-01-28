package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Agent;
import com.example.demo.repository.AgentRepository;
import com.example.demo.service.AgentService;

@Service
public class AgentServiceImpl implements AgentService{

	@Autowired
	AgentRepository agentRepository;
	
	@Override
	public String addAgent(Agent agent) {
		// TODO Auto-generated method stub
		agentRepository.save(agent);
		return null;
	}

	@Override
	public Agent updateAgent(Agent agent) {
		// TODO Auto-generated method stub
		return agentRepository.save(agent);
	}

	@Override
	public List<Agent> getAllAgents() {
		// TODO Auto-generated method stub
		return agentRepository.findAll();
	}

	@Override
	public Agent getAgent(int agentId) {
		// TODO Auto-generated method stub
		return agentRepository.findById(agentId).get();
	}

	@Override
	public String deleteAgent(int agentId) {
		// TODO Auto-generated method stub
		agentRepository.deleteById(agentId);
		return null;
	}

	@Override
	public String deleteAllAgents() {
		// TODO Auto-generated method stub
		agentRepository.deleteAll();
		return null;
	}

}
