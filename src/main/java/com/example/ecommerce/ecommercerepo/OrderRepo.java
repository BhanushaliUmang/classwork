package com.example.ecommerce.ecommercerepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ecommerce.ecommercemodel.Orders;

public interface OrderRepo extends JpaRepository<Orders,Integer>{
    
}
