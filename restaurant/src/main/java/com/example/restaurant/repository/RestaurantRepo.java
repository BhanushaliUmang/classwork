package com.example.restaurant.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.restaurant.model.Restaurant;

@Repository
public class RestaurantRepo {

    private List<Restaurant> restaurantList ;

    public RestaurantRepo(){
        restaurantList = new ArrayList<>();
        
        restaurantList.add(new Restaurant("1", "Dominos", "Bhuj", "9988774587", "Pizza", "15"));
        restaurantList.add(new Restaurant("2", "Punjab da Dhaba", "Mandvi", "8897458756", "Punjabi", "27"));
        restaurantList.add(new Restaurant("3", "Santosh", "Ahmedabad", "8855447896", "Gujarati", "21"));
    }

    public List<Restaurant> getAllRestaurant() {
        return restaurantList;
    }

    public Boolean save(Restaurant restaurant) {
        restaurantList.add(restaurant);
        return true;
    }

    public Boolean remove(Restaurant restaurant) {
        restaurantList.remove(restaurant);
        
        return true;
    }

    public Boolean update(Restaurant restaurant, Restaurant restaurant1) {
        restaurantList.remove(restaurant1);
        restaurantList.add(restaurant);
        return true;
    }

    


    
}
