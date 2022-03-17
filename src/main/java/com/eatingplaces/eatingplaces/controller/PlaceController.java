package com.eatingplaces.eatingplaces.controller;
import com.eatingplaces.eatingplaces.model.Place;
import com.eatingplaces.eatingplaces.service.PlaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/places")

@CrossOrigin
public class PlaceController {

    @Autowired()
    private PlaceService placeService;


    @PostMapping("")
    public String add(@RequestBody Place place) {
        placeService.savePlace(place);
        return "new restaurant is added";
    }


    @GetMapping("")
    public List<Place> getAllPlaces() {
        return placeService.getAllPlaces();
    }


    @GetMapping("/{id}")
    public Place getPlaceById(@PathVariable Long id){
        return placeService.getPlaceById(id);
    }
/*
   @GetMapping("/{id}")
    RestaurantResponseDTO getById(@PathVariable Long id) {
        var restaurantOptional = restaurantRepository.findByid (id);
        var restaurant = restaurantOptional.get();
        var restaurantDTO = new RestaurantResponseDTO().mapFromRestaurant(restaurant);

    }
*/

}
