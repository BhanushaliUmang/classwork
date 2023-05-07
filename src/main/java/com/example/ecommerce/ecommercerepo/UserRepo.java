package com.example.ecommerce.ecommercerepo;

// import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ecommerce.ecommercemodel.User;

@Repository
public interface UserRepo extends JpaRepository<User,Integer>{
    
}
