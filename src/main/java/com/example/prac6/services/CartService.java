package com.example.prac6.services;

import com.example.prac6.entities.*;

import java.util.List;

public interface CartService {
    Cart createCart(Client client);
    Cart getCartById(Integer id);
    Cart addItem(Cart cart, Book book);
    Cart addItem(Cart cart, Telephone telephone);
    Cart addItem(Cart cart, WashingMachine washingMachine);
    boolean checkoutOrder(Cart cart);
}
