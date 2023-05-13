package com.example.restaurantmenu.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.restaurantmenu.model.Restaurant;
import com.example.restaurantmenu.service.RestaurantService;

@RestController
@RequestMapping(name="/restaurant")
public class RestaurantController {
    
    @Autowired
     RestaurantService restaurantService;

     @GetMapping(value ="/getRestaurant/{restaurantId}")
     public Optional<Restaurant> getRestaurant(@PathVariable Long restaurantId) {
         return restaurantService.getRestaurantById(restaurantId);
     }
     
     @PostMapping(value ="/addrestaurant")
     public String addRestaurant(@RequestBody Restaurant restaurant) {
         restaurantService.addRestaurant(restaurant);
         return "added";
     }
     
     @PutMapping(value ="/updateRestaurant/{restaurantId}")
     public ResponseEntity<Restaurant> updateRestaurant(@PathVariable Long restaurantId, @RequestBody Restaurant restaurant) {
         Restaurant updatedRestaurant = restaurantService.updateRestaurant(restaurantId, restaurant);
         if (updatedRestaurant == null) {
             return ResponseEntity.notFound().build();
         }
         return ResponseEntity.ok(updatedRestaurant);
     }
     
     @DeleteMapping(value ="/deleteRestaurant/{restaurantId}")
     public void deleteRestaurant(@PathVariable Long restaurantId) {
         restaurantService.deleteById(restaurantId);
     }
}
