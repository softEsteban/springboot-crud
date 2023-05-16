package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Client;
import com.example.demo.service.ClientService;

@RestController
@RequestMapping(path = "api/v1/clients")
public class ClientController {
	
	@Autowired
	private ClientService clientService;
		
	@GetMapping
	public List<Client> getAll(){
		return clientService.getClients();
	}
	
	@GetMapping("/{clientId}")
	public Optional<Client> getById(@PathVariable("clientId") Integer clientId){
		return clientService.getClient(clientId);
	}
	
	@PostMapping
	public void saveUpdate(@RequestBody Client client){
		clientService.saveOrUpdate(client);
	}
	
	@DeleteMapping("/{clientId}")
	public void delete(@PathVariable("clientId") Integer clientId){
		clientService.delete(clientId);
	}
	
	
}
