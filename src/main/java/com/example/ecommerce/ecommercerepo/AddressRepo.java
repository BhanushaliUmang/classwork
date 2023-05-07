package com.example.ecommerce.ecommercerepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ecommerce.ecommercemodel.Address;

public interface AddressRepo extends JpaRepository<Address,Integer>{
    
}
