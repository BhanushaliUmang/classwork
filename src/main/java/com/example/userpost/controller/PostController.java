package com.example.userpost.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.userpost.model.Post;
import com.example.userpost.service.PostService;

@RestController
@RequestMapping("/post")
public class PostController{
    

    @Autowired
    PostService postService;

    @PostMapping("/add")
    public String addPost(@RequestBody Post post){
        postService.addPost(post);
        return "saved";
    }

    @GetMapping("/getPost")
    public List<Post> getAllPost(){
        return postService.getAllPost();
    }
}
