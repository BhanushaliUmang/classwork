package com.example.restaurant.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.restaurant.model.Restaurant;
import com.example.restaurant.repository.RestaurantRepo;

@Service
public class RestaurantService {

    @Autowired
    RestaurantRepo repo;

    public List<Restaurant> getAllRestaurant() {
        return repo.getAllRestaurant();
    }

    public Restaurant getRestaurantById(String id) {
        List<Restaurant> restaurantList = repo.getAllRestaurant();

        for(Restaurant restaurant : restaurantList){
            if(restaurant.getId().equals(id)){
                return restaurant;
            }
        }
        return null;
    }

    public String addRestaurant(Restaurant restaurant) {
        Boolean insert = repo.save(restaurant);

        if(insert){
            return "added";
        }
        else{
            return "Failed";
        }
    }

    public String deleteRestaurantById(String id) {
        Boolean deleteresponse = false;

        String status;
        if(id != null)
        {
            List<Restaurant> restaurantList =  repo.getAllRestaurant();

            for(Restaurant restaurant : restaurantList)
            {
                if(restaurant.getId().equals(id))
                {
                    deleteresponse = repo.remove(restaurant);
                    if(deleteresponse)
                    {
                        status = "Restaurant with id: " + id + " was deleted";
                    }
                    else
                    {
                        status = "Restaurant with id: " + id + " was not deleted";
                    }
                    return status;
                }
            }

            return "Restaurant with id: " + id + " does not exist";

        }
        else
        {
            return "Cannot accept Null ID";
        }

    }

    public String updateRestaurantById(String id, Restaurant restaurant) {
        Boolean updateRestaurant = false;
        String status;

        if(id !=null){
            List<Restaurant> restaurantList =  repo.getAllRestaurant();

            for(Restaurant restaurant1 : restaurantList){

                if(restaurant1.getId().equals(id)){

                    updateRestaurant = repo.update(restaurant,restaurant1);
                    if(updateRestaurant)
                    {
                        status = "Restaurant with id: " + id + " was updated";
                    }
                    else
                    {
                        status = "Restaurant with id: " + id + " was not updated";
                    }
                    return status;
                }
            }
            return "Restaurant with id: " + id + " does not exist";
        }

        else
        {
            return "Cannot accept Null ID";
        }
    }
    
}
