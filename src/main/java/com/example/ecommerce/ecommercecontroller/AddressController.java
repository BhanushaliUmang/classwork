package com.example.ecommerce.ecommercecontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.ecommerce.ecommercemodel.Address;
import com.example.ecommerce.ecommerceservice.AddressService;

@RestController
public class AddressController {
    
    @Autowired
     AddressService addressservice;
    @PostMapping("/createaddress")
    public void createAddress(@RequestBody Address addres){
        addressservice.createAddress(addres);

}
}
