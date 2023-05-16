package com.example.mapping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mapping.model.Book;
import com.example.mapping.service.BookService;

@RestController
@RequestMapping("/book")
public class BookController {
    
    @Autowired
    BookService bookService;

    @PostMapping("/add")
    public String addBook(@RequestBody Book book){
        bookService.addBook(book);
        return "Book added successfully";
    }

    @GetMapping("/getAll")
    public Iterable<Book> getAllBooks(){
        return bookService.getAllBooks();
        }

        @PutMapping("/update/{id}")
        public void updateBook(@PathVariable Long id, @RequestBody Book updatedBook) {
            Book book = bookService.getBookById(id);
            
                book.setBookTitle(updatedBook.getBookTitle());
                book.setBookAuthor(updatedBook.getBookAuthor());
                book.setBookDescription(updatedBook.getBookDescription());
                book.setBookPrice(updatedBook.getBookPrice());
                book.setStudent(updatedBook.getStudent());
    
                Book updatedBookEntity = bookService.updateBook(book);
                
            }

            @DeleteMapping("/delete/{id}")
            public void deleteBook(@PathVariable Long id) {
                bookService.deleteBook(id);
                }

}
