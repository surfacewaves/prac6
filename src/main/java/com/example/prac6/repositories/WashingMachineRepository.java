package com.example.prac6.repositories;

import com.example.prac6.entities.WashingMachine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WashingMachineRepository extends JpaRepository<WashingMachine, Integer> {
}
