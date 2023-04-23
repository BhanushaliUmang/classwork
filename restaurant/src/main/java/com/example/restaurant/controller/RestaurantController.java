package com.example.restaurant.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.restaurant.model.Restaurant;
import com.example.restaurant.service.RestaurantService;

@RestController
public class RestaurantController {
    
    @Autowired
    RestaurantService service;

    @GetMapping(value = "/restaurant/All")
    public List<Restaurant> getAllRestaurant(){
        return service.getAllRestaurant();
    }

    @GetMapping(value = "/restaurant/{id}")
    public Restaurant getRestaurantById(@PathVariable String id){
        return service.getRestaurantById(id);
    }

    @PostMapping(value="/restaurant")
    public String addRestaurant(@RequestBody Restaurant restaurant) {
         return service.addRestaurant(restaurant);        
    }

    @DeleteMapping(value = "/restaurant/{id}")
    public String deleteRestaurantById(@PathVariable String id)
    {
        return service.deleteRestaurantById(id);
    }

    @PutMapping(value = "/restaurant/{id}")
    public String updateRestaurantById(@PathVariable String id, @RequestBody Restaurant restaurant)
    {
        return service.updateRestaurantById(id,restaurant);
    }
}
