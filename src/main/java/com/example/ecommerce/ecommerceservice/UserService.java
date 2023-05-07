package com.example.ecommerce.ecommerceservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ecommerce.ecommercemodel.User;
import com.example.ecommerce.ecommercerepo.UserRepo;



@Service
public class UserService {


    @Autowired
     UserRepo userrepo;
    public void createUser(User u) {
         userrepo.save(u);
    }

    public List<User> getAllUser() {
        return userrepo.findAll();
    }

    public User getUserById(Integer id){
        return userrepo.findById(id).get();
    }
    
}
