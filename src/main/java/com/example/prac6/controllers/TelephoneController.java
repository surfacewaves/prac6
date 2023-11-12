package com.example.prac6.controllers;

import com.example.prac6.entities.Telephone;
import com.example.prac6.services.TelephoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class TelephoneController {
    private final TelephoneService telephoneService;

    @Autowired
    public TelephoneController(TelephoneService telephoneService) {
        this.telephoneService = telephoneService;
    }

    @GetMapping("/telephone")
    public List<Telephone> getTelephone(){
        return telephoneService.findAll();
    }
    @GetMapping("/telephone/{telephoneId}")
    public Optional<Telephone> getTelephoneById(@PathVariable("telephoneId") Integer id){
        return telephoneService.findById(id);
    }
    @DeleteMapping("/telephone")
    public void deleteTelephone(@RequestParam Integer id){
        telephoneService.deleteTelephoneById(id);
    }

    @PostMapping("/telephone")
    public void addTelephone(@RequestParam Telephone telephone){
        telephoneService.addTelephone(telephone);
    }
}
