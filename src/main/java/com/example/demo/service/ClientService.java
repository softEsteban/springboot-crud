package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Client;
import com.example.demo.repository.ClientRepository;

@Service
public class ClientService {
	
	@Autowired
	ClientRepository clientRepository;
	
	
	public List<Client> getClients(){
		return clientRepository.findAll();
	}
	
	public Optional<Client> getClient(Integer id){
		return clientRepository.findById(id);
	}
	
	public void saveOrUpdate(Client client) {
		clientRepository.save(client);
	}
	
	public void delete(Integer id) {
		clientRepository.deleteById(id);
	}
	
	
}
