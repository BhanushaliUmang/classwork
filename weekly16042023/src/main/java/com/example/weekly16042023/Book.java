package com.example.weekly16042023;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Book {
    
    private String title;
    private String bookNumber;
    
    @Autowired // tell Spring to inject an Author bean here
    private Author author;

    public Book(String title, String bookNumber, Author author) {
        this.title = title;
        this.bookNumber = bookNumber;
        this.author = author;
    }
    

    public Book() {
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBookNumber() {
        return bookNumber;
    }

    public void setBookNumber(String bookNumber) {
        this.bookNumber = bookNumber;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    // public Book(String title, String bookNumber) {
    //     this.title = title;
    //     this.bookNumber = bookNumber;
    // }
    
    // public void setTitle(String title) {
    //     this.title = title;
    // }

    // public void setBookNumber(String bookNumber) {
    //     this.bookNumber = bookNumber;
    // }

    // public void setAuthor(Author author) {
    //     this.author = author;
    // }

    // public String getTitle() {
    //     return title;
    // }
    
    // public String getbookNumber() {
    //     return bookNumber;
    // }
    
    // public Author getAuthor() {
    //     return author;
    // }
    
}
