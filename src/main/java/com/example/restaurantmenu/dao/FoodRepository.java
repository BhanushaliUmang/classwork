package com.example.restaurantmenu.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.restaurantmenu.model.Food;

@Repository
public interface FoodRepository extends JpaRepository<Food, Long> {
    
}
