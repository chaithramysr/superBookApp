package com.example.superBook.controller;

import com.example.superBook.model.Book;
import com.example.superBook.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

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
    @GetMapping(value = "/getBook/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
         public Book getBook(@PathVariable int id){
        return bookService.getBooks(id);
    }


}
