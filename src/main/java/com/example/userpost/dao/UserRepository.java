package com.example.userpost.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.userpost.model.User;

public interface UserRepository extends JpaRepository<User,Long>{

    User findFirstByEmail(String userEmail);
    
}
