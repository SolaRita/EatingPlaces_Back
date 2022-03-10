package com.eatingplaces.eatingplaces.service;

import com.eatingplaces.eatingplaces.model.Restaurant;
import com.eatingplaces.eatingplaces.repository.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Service
public class RestaurantServiceImpl implements RestaurantService {
    @Autowired
    private RestaurantRepository restaurantRepository;

    @Override
    public Restaurant saveRestaurant(Restaurant restaurant) {
       return restaurantRepository.save(restaurant);
    }

    @Override
    public List<Restaurant> getAllRestaurants(){return restaurantRepository.findAll();}

/*    @Override
    public Restaurant getRestaurantById() {return restaurantRepository.findById();}*/


}
