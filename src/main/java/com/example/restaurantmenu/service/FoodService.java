package com.example.restaurantmenu.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.restaurantmenu.dao.FoodRepository;
import com.example.restaurantmenu.model.Food;

@Service
public class FoodService {
    
    @Autowired
     FoodRepository foodRepository;

     public Optional<Food> getFoodById(Long foodId) {
       return foodRepository.findById(foodId);
    }
    
    public Food addFood(Food food) {
        return foodRepository.save(food);
    }
    
    public Food updateFood(Long foodId, Food food) {
        Optional<Food> foodOptional = foodRepository.findById(foodId);
        if (foodOptional.isPresent()) {
            Food existingFood = foodOptional.get();
            existingFood.setName(food.getName());
            existingFood.setPrice(food.getPrice());
            existingFood.setRestaurant(food.getRestaurant());
            return foodRepository.save(existingFood);
        }
        return null;
    }
    
    public void deleteFood(Long foodId) {
        foodRepository.deleteById(foodId);
    }
}
