package com.example.ecommerce.ecommercerepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ecommerce.ecommercemodel.Product;

public interface ProductRepo extends JpaRepository<Product,Integer>{
    
}
