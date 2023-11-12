package com.example.prac6.entities;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @OneToMany
    private List<Book> bookList;

    @OneToMany
    private List<Telephone> telephoneList;

    @OneToMany
    private List<WashingMachine> washingMachineList;

    @OneToOne
    @JoinColumn(name = "client_id")
    private Client client;

}
