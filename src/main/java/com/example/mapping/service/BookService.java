package com.example.mapping.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mapping.dao.BookRepo;
import com.example.mapping.model.Book;

@Service
public class BookService {


    @Autowired
    BookRepo bookRepo;

    public Book getBookById(Long id) {
        return bookRepo.findByBookId(id);
        
    }

    public Book updateBook(Book book) {
        return bookRepo.save(book);
    }

    public Iterable<Book> getAllBooks() {
        return bookRepo.findAll();
    }

    public void addBook(Book book) {
        bookRepo.save(book);
    }

    public void deleteBook(Long id) {
        bookRepo.deleteById(id);
    }
    
}
