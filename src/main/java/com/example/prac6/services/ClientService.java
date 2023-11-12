package com.example.prac6.services;

import com.example.prac6.entities.Client;

import java.util.List;
import java.util.Optional;

public interface ClientService {
    Client addClient(Client client);
    List<Client> addClients(List<Client> clients);
    void deleteClientById(Integer id);
    Optional<Client> findById(Integer id);
    List<Client> findAll();

}
