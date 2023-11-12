package com.example.prac6.services.implementation;

import com.example.prac6.entities.WashingMachine;
import com.example.prac6.repositories.WashingMachineRepository;
import com.example.prac6.services.WashingMachineService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WashingMachineServiceImpl implements WashingMachineService {
    private final WashingMachineRepository washingMachineRepository;

    public WashingMachineServiceImpl(WashingMachineRepository washingMachineRepository) {
        this.washingMachineRepository = washingMachineRepository;
    }

    @Override
    public WashingMachine addWashingMachine(WashingMachine washingMachine) {
        return washingMachineRepository.save(washingMachine);
    }

    @Override
    public List<WashingMachine> addWashingMachines(List<WashingMachine> washingMachines) {
        return washingMachineRepository.saveAll(washingMachines);
    }

    @Override
    public void deleteWashingMachineById(Integer id) {
        washingMachineRepository.deleteById(id);
    }

    @Override
    public Optional<WashingMachine> findById(Integer id) {
        return washingMachineRepository.findById(id);
    }

    @Override
    public List<WashingMachine> findAll() {
        return washingMachineRepository.findAll();
    }
}
