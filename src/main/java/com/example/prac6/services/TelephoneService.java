package com.example.prac6.services;

import com.example.prac6.entities.Telephone;

import java.util.List;
import java.util.Optional;

public interface TelephoneService {
    Telephone addTelephone(Telephone telephone);
    List<Telephone> addTelephones(List<Telephone> telephones);
    void deleteTelephoneById(Integer id);
    Optional<Telephone> findById(Integer id);
    List<Telephone> findAll();
}
