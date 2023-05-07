package com.example.ecommerce.ecommercecontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.ecommerce.ecommercemodel.User;
import com.example.ecommerce.ecommerceservice.UserService;

@RestController
public class UserController {
    
    @Autowired
     UserService userservice;
    @PostMapping("/createuser")
    public void createUser(@RequestBody User user){
        userservice.createUser(user);

    }

    @GetMapping("/getAllUser")
    public List<User> getAllUser(){
        return userservice.getAllUser();
    }

    @GetMapping("/userid/{id}")
    public User getUserById(@PathVariable Integer id){
        return userservice.getUserById(id);
    }
}
