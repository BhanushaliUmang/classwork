package com.example.restaurantmenu.controller;

import java.util.List;
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

import com.example.restaurantmenu.model.Food;
import com.example.restaurantmenu.service.FoodService;

@RestController
@RequestMapping(name="/food")
public class FoodController {
    
    @Autowired
    FoodService foodService;

    @GetMapping(value = "/getFood/{foodId}")
    public Optional<Food> getFood(@PathVariable Long foodId) {
        return foodService.getFoodById(foodId);
    }
    
    @PostMapping(value ="/addFood")
    public ResponseEntity<Food> addFood(@RequestBody Food food) {
        Food addedFood = foodService.addFood(food);
        return ResponseEntity.ok(addedFood);
    }
    
    @PutMapping(value ="/update/{foodId}")
    public ResponseEntity<Food> updateFood(@PathVariable Long foodId, @RequestBody Food food) {
        Food updatedFood = foodService.updateFood(foodId, food);
        if (updatedFood == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(updatedFood);
    }
    
    @DeleteMapping(value ="/delete/{foodId}")
    public void deleteFood(@PathVariable Long foodId) {
        foodService.deleteFood(foodId);
        
    }
}
