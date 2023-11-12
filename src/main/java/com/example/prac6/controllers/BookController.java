package com.example.prac6.controllers;

import com.example.prac6.entities.Book;
import com.example.prac6.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class BookController {
    private final BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/book")
    public List<Book> getBooks(){
        return bookService.findAll();
    }
    @GetMapping("/book/{bookId}")
    public Optional<Book> getBookById(@PathVariable("bookId") Integer id){
        return bookService.findById(id);
    }
    @DeleteMapping("/book")
    public void deleteBook(@RequestParam Integer id){
        bookService.deleteBookById(id);
    }

    @PostMapping("/book")
    public void addBook(@RequestBody Book book){
        System.out.println(book);
        bookService.addBook(book);
    }

}
