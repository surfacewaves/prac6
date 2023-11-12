package com.example.prac6.services.implementation;

import com.example.prac6.entities.*;
import com.example.prac6.repositories.CartRepository;
import com.example.prac6.services.BookService;
import com.example.prac6.services.CartService;
import com.example.prac6.services.TelephoneService;
import com.example.prac6.services.WashingMachineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartServiceImpl implements CartService {
    private final CartRepository cartRepository;
    private final BookService bookService;
    private final TelephoneService telephoneService;
    private final WashingMachineService washingMachineService;

    @Autowired
    public CartServiceImpl(CartRepository cartRepository, BookService bookService, TelephoneService telephoneService, WashingMachineService washingMachineService) {
        this.cartRepository = cartRepository;
        this.bookService = bookService;
        this.telephoneService = telephoneService;
        this.washingMachineService = washingMachineService;
    }

    @Override
    public Cart createCart(Client client) {
        Cart cart = new Cart();
        cart.setClient(client);
        System.out.println(cart);
        return cartRepository.save(cart);
    }

    @Override
    public Cart addItem(Cart cart, Book book) {
        cart = cartRepository.save(cart);
        boolean status = book.isAvailable();
        List<Book> bookList = cart.getBookList();
        if (status){
            bookList.add(book);
            cart.setBookList(bookService.addBooks(bookList));
            return cartRepository.save(cart);
        }
        return null;
    }

    @Override
    public Cart addItem(Cart cart, Telephone telephone) {
        cart = cartRepository.save(cart);
        boolean status = telephone.isAvailable();
        List<Telephone> telephoneList = cart.getTelephoneList();
        if (status){
            telephoneList.add(telephone);
            cart.setTelephoneList(telephoneService.addTelephones(telephoneList));
            return cartRepository.save(cart);
        }
        return null;
    }

    @Override
    public Cart addItem(Cart cart, WashingMachine washingMachine) {
        cart = cartRepository.save(cart);
        boolean status = washingMachine.isAvailable();
        List<WashingMachine> washingMachineList = cart.getWashingMachineList();
        if (status){
            washingMachineList.add(washingMachine);
            cart.setWashingMachineList(washingMachineService.addWashingMachines(washingMachineList));
            return cartRepository.save(cart);
        }
        return null;
    }

    @Override
    public Cart getCartById(Integer id) {
        return cartRepository.findById(id).orElse(null);
    }

    @Override
    public boolean checkoutOrder(Cart cart) {
        for (Book book : cart.getBookList()){
            if (!book.isAvailable()){
                return false;
            }
        }
        for (Telephone telephone : cart.getTelephoneList()){
            if (!telephone.isAvailable()){
                return false;
            }
        }
        for (WashingMachine washingMachine : cart.getWashingMachineList()){
            if (!washingMachine.isAvailable()){
                return false;
            }
        }
        cart.setBookList(null);
        cart.setTelephoneList(null);
        cart.setWashingMachineList(null);
        return true;
    }
}
