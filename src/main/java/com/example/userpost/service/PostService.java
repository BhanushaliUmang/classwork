package com.example.userpost.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.userpost.dao.PostRepository;
import com.example.userpost.model.Post;

@Service
public class PostService {
    
    @Autowired
    PostRepository postRepository;

    public void addPost(Post post) {
        postRepository.save(post);
    }

    public List<Post> getAllPost() {
        return postRepository.findAll();
    }
}
