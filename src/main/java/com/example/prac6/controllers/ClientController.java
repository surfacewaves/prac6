package com.example.prac6.controllers;

import com.example.prac6.entities.Client;
import com.example.prac6.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ClientController {
    private final ClientService clientService;

    @Autowired
    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping("/client")
    public List<Client> getClients(){
        return clientService.findAll();
    }
    @GetMapping("/client/{clientId}")
    public Optional<Client> getClientById(@PathVariable("clientId") Integer id){
        return clientService.findById(id);
    }
    @DeleteMapping("/client")
    public void deleteClient(@RequestParam Integer id){
        clientService.deleteClientById(id);
    }

    @PostMapping("/client")
    public void addClient(@RequestBody Client client){
        clientService.addClient(client);
    }
}
