package com.example.ecommerce.ecommerceservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ecommerce.ecommercemodel.Address;
import com.example.ecommerce.ecommercerepo.AddressRepo;

@Service
public class AddressService {
    
    @Autowired
    AddressRepo addressrepo;
    public Address createAddress(Address o) {
        return addressrepo.save(o);
    }
}
