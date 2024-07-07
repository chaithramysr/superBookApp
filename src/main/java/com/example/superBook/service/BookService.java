package com.example.superBook.service;

import com.example.superBook.model.Book;
import com.example.superBook.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    @Autowired
    BookRepository bookRepository;
    public Book addBookDetails(Book book) {
        return bookRepository.save(book);

    }

    public Book getBooks(int id) {
        return bookRepository.findById(id).get();
    }
}
