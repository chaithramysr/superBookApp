package com.example.superBook.controller;

import com.example.superBook.model.Book;
import com.example.superBook.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
     private BookService bookService;

    @GetMapping("/")
    public String greet() {
        return "welcome to superBook";
    }
    @PostMapping(value ="/addBook",consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
        public Book addBook(@RequestBody Book book) {
            return bookService.addBookDetails(book);
        }

}
