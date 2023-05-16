package com.example.mapping.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mapping.dao.AddressRepo;
import com.example.mapping.model.Address;

@Service
public class AddressService {


    @Autowired
     AddressRepo addressRepo;

    public void addAddress(Address address) {
        addressRepo.save(address);
    }

    public List<Address> getAllAddress() {
        return addressRepo.findAll();
    }

    public void updateAddress(Long addressId, Address address) {
        addressRepo.save(address);
    }

    public void deleteAddress(Long addressId) {
        addressRepo.deleteById(addressId);
    }
    
}
