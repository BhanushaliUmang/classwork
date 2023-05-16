package com.example.mapping.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.mapping.model.Laptop;

@Repository
public interface LaptopRepo extends JpaRepository<Laptop,Long>{

    Laptop findByLaptopId(Long id);
    
}
