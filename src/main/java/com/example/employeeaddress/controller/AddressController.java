package com.example.employeeaddress.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.employeeaddress.dao.AddressRepository;
import com.example.employeeaddress.model.Address;

import jakarta.transaction.Transactional;

@RestController
public class AddressController {
    

    @Autowired
    AddressRepository addressRepository;

    @PostMapping(value = "/addAddress")
    public String addAddress(@RequestBody Address address){
        addressRepository.save(address);
        return "added";
    }

    @GetMapping(value = "/getAllAddress")
    public Iterable<Address> getAllAddress(){
        return addressRepository.findAll();
    }

    @GetMapping(value = "/getAddressById/{addressId}")
    public Optional<Address> getAddressById(@PathVariable Long addressId){
        return addressRepository.findById(addressId);
    }

    @DeleteMapping(value = "/deleteAddress/{addressId}")
    public String deleteAddressById(@PathVariable Long addressId){
        addressRepository.deleteById(addressId);
        return "deleted";
    }

    @Transactional
    @PutMapping(value = "/updateAddress/{addressId}")
    public void updateStockById(@PathVariable Long addressId, @RequestBody Address address)
    {
        addressRepository.updateAddressById(addressId, address.getCity(), address.getState(), address.getStreet(), address.getZipcode());
    }

    

}
