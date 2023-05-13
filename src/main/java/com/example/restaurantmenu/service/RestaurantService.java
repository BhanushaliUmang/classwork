package com.example.restaurantmenu.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.restaurantmenu.dao.RestaurantRepository;
import com.example.restaurantmenu.model.Restaurant;

@Service
public class RestaurantService {
    
    @Autowired
     RestaurantRepository restaurantRepository;

     public Optional<Restaurant> getRestaurantById(Long restaurantId) {
        return restaurantRepository.findById(restaurantId);
    }
    
    public void addRestaurant(Restaurant restaurant) {
         restaurantRepository.save(restaurant);
    }
    
    public Restaurant updateRestaurant(Long restaurantId, Restaurant restaurant) {
        Optional<Restaurant> restaurantOptional = restaurantRepository.findById(restaurantId);
        if (restaurantOptional.isPresent()) {
            Restaurant existingRestaurant = restaurantOptional.get();
            existingRestaurant.setName(restaurant.getName());
            existingRestaurant.setAddress(restaurant.getAddress());
            existingRestaurant.setMenu(restaurant.getMenu());
            return restaurantRepository.save(existingRestaurant);
        }
        return null;
    }
    
   

    public void deleteById(Long restaurantId) {
         restaurantRepository.deleteById(restaurantId);
    }
}
