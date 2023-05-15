package com.example.userpost.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.userpost.dto.SignInInput;
import com.example.userpost.dto.SignInOutput;
import com.example.userpost.dto.SignUpInput;
import com.example.userpost.dto.SignUpOutput;
import com.example.userpost.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
    
    @Autowired
    UserService userService;

    // signUp

    @PostMapping("/signup")
    public SignUpOutput signup(@RequestBody SignUpInput signUpDto)
    {
        return userService.signUp(signUpDto);
    }

    @PostMapping("/signin")
    public SignInOutput signup(@RequestBody SignInInput signInDto)
    {
        return userService.signIn(signInDto);
    }
}
