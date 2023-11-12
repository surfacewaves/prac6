package com.example.prac6.services.implementation;

import com.example.prac6.entities.Telephone;
import com.example.prac6.repositories.TelephoneRepository;
import com.example.prac6.services.TelephoneService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TelephoneServiceImpl implements TelephoneService {
    private final TelephoneRepository telephoneRepository;

    public TelephoneServiceImpl(TelephoneRepository telephoneRepository) {
        this.telephoneRepository = telephoneRepository;
    }

    @Override
    public Telephone addTelephone(Telephone telephone) {
        return telephoneRepository.save(telephone);
    }

    @Override
    public List<Telephone> addTelephones(List<Telephone> telephones) {
        return telephoneRepository.saveAll(telephones);
    }

    @Override
    public void deleteTelephoneById(Integer id) {
        telephoneRepository.deleteById(id);
    }

    @Override
    public Optional<Telephone> findById(Integer id) {
        return telephoneRepository.findById(id);
    }

    @Override
    public List<Telephone> findAll() {
        return telephoneRepository.findAll();
    }
}
