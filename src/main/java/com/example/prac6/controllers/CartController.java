package com.example.prac6.controllers;

import com.example.prac6.entities.*;
import com.example.prac6.services.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CartController {
    private final CartService cartService;

    @Autowired
    public CartController(CartService cartService) {
        this.cartService = cartService;
    }

    @GetMapping("/cart/{id}")
    public Cart getCart(@PathVariable("id") Integer id){
        System.out.println(cartService.getCartById(id));
        return cartService.getCartById(id);
    }

    @PostMapping("/cart")
    public Cart addCart(@RequestBody Client client){
        return cartService.createCart(client);
    }

    @PostMapping("/cart/{id}/book")
    public Cart addBook(@PathVariable("id") Integer id,
                        @RequestBody Book book){
        System.out.println(book);
        return cartService.addItem(cartService.getCartById(id), book);
    }

    @PostMapping("/cart/{id}/telephone")
    public Cart addTelephone(@PathVariable("id") Integer id,
                        @RequestBody Telephone telephone){
        System.out.println(telephone);
        return cartService.addItem(cartService.getCartById(id), telephone);
    }

    @PostMapping("/cart/{id}/washingmachine")
    public Cart addTelephone(@PathVariable("id") Integer id,
                             @RequestBody WashingMachine washingMachine){
        System.out.println(washingMachine);
        return cartService.addItem(cartService.getCartById(id), washingMachine);
    }

    @PostMapping("/cart/{id}/checkout")
    public boolean checkoutOrder(@PathVariable("id") Integer id){
        return cartService.checkoutOrder(cartService.getCartById(id));
    }
}
