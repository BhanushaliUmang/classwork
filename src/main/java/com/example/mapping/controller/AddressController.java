package com.example.mapping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mapping.model.Address;
import com.example.mapping.service.AddressService;

@RestController
@RequestMapping("/address")
public class AddressController {
    
    @Autowired
    AddressService addressService;

    @PostMapping("/add")
    public String addAddress(@RequestBody Address address){
        addressService.addAddress(address);
        return "Address added successfully";
    }

    @GetMapping("/getAll")
    public List<Address> getAllAddress(){
        return addressService.getAllAddress();
    }

    @PutMapping("/update/{AddressId}")
    public void updateAddress(@PathVariable Long AddressId,@RequestBody Address address){
        addressService.updateAddress(AddressId,address);
    }

    @DeleteMapping("/delete/{AddressId}")
    public void deleteAddress(@PathVariable Long AddressId){
        addressService.deleteAddress(AddressId);
    }
}
