package com.eatingplaces.eatingplaces.service;
import com.eatingplaces.eatingplaces.model.Restaurant;
import org.springframework.stereotype.Service;

import java.util.List;


public interface RestaurantService  {
    public Restaurant saveRestaurant (Restaurant restaurant);
    public List<Restaurant> getAllRestaurants();
/*    public Restaurant getRestaurantById ();*/


}
