package com.example.prac6.services;

import com.example.prac6.entities.Book;

import java.util.List;
import java.util.Optional;

public interface BookService {
    Book addBook(Book book);
    List<Book> addBooks(List<Book> books);
    void deleteBookById(Integer id);
    Optional<Book> findById(Integer id);
    List<Book> findAll();
}
