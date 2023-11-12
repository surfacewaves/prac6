package com.example.prac6.controllers;

import com.example.prac6.entities.WashingMachine;
import com.example.prac6.services.WashingMachineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class WashingMachineController {
    private final WashingMachineService washingMachineService;

    @Autowired
    public WashingMachineController(WashingMachineService washingMachineService) {
        this.washingMachineService = washingMachineService;
    }

    @GetMapping("/washingMachine")
    public List<WashingMachine> getWashingMachines(){
        return washingMachineService.findAll();
    }
    @GetMapping("/washingMachine/{washingMachineId}")
    public Optional<WashingMachine> getWashingMachineById(@PathVariable("washingMachineId") Integer id){
        return washingMachineService.findById(id);
    }
    @DeleteMapping("/washingMachine")
    public void deleteWashingMachine(@RequestParam Integer id){
        washingMachineService.deleteWashingMachineById(id);
    }

    @PostMapping("/washingMachine")
    public void addBook(@RequestParam WashingMachine washingMachine){
        washingMachineService.addWashingMachine(washingMachine);
    }
}
