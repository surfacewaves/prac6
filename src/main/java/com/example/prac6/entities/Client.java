package com.example.prac6.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String name;
    private String email;
    private String login;
    private String password;

//    @OneToOne(mappedBy = "client")
//    @JoinColumn(name = "cart_id")
//    @JsonIgnore
//    private Cart cart;

}
