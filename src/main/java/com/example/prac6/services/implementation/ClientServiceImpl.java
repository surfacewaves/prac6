package com.example.prac6.services.implementation;

import com.example.prac6.entities.Client;
import com.example.prac6.repositories.ClientRepository;
import com.example.prac6.services.CartService;
import com.example.prac6.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientServiceImpl implements ClientService {
    private final ClientRepository clientRepository;
    private final CartService cartService;

    @Autowired
    public ClientServiceImpl(ClientRepository clientRepository, CartService cartService) {
        this.clientRepository = clientRepository;
        this.cartService = cartService;
    }

    @Override
    public Client addClient(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public List<Client> addClients(List<Client> clients) {
        return clientRepository.saveAll(clients);
    }

    @Override
    public void deleteClientById(Integer id) {
        clientRepository.deleteById(id);
    }

    @Override
    public Optional<Client> findById(Integer id) {
        return clientRepository.findById(id);
    }

    @Override
    public List<Client> findAll() {
        return clientRepository.findAll();
    }
}
