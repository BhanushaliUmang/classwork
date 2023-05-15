package com.example.userpost.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.userpost.model.Post;

public interface PostRepository extends JpaRepository<Post,Long>{
    
}
