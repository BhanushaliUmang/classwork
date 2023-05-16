package com.example.mapping.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.mapping.model.Book;

@Repository
public interface BookRepo extends JpaRepository<Book,Long>{

    Book findByBookId(Long id);
    
}
