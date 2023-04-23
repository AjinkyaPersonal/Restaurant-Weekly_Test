package com.geekster.restaurant_WeeklyTest.repo;

import com.geekster.restaurant_WeeklyTest.model.Restaurant;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Repository
public class RestaurentRepo {
    HashMap<String, Restaurant> hm = new HashMap<>();

    public Restaurant getRestaurantById(String restaurantId){
        return hm.getOrDefault(restaurantId, null);
    }

    public String addNewRestaurant(Restaurant restaurant) {
        if(hm.containsKey(restaurant.getRestaurantId() )){
            return "Restaurant with restaurantId "+restaurant.getRestaurantId() + " already present";
        }
        hm.put(restaurant.getRestaurantId() , restaurant);
        return "Restaurant with restaurantId "  +restaurant.getRestaurantId() + " added successfully";
    }

    public List<Restaurant> getAllRestaurants() {
        List<Restaurant> list = new ArrayList<>();

        for(String id : hm.keySet()){
            list.add(hm.get(id));
        }
        return list;
    }

    public String deleteRestaurantById(String restaurantId) {
        if(hm.containsKey(restaurantId)){
            hm.remove(restaurantId);
            return "Restaurant with restaurantId "+restaurantId + " deleted successfully";
        }

        return "Restaurant with restaurantId "+restaurantId + " not found";
    }

    public String updateRestaurantById(String restaurantId, Restaurant restaurant) {
        if(hm.containsKey(restaurantId)){
            Restaurant originalRestaurant = hm.get(restaurantId);
            if(restaurant.getRestaurantName()!=null){
                originalRestaurant.setRestaurantName(restaurant.getRestaurantName());
            }
            if(restaurant.getRestaurantAddress()!=null){
                originalRestaurant.setRestaurantAddress(restaurant.getRestaurantAddress());
            }
            if(restaurant.getPhoneNumber()!=null){
                originalRestaurant.setPhoneNumber(restaurant.getPhoneNumber());
            }
            if(restaurant.getSpecialty()!=null){
                originalRestaurant.setSpecialty(restaurant.getSpecialty());
            }
            if(restaurant.getTotalStaffs()!=null){
                originalRestaurant.setTotalStaffs(restaurant.getTotalStaffs());
            }

            return "Restaurant with restaurantId "+restaurantId + " updated sucessfully";
        }

        return "Restaurant with restaurantId "+restaurantId + " not found";
    }
}
