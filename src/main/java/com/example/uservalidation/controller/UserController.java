package com.example.uservalidation.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.uservalidation.model.Users;
import com.example.uservalidation.service.UserService;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class UserController {
    

    @Autowired
    UserService userService;

    @PostMapping(value="/sendUser")
    public String addUser(@Valid @RequestBody Users user) {
         return userService.addUser(user);        
        
    }

    @GetMapping(value = "/getAllUsers")
    public List<Users> getAllUsers()
    {
        return userService.getAllUsers();
    }


    @GetMapping(value = "/getUserById/{id}")
    public Users getUserById(@PathVariable String id)
    {
        return userService.getUserById(id);
    }

    @DeleteMapping(value = "/deleteTodoById/{id}")
    public String deleteUserById(@PathVariable String id)
    {
        return userService.deleteUserById(id);
    }

    

    @PutMapping(value = "/updateUserById/{id}")
    public String updateUserById(@PathVariable String id, @RequestBody Users user)
    {
        return userService.updateTodoById(id,user);
    }
}
