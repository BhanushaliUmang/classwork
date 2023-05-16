package com.example.mapping.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mapping.dao.LaptopRepo;
import com.example.mapping.model.Laptop;
@Service
public class LaptopService {

    @Autowired
    LaptopRepo laptopRepo;

    public void addLaptop(Laptop laptop) {
        laptopRepo.save(laptop);

    }

    public Iterable<Laptop> getAllLaptops() {
        return laptopRepo.findAll();
    }

    public void deleteLaptop(Long laptopId) {
        laptopRepo.deleteById(laptopId);
    }

    public Laptop getLaptopById(Long id) {
        return laptopRepo.findByLaptopId(id);
        
    }

    public Laptop updateLaptop(Laptop laptop) {
        return laptopRepo.save(laptop);
    }
    
}
