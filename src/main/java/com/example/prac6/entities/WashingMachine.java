package com.example.prac6.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class WashingMachine {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String manufacturer;
    private Integer capacity;
    private String name;
    private String type;
    private Integer sellerNumber;
    private Integer price;
    private boolean isAvailable;
}
