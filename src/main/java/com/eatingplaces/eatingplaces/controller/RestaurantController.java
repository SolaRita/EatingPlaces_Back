package com.eatingplaces.eatingplaces.controller;



import com.eatingplaces.eatingplaces.model.Restaurant;
import com.eatingplaces.eatingplaces.repository.RestaurantRepository;
import com.eatingplaces.eatingplaces.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/restaurants")

@CrossOrigin
public class RestaurantController {

    @Autowired()
    private RestaurantService restaurantService;


    @PostMapping("/")
    public String add(@RequestBody Restaurant restaurant) {
        restaurantService.saveRestaurant(restaurant);
        return "new restaurant is added";
    }

<<<<<<< HEAD

    @GetMapping()
=======
/*
   @GetMapping("/{id}")
    RestaurantResponseDTO getById(@PathVariable Long id) {
        var restaurantOptional = restaurantRepository.findByid (id);
        var restaurant = restaurantOptional.get();
        var restaurantDTO = new RestaurantResponseDTO().mapFromRestaurant(restaurant);

    }
*/


    @GetMapping("/restaurants")
>>>>>>> component_cardplace
    public List<Restaurant> getAllRestaurants() {
        return restaurantService.getAllRestaurants();
    }
/*    @GetMapping("/{id}")

    public Restaurant getRestaurantById(){
        return restaurantService.getRestaurantById();

    }*/


}
