package com.geekster.restaurant_WeeklyTest.service;

import com.geekster.restaurant_WeeklyTest.model.Restaurant;
import com.geekster.restaurant_WeeklyTest.repo.RestaurentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurentService {

    @Autowired
    RestaurentRepo restaurentRepo;

    public Restaurant getRestaurantById(String id) {
        return restaurentRepo.getRestaurantById(id);
    }

    public String addNewRestaurant(Restaurant restaurant) {
        return restaurentRepo.addNewRestaurant(restaurant);
    }

    public List<Restaurant> getAllRestaurants() {
        return restaurentRepo.getAllRestaurants();
    }

    public String deleteRestaurantById(String restaurantId) {
        return restaurentRepo.deleteRestaurantById(restaurantId);
    }

    public String updateRestaurantById(String restaurantId, Restaurant restaurant) {
        return restaurentRepo.updateRestaurantById(restaurantId , restaurant);
    }
}
