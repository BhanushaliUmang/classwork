package com.example.mapping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mapping.model.Laptop;
import com.example.mapping.service.LaptopService;

@RestController
@RequestMapping("/laptop")
public class LaptopController {
    

    @Autowired
     LaptopService laptopService;

    @PostMapping("/add")
    public String addLaptop(@RequestBody Laptop laptop){
        laptopService.addLaptop(laptop);
        return "Laptop Successfully Added";
    
    }
    @GetMapping("/getAll")
    public Iterable<Laptop> getAllLaptops(){
        return laptopService.getAllLaptops();
        }

    @DeleteMapping("/delete/{id}")
    public String deleteLaptop(@PathVariable Long laptopId){
        laptopService.deleteLaptop(laptopId);
        return "Laptop Successfully Deleted";
        }

        @PutMapping("/{id}")
        public void updateLaptop(@PathVariable Long id, @RequestBody Laptop updatedLaptop) {
            Laptop laptop = laptopService.getLaptopById(id);
            
                laptop.setLaptopName(updatedLaptop.getLaptopName());
                laptop.setLaptopBrand(updatedLaptop.getLaptopBrand());
                laptop.setLaptopPrice(updatedLaptop.getLaptopPrice());
                laptop.setStudent(updatedLaptop.getStudent());
    
                Laptop updatedLaptopEntity = laptopService.updateLaptop(laptop);
            }
}
