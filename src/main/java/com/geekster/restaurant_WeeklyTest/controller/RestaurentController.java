package com.geekster.restaurant_WeeklyTest.controller;

import com.geekster.restaurant_WeeklyTest.model.Restaurant;
import com.geekster.restaurant_WeeklyTest.service.RestaurentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Restaurent")
public class RestaurentController {

    @Autowired
    RestaurentService restaurentService;

    @PostMapping(value = "/addNewRestaurant")
    public String addNewRestaurant(@RequestBody Restaurant restaurant){
        return restaurentService.addNewRestaurant(restaurant);
    }

    @GetMapping(value = "/restaurantId")
    public Restaurant getRestaurantById(@RequestParam String restaurantId){
        return restaurentService.getRestaurantById(restaurantId);
    }

    @GetMapping(value = "/restaurants")
    public List<Restaurant> getAllRestaurants(){
        return restaurentService.getAllRestaurants();
    }

    @DeleteMapping(value = "/restaurantId/{restaurantId}")
    public String deleteRestaurantById(@PathVariable String restaurantId){
        return restaurentService.deleteRestaurantById(restaurantId);
    }

    @PutMapping(value = "/restaurantId/{restaurantId}")
    public String updateRestaurantById(@PathVariable String restaurantId , @RequestBody Restaurant restaurant){
        return restaurentService.updateRestaurantById(restaurantId , restaurant);
    }



}
