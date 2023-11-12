package com.example.prac6.services;

import com.example.prac6.entities.WashingMachine;

import java.util.List;
import java.util.Optional;

public interface WashingMachineService {
    WashingMachine addWashingMachine(WashingMachine washingMachine);
    List<WashingMachine> addWashingMachines(List<WashingMachine> washingMachines);
    void deleteWashingMachineById(Integer id);
    Optional<WashingMachine> findById(Integer id);
    List<WashingMachine> findAll();
}
