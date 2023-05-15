package com.example.userpost.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.userpost.model.AuthenticationToken;
import com.example.userpost.model.User;

public interface TokenRepo extends JpaRepository<AuthenticationToken,Long>{

    AuthenticationToken findByUser(User user);

    AuthenticationToken findFirstByToken(String token);
    
}
